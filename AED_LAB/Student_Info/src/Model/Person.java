/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author rutuj
 */
public class Person {
    String id;
    String firstName;
    String lastName;
    String collegeName;
    Address permAddress;
    Address currAddress;
    Contact persContact;
    Contact offContact;
    
    public Person(){
        this.id="";
        this.firstName = "";
        this.lastName="";
        this.collegeName="";
        this.permAddress=new Address();
        this.currAddress=new Address();
        this.offContact=new Contact();
        this.persContact=new Contact();
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setPermAddress(Address permAddress) {
        this.permAddress = permAddress;
    }

    public void setCurrAddress(Address currAddress) {
        this.currAddress = currAddress;
    }

    public void setPersContact(Contact persContact) {
        this.persContact = persContact;
    }

    public void setOffContact(Contact offContact) {
        this.offContact = offContact;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public Address getPermAddress() {
        return permAddress;
    }

    public Address getCurrAddress() {
        return currAddress;
    }

    public Contact getPersContact() {
        return persContact;
    }

    public Contact getOffContact() {
        return offContact;
    }

   
   
    
}
