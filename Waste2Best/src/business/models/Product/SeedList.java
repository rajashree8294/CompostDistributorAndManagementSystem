/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.Product;

import java.util.ArrayList;

/**
 *
 * @author tinyteddybear
 */
public class SeedList {
    
    private ArrayList<Seed> seedList;
    
    public SeedList()
    {
        
        seedList = new ArrayList();
    }
    

    public ArrayList<Seed> getSeedList() {
        return seedList;
    }

    public void setSeedList(ArrayList<Seed> seedList) {
        this.seedList = seedList;
    }
    public Seed createSeed(double price,int quantity , String type,String name, double totalPrice){
        Seed seed = new Seed();
        seed.setPrice(price);
        seed.setQuantity(quantity);
        seed.setName(name);
        seed.setType(type);
        seed.settPrice(totalPrice);

        seedList.add(seed);
        return seed;
    }
    
}
