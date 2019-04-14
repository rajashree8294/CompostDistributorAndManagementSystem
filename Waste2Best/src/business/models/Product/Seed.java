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
public class Seed extends Product {
    
    
    private String seedId;
    private int seedQuantity;
    private float unit;
    private double price;

    public String getSeedId() {
        return seedId;
    }

    public void setSeedId(String seedId) {
        this.seedId = seedId;
    }

    public int getSeedQuantity() {
        return seedQuantity;
    }

    public void setSeedQuantity(int seedQuantity) {
        this.seedQuantity = seedQuantity;
    }

    public float getUnit() {
        return unit;
    }

    public void setUnit(float unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    

}
