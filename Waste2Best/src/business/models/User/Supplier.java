/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;


import business.models.Product.Seed;
import business.models.Product.SeedList;
import business.models.Product.Tumbler;
import business.models.Product.TumblerList;
import java.util.ArrayList;

/**
 *
 * @author tinyteddybear
 */
public class Supplier extends User{
    private SeedList seedList;
    private TumblerList tumblerList;

    public SeedList getSeedList() {
        return seedList;
    }

    public void setSeedList(SeedList seedList) {
        this.seedList = seedList;
    }

    public TumblerList getTumblerList() {
        return tumblerList;
    }

    public void setTumblerList(TumblerList tumblerList) {
        this.tumblerList = tumblerList;
    }
   
}
