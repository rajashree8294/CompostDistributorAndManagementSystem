/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;


import business.models.Product.Seed;
import business.models.Product.Tumbler;
import java.util.ArrayList;

/**
 *
 * @author tinyteddybear
 */
public class Supplier extends User{
    private ArrayList<Seed> seedDirectory;
    private ArrayList<Tumbler> tumblerDirectory;

    public ArrayList<Seed> getSeedDirectory() {
        return seedDirectory;
    }

    public void setSeedDirectory(ArrayList<Seed> seedDirectory) {
        this.seedDirectory = seedDirectory;
    }

    public ArrayList<Tumbler> getTumblerDirectory() {
        return tumblerDirectory;
    }

    public void setTumblerDirectory(ArrayList<Tumbler> tumblerDirectory) {
        this.tumblerDirectory = tumblerDirectory;
    }
    
    
    
}
