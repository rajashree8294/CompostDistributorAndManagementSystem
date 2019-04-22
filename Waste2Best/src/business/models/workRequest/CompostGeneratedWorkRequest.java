/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.workRequest;

/**
 *
 * @author Aditya
 */
public class CompostGeneratedWorkRequest extends WorkRequest{
    
    private int compostQuantity;
    private String  compostUserName;

    public int getCompostQuantity() {
        return compostQuantity;
    }

    public void setCompostQuantity(int compostQuantity) {
        this.compostQuantity = compostQuantity;
    }

    public String getCompostUserName() {
        return compostUserName;
    }

    public void setCompostUserName(String compostUserName) {
        this.compostUserName = compostUserName;
    }
    
}
