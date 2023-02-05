/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Application to edit this template
 */
package Model;

import Model.VitalSignHistory;

public class Application {
   VitalSignHistory history;
MedicineCatalog catalog;
/**
 *
 * @author rutuj
 */
public Application(){
this.catalog = new MedicineCatalog();
this.history = new VitalSignHistory();
} 

    public void setHistory(VitalSignHistory history) {
        this.history = history;
    }

    public void setCatalog(MedicineCatalog catalog) {
        this.catalog = catalog;
    }

    public VitalSignHistory getHistory() {
        return history;
    }

    public MedicineCatalog getCatalog() {
        return catalog;
    }
}
