/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;

import business.models.Product.Tumbler;
import java.util.ArrayList;

/**
 *
 * @author tinyteddybear
 */
public class Customer extends User{
    private  ArrayList<Tumbler> tumbler;
    private String registrationNumber;
    private int rewardPoints;

    

    public ArrayList<Tumbler> getTumbler() {
        return tumbler;
    }

    public void setTumbler(ArrayList<Tumbler> tumbler) {
        this.tumbler = tumbler;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
    
    
}
