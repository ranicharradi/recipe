
package com.fsb.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fsb.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddRecipe_QNAME = new QName("http://soap.fsb.com/", "addRecipe");
    private final static QName _GetAllRecipes_QNAME = new QName("http://soap.fsb.com/", "getAllRecipes");
    private final static QName _GetAllRecipesResponse_QNAME = new QName("http://soap.fsb.com/", "getAllRecipesResponse");
    private final static QName _GetRecipeResponse_QNAME = new QName("http://soap.fsb.com/", "getRecipeResponse");
    private final static QName _GetRecipe_QNAME = new QName("http://soap.fsb.com/", "getRecipe");
    private final static QName _Recipe_QNAME = new QName("http://soap.fsb.com/", "recipe");
    private final static QName _AddRecipeResponse_QNAME = new QName("http://soap.fsb.com/", "addRecipeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fsb.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddRecipe }
     * 
     */
    public AddRecipe createAddRecipe() {
        return new AddRecipe();
    }

    /**
     * Create an instance of {@link GetAllRecipes }
     * 
     */
    public GetAllRecipes createGetAllRecipes() {
        return new GetAllRecipes();
    }

    /**
     * Create an instance of {@link GetAllRecipesResponse }
     * 
     */
    public GetAllRecipesResponse createGetAllRecipesResponse() {
        return new GetAllRecipesResponse();
    }

    /**
     * Create an instance of {@link GetRecipeResponse }
     * 
     */
    public GetRecipeResponse createGetRecipeResponse() {
        return new GetRecipeResponse();
    }

    /**
     * Create an instance of {@link Recipe }
     * 
     */
    public Recipe createRecipe() {
        return new Recipe();
    }

    /**
     * Create an instance of {@link GetRecipe }
     * 
     */
    public GetRecipe createGetRecipe() {
        return new GetRecipe();
    }

    /**
     * Create an instance of {@link AddRecipeResponse }
     * 
     */
    public AddRecipeResponse createAddRecipeResponse() {
        return new AddRecipeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.fsb.com/", name = "addRecipe")
    public JAXBElement<AddRecipe> createAddRecipe(AddRecipe value) {
        return new JAXBElement<AddRecipe>(_AddRecipe_QNAME, AddRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRecipes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.fsb.com/", name = "getAllRecipes")
    public JAXBElement<GetAllRecipes> createGetAllRecipes(GetAllRecipes value) {
        return new JAXBElement<GetAllRecipes>(_GetAllRecipes_QNAME, GetAllRecipes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRecipesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.fsb.com/", name = "getAllRecipesResponse")
    public JAXBElement<GetAllRecipesResponse> createGetAllRecipesResponse(GetAllRecipesResponse value) {
        return new JAXBElement<GetAllRecipesResponse>(_GetAllRecipesResponse_QNAME, GetAllRecipesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.fsb.com/", name = "getRecipeResponse")
    public JAXBElement<GetRecipeResponse> createGetRecipeResponse(GetRecipeResponse value) {
        return new JAXBElement<GetRecipeResponse>(_GetRecipeResponse_QNAME, GetRecipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.fsb.com/", name = "getRecipe")
    public JAXBElement<GetRecipe> createGetRecipe(GetRecipe value) {
        return new JAXBElement<GetRecipe>(_GetRecipe_QNAME, GetRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.fsb.com/", name = "recipe")
    public JAXBElement<Recipe> createRecipe(Recipe value) {
        return new JAXBElement<Recipe>(_Recipe_QNAME, Recipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.fsb.com/", name = "addRecipeResponse")
    public JAXBElement<AddRecipeResponse> createAddRecipeResponse(AddRecipeResponse value) {
        return new JAXBElement<AddRecipeResponse>(_AddRecipeResponse_QNAME, AddRecipeResponse.class, null, value);
    }

}
