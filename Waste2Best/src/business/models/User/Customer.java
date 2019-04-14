/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;

import business.models.CropProduce;
import business.models.Tumbler;
import java.util.ArrayList;

/**
 *
 * @author tinyteddybear
 */
public class Customer {
    private  ArrayList<Tumbler> tumbler;
    private int registrationNumber;
    private int rewardPoints;

    public ArrayList<Tumbler> getTumbler() {
        return tumbler;
    }

    public void setTumbler(ArrayList<Tumbler> tumbler) {
        this.tumbler = tumbler;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
    
    
}
