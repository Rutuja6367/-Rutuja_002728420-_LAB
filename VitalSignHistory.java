package Model;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rutuj
 */
public class VitalSignHistory {
    ArrayList<Observation> vitalSignHistory;
    
    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<Observation>();
    }
    
    public Observation createObservation(int observationId, double bloodPress, double temp){
        Observation obs = new Observation();
        obs.setBloodPress(bloodPress);
        obs.setTemp(temp);
        obs.setObsId(observationId);
        
        this.vitalSignHistory.add(obs);
        
        return obs;
    }
    //check
    public boolean checkObservationIdUnique(int Id){
        for(Observation o: this.vitalSignHistory){
            if(o.getObsId() == Id){
                return false;
            }
            
        }  
        return false;
    }
        

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public Observation findObs(int id){
        for(Observation o : this.vitalSignHistory){
          if(o.getObsId() == id){
              return o;
          }
        }
        return null;
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }
  
}
