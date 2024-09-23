/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ayushighia
 */
public class VitalSignaHistory {
     ArrayList<VitalSigns> history;
     
     public VitalSignaHistory(){
         history = new ArrayList<VitalSigns>();
     }
         
         public VitalSigns addNewVitals(){
            VitalSigns newVs = new VitalSigns();
            history.add(newVs);
            return newVs;
         
     }

     public void removeVitals(VitalSigns vs){
      history.remove(vs);
     }
     

    public ArrayList<VitalSigns> getHistory(){
    return history;
    }
             
    
}
