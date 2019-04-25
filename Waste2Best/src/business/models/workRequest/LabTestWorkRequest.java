/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.workRequest;

import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class LabTestWorkRequest extends WorkRequest {
    
      private float nitrogen;
      private float potassium;
      private float phosphorous;
      private ArrayList<String> metalContents;
      private String result;
      
        public LabTestWorkRequest(){
        metalContents = new ArrayList<>();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
      

    public float getNitrogen() {
        return nitrogen;
    }

    public void setNitrogen(float nitrogen) {
        this.nitrogen = nitrogen;
    }

    public float getPotassium() {
        return potassium;
    }

    public void setPotassium(float potassium) {
        this.potassium = potassium;
    }

    public float getPhosphorous() {
        return phosphorous;
    }

    public void setPhosphorous(float phosphorous) {
        this.phosphorous = phosphorous;
    }

    public ArrayList getMetalContents() {
        return metalContents;
    }

    public void addMetalContents(String metalName) {
        
        metalContents.add(metalName);
    }

    public String getCompostUserName() {
        return compostUserName;
    }

    public void setCompostUserName(String compostUserName) {
        this.compostUserName = compostUserName;
    }
      
      private String compostUserName;
      

  
    
}
