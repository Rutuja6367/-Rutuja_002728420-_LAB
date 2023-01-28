/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rutuj
 */
public class Recipe {
  public  String recipeTitle;
    Long number_of_Servings;
    boolean glutenFree;
    float difficultyLevel;
    long number_of_Ingridients;
    String foodCategory;
    String description;
    //picture
   
    public Recipe(){
        this.recipeTitle ="";
        this.foodCategory = "";
        this.description="";
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public Long getNumber_of_Servings() {
        return number_of_Servings;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public float getDifficultyLevel() {
        return difficultyLevel;
    }

    public long getNumber_of_Ingridients() {
        return number_of_Ingridients;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public void setNumber_of_Servings(Long number_of_Servings) {
        this.number_of_Servings = number_of_Servings;
    }

    public void setGlutenFree(boolean glutenFree) {
       
        this.glutenFree = true;
        }
    

    public void setDifficultyLevel(float difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void setNumber_of_Ingridients(long number_of_Ingridients) {
        this.number_of_Ingridients = number_of_Ingridients;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
