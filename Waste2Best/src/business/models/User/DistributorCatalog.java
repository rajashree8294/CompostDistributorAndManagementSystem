/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.models.User;

import java.util.ArrayList;

/**
 *
 * @author Rajashree
 */
public class DistributorCatalog {
    private ArrayList<Distributor> distributorCatalog;

    public ArrayList<Distributor> getDistributorCatalog() {
        return distributorCatalog;
    }

    public void setDistributorCatalog(ArrayList<Distributor> distributorCatalog) {
        this.distributorCatalog = distributorCatalog;
    }
    
    public Distributor addDistributor()
    {
        Distributor d = new Distributor();
        distributorCatalog.add(d);
        return d;
    }
    
    public void deleteDistributor(Distributor d)
    {
        distributorCatalog.remove(d);
    }
    
}
