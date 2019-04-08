/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models;

/**
 *
 * @author Aditya
 */
public class CropProduce {
    
    private String name;
    private String cropId;
    private float expenses;
    private float compostRequired;
    private float cropQuantity;
    private double cropPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCropId() {
        return cropId;
    }

    public void setCropId(String cropId) {
        this.cropId = cropId;
    }

    public float getExpenses() {
        return expenses;
    }

    public void setExpenses(float expenses) {
        this.expenses = expenses;
    }

    public float getCompostRequired() {
        return compostRequired;
    }

    public void setCompostRequired(float compostRequired) {
        this.compostRequired = compostRequired;
    }

    public float getCropQuantity() {
        return cropQuantity;
    }

    public void setCropQuantity(float cropQuantity) {
        this.cropQuantity = cropQuantity;
    }

    public double getCropPrice() {
        return cropPrice;
    }

    public void setCropPrice(double cropPrice) {
        this.cropPrice = cropPrice;
    }
    
    
    
    
}
