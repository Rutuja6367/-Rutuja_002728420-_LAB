/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author rutuj
 */
public class DeliveryPackage {
    int packageId;
    double packageWeight;
    ArrayList<Product>productList;
    Product prod;
    Customer customer;
    
    public DeliveryPackage(){
        this.prod = new Product();
        this.customer = new Customer();
        this.productList = new ArrayList();
        
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPackageId() {
        return packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public Product getProd() {
        return prod;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    
    
    
    public Product createProduct(int prodId, String prodName, double price){
        Product prod = new Product();
        prod.setProductId(prodId);
        prod.setProdName(prodName);
        prod.setPrice(price);
        
        this.productList.add(prod);
        
        return prod;
    }
    
    public Product findProduct(int pid){
        for(Product prod : this.productList){
            if(prod.getProductId() == pid){
                return prod;
            }
        }
            return null;
        }
    
    
}
