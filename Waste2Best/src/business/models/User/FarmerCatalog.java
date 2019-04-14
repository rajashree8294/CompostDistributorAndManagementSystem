/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;

import java.util.ArrayList;

/**
 *
 * @author tinyteddybear
 */
public class FarmerCatalog {
    private ArrayList<Farmer> farmerCatalog;

    public ArrayList<Farmer> getFarmerCatalog() {
        return farmerCatalog;
    }

    public void setFarmerCatalog(ArrayList<Farmer> farmerCatalog) {
        this.farmerCatalog = farmerCatalog;
    }
    
    public Farmer addFarmer()
    {
        Farmer f = new Farmer();
        farmerCatalog.add(f);
        return f;
    }
    
    public void deleteFarmer(Farmer f)
    {
        farmerCatalog.remove(f);
    }
}
