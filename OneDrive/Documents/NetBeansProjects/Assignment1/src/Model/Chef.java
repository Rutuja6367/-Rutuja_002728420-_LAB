/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Contact;
import Model.Recipe;
/**
 *
 * @author rutuj
 */
public class Chef {
   private  String fname;
   private String lname;
   String username;
   Contact contact;
   Recipe recipe;
  
   Recipe title;
   Recipe servings;
   Recipe gluten;
   Recipe level;
   Recipe number;
   Recipe category;
   Recipe descp;
   Recipe pic;
  
   Contact id;
   Contact phone;
   
   
   public Chef(){
       this.fname="";
       this.lname="";
       this.username="";
       
       this.title = new Recipe();
       this.servings = new Recipe();
       this.gluten = new Recipe();
       this.level = new Recipe();
       this.number = new Recipe();
       this.category = new Recipe();
       this.descp = new Recipe();
       this.pic = new Recipe();
       
       this.phone = new Contact();
       this.id = new Contact();
   }
   
   public Contact getContact(){
       return contact;
   } 
   
   public void setContact(Contact c){
       this.contact = c;
   }
   
   public Recipe getRecipe(){
       return recipe;
   }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getUsername() {
        return username;
    }

    public Recipe getTitle() {
        return title;
    }

    public Recipe getServings() {
        return servings;
    }

    public Recipe getGluten() {
        return gluten;
    }

    public Recipe getLevel() {
        return level;
    }

    public Recipe getNumber() {
        return number;
    }

    public Recipe getCategory() {
        return category;
    }

    public Recipe getDescp() {
        return descp;
    }

    public Recipe getPic() {
        return pic;
    }

    

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTitle(Recipe title) {
        this.title = title;
    }

    public void setServings(Recipe servings) {
        this.servings = servings;
    }

    public void setGluten(Recipe gluten) {
        this.gluten = gluten;
    }

    public void setLevel(Recipe level) {
        this.level = level;
    }

    public void setNumber(Recipe number) {
        this.number = number;
    }

    public void setCategory(Recipe category) {
        this.category = category;
    }

    public void setDescp(Recipe descp) {
        this.descp = descp;
    }

    public void setPic(Recipe pic) {
        this.pic = pic;
    }

    public Contact getId() {
        return id;
    }

    public Contact getPhone() {
        return phone;
    }

    public void setId(Contact id) {
        this.id = id;
    }

    public void setPhone(Contact phone) {
        this.phone = phone;
    }
    
    public void setRecipe(Recipe rec){
        this.recipe = rec;
    }

    
    
}
