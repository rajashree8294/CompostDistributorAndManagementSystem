/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;


import business.models.Product.CropProduce;
import java.util.ArrayList;

/**
 *
 * @author tinyteddybear
 */
public class Farmer extends User{
    private ArrayList<CropProduce> cropDirectory;
    private int investment;
    private int profit;

    public ArrayList<CropProduce> getCropDirectory() {
        return cropDirectory;
    }

    public void setCropDirectory(ArrayList<CropProduce> cropDirectory) {
        this.cropDirectory = cropDirectory;
    }

    public int getInvestment() {
        return investment;
    }

    public void setInvestment(int investment) {
        this.investment = investment;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
    
    
}
