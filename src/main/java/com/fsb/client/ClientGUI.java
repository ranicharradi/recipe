package com.fsb.client;
import com.fsb.client.generated.Recipe;
import com.fsb.client.generated.RecipeService;
import com.fsb.client.generated.RecipeServiceImplService;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ClientGUI extends JFrame {

    private JTextField nameField, priceField, ingredientsField;
    private JTable recipeTable;
    private DefaultTableModel tableModel;

    private RecipeService proxy;

    public ClientGUI() {
        try {

            RecipeServiceImplService service = new RecipeServiceImplService();
            proxy = service.getRecipeServiceImplPort();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error connecting to server: " + e.getMessage());
        }

        setTitle("FSB Recipe Manager (SOAP Client)");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("New Recipe"));

        inputPanel.add(new JLabel("Recipe Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Ingredients:"));
        ingredientsField = new JTextField();
        inputPanel.add(ingredientsField);

        inputPanel.add(new JLabel("Price:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        JButton addButton = new JButton("Add Recipe");
        addButton.addActionListener(e -> addRecipeAction());
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);

        String[] columns = {"ID", "Name", "Ingredients", "Price"};
        tableModel = new DefaultTableModel(columns, 0);
        recipeTable = new JTable(tableModel);
        add(new JScrollPane(recipeTable), BorderLayout.CENTER);

        JButton refreshButton = new JButton("Refresh List");
        refreshButton.addActionListener(e -> refreshListAction());
        add(refreshButton, BorderLayout.SOUTH);

        refreshListAction();
    }

    private void addRecipeAction() {
        try {
            Recipe newRecipe = new Recipe();
            newRecipe.setId((int) (Math.random() * 1000));
            newRecipe.setName(nameField.getText());
            newRecipe.setIngredients(ingredientsField.getText());
            newRecipe.setPrice(priceField.getText());
            proxy.addRecipe(newRecipe);
            JOptionPane.showMessageDialog(this, "Recipe Added!");
            nameField.setText("");
            ingredientsField.setText("");
            priceField.setText("");
            refreshListAction();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding recipe.");
        }
    }

    // Action: Get data from Server
    private void refreshListAction() {
        try {
            tableModel.setRowCount(0);
            List<Recipe> recipes = proxy.getAllRecipes();

            for (Recipe r : recipes) {
                Object[] row = {r.getId(), r.getName(), r.getIngredients(), r.getPrice()};
                tableModel.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClientGUI().setVisible(true));
    }
}