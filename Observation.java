/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rutuj
 */
public class Observation {
    int ObsId;
    private double bloodPress;
    private double Temp;
    private Medicine medication;
    public Observation(){
        this.medication = new Medicine();
    }

    public void setMedication(Medicine medication) {
        this.medication = medication;
    }

    public Medicine getMedication() {
        return medication;
    }

    public int getObsId() {
        return ObsId;
    }

    public double getBloodPress() {
        return bloodPress;
    }

    public double getTemp() {
        return Temp;
    }

    public void setObsId(int ObsId) {
        this.ObsId = ObsId;
    }

    public void setBloodPress(double bloodPress) {
        this.bloodPress = bloodPress;
    }

    public void setTemp(double Temp) {
        this.Temp = Temp;
    }
    @Override
    public String toString(){
        return String.valueOf(this.ObsId);
    }
    
}
