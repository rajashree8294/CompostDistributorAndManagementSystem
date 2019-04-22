/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.models.Product.SeedList;
import business.models.Role.Role;
import java.util.ArrayList;
import network.Network;
import organizations.Organization;

/**
 *
 * @author Aditya
 */
public class Ecosystem extends Organization{
    
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    private SeedList seedList;
    public Ecosystem() {
        super(null);
        networkList=new ArrayList<Network>();
        seedList = new SeedList();
    }
    
    public static Ecosystem getInstance(){
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
