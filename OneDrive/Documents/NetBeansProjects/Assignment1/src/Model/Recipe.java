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
    String title;
    Long no_of_servings;
    boolean gluten;
    float level;
    long no_of_ingredients;
    String category;
    String descp;
    //picture
   
    public Recipe(){
        this.title ="";
        this.category = "";
        this.descp="";
    }

    public String getTitle() {
        return title;
    }

    public Long getNo_of_servings() {
        return no_of_servings;
    }

    public boolean isGluten() {
        return gluten;
    }

    public float getLevel() {
        return level;
    }

    public long getNo_of_ingredients() {
        return no_of_ingredients;
    }

    public String getCategory() {
        return category;
    }

    public String getDescp() {
        return descp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNo_of_servings(Long no_of_servings) {
        this.no_of_servings = no_of_servings;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public void setLevel(float level) {
        this.level = level;
    }

    public void setNo_of_ingredients(long no_of_ingredients) {
        this.no_of_ingredients = no_of_ingredients;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }
    
}
