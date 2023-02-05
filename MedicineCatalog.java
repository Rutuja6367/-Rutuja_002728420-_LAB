/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.MedicineCatalog to edit this template
 */
package Model;
import java.util.ArrayList;
import Model.Medicine;

/**
 *
 * @author rutuj
 */
public class MedicineCatalog {
      ArrayList<Medicine> medicineList;
    
    public MedicineCatalog(){
        this.medicineList = new ArrayList();
    }
    
  public Medicine createmedicine (String name, double dosage){
      Medicine med = new Medicine();
      med.setDosage(dosage);
      med.setMedicineName(name);
      
      this.medicineList.add(med);
      return med;
  } 
  public Boolean checkIfMedUnique(String name){
      for(Medicine med : this.medicineList){
          if(med.getMedicineName().equals(name)){
              return false;
          }
      }
      return true;
  }
  
  public void removeMedicine(String n){
      for(Medicine med: this.medicineList)    {
          if(med.getMedicineName().equals(n)){
              this.medicineList.remove(med);
              break;
          }
      }  
  }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }
}
