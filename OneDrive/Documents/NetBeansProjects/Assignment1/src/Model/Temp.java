/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.List;
import java.util.ArrayList;
import Model.Recipe;
import Model.Contact;

/**
 *
 * @author rutuj
 */
public class Temp {  //services
   
    private final ArrayList<Recipe> recipes = new ArrayList<>();
    private final ArrayList<Contact> con = new ArrayList<>();
    
    public void saveRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    public void saveContact(Contact c){
        this.con.add(c);
    }

public void updateRecipe(Recipe recipe,String title,long serv,Boolean gluten,float level,long num_ind,String categ, String desc,String mail,long phone) {
    // fetch recipe based on id, and then replace with the updated recipe object
    
    for(Recipe i: recipes){
        if(i.getRecipeTitle() == title){
            i.setNumber_of_Servings(serv);
            i.setGlutenFree(gluten);
            i.setDifficultyLevel(level);
            i.setNumber_of_Ingridients(num_ind);
            i.setFoodCategory(categ);
            i.setDescription(desc);    
        }
        updateContactDetails(mail,phone);
    }
}
public void updateContactDetails(String mail, Long phone){
    for(Contact c : con){
        c.setId(mail);
        c.setPhone(0);
    }
    
}

/*public void read() {
    // iterate the recipes list, and display each recipe object
    for(Recipe i : recipes){
        display();
    }*/
}
//public void display(){
    /* jLabel14.setText(this.chef.getFname());
        jLabel15.setText(this.chef.getLname());
        jLabel16.setText(this.chef.getUsername());
        jLabel19.setText(this.chef.getRecipe().getTitle());
        jLabel20.setText(String.valueOf(this.chef.getRecipe().getNo_of_servings()));
       //CHECK jLabel21.setText(String.valueOf(this.chef.getRecipe().isGluten()));
      //  jLabel22.setText(this.chef.getRecipe().getLevel());
        jLabel23.setText(String.valueOf(this.chef.getRecipe().getNo_of_ingredients()));
        jLabel24.setText(String.valueOf(this.chef.getCategory()));
        jLabel25.setText(this.chef.getRecipe().getDescp());
        jLabel26.setText(this.chef.getContact().getId(  ));
        jLabel26.setText(String.valueOf(this.chef.getContact().getPhone()));*/


