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
     String firstName;
    String lastName;
   String userName;
   Contact contact;
   Recipe recipe;
  
   Recipe title;
   Recipe number_of_Servings;
   Recipe glutenFree;
   Recipe difficultyLevel;
   Recipe number_of_Ingridients;
   Recipe foodCategory;
   Recipe description;
   Recipe recipePicture;
  
   Contact emailId;
   Contact phone;
   
   
   public Chef(){
       this.firstName="";
       this.lastName="";
       this.userName="";
       
       this.title = new Recipe();
       this.number_of_Servings = new Recipe();
       this.glutenFree = new Recipe();
       this.difficultyLevel = new Recipe();
       this.number_of_Ingridients = new Recipe();
       this.foodCategory = new Recipe();
       this.description = new Recipe();
       this.recipePicture = new Recipe();
       
       this.phone = new Contact();
       this.emailId = new Contact();
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public Recipe getTitle() {
        return title;
    }

    public Recipe getNumber_of_Servings() {
        return number_of_Servings;
    }

    public Recipe getGlutenFree() {
        return glutenFree;
    }

    public Recipe getDifficultyLevel() {
        return difficultyLevel;
    }

    public Recipe getNumber_of_Ingridients() {
        return number_of_Ingridients;
    }

    public Recipe getFoodCategory() {
        return foodCategory;
    }

    public Recipe getDescription() {
        return description;
    }

    public Recipe getRecipePicture() {
        return recipePicture;
    }

    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTitle(Recipe title) {
        this.title = title;
    }

    public void setNumber_of_Servings(Recipe number_of_Servings) {
        this.number_of_Servings = number_of_Servings;
    }

    public void setGlutenFree(Recipe glutenFree) {
        this.glutenFree = glutenFree;
    }

    public void setDifficultyLevel(Recipe difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void setNumber_of_Ingridients(Recipe number_of_Ingridients) {
        this.number_of_Ingridients = number_of_Ingridients;
    }

    public void setFoodCategory(Recipe foodCategory) {
        this.foodCategory = foodCategory;
    }

    public void setDescription(Recipe description) {
        this.description = description;
    }

    public void setRecipePicture(Recipe recipePicture) {
        this.recipePicture = recipePicture;
    }

    public Contact getEmailId() {
        return emailId;
    }

    public Contact getPhone() {
        return phone;
    }

    public void setEmailId(Contact emailId) {
        this.emailId = emailId;
    }

    public void setPhone(Contact phone) {
        this.phone = phone;
    }
    
    public void setRecipe(Recipe rec){
        this.recipe = rec;
    }

    
    
}
