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
public class SellCropProduceWorkRequest extends WorkRequest {
    
    private String cropName;
    private int cropQuantity;
    private double price;
    private double expenses;
    private double compostRequired;

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getCompostRequired() {
        return compostRequired;
    }

    public void setCompostRequired(double compostRequired) {
        this.compostRequired = compostRequired;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCropQuantity() {
        return cropQuantity;
    }

    public void setCropQuantity(int cropQuantity) {
        this.cropQuantity = cropQuantity;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }
}
