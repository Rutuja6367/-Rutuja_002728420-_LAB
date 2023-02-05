/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Medicine to edit this template
 */
package Model;

/**
 *
 * @author rutuj
 */
public class Medicine {
    String medicineName;
    double dosage;
    
    public Medicine(){
        
    }

    public String getMedicineName() {
        return medicineName;
    }

    public double getDosage() {
        return dosage;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }
    @Override 
    public String toString(){
     return String.valueOf(this.dosage);
    }
    
}
