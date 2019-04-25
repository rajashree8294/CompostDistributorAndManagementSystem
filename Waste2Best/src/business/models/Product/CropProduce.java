/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.Product;

/**
 *
 * @author Aditya
 */
public class CropProduce extends Product {
    
    private String name;
    private double expenses;
    private double compostRequired;
    private double cropQuantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


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

    public double getCropQuantity() {
        return cropQuantity;
    }

    public void setCropQuantity(double cropQuantity) {
        this.cropQuantity = cropQuantity;
    }
    
    
    
}
