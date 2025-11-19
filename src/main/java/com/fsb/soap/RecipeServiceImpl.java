package com.fsb.soap;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.fsb.soap.RecipeService")
public class RecipeServiceImpl implements RecipeService {

    private static List<Recipe> recipeList = new ArrayList<>();
    static {
        recipeList.add(new Recipe(1, "Couscous", "Semolina, Lamb, Veggies", "15 TND"));
        recipeList.add(new Recipe(2, "Lablabi", "Chickpeas, Bread, Egg", "4 TND"));
    }

    @Override
    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
        System.out.println("Server: Added recipe " + recipe.getName());
    }

    @Override
    public Recipe getRecipe(int id) {
        return recipeList.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Recipe> getAllRecipes() {
        return recipeList;
    }
}