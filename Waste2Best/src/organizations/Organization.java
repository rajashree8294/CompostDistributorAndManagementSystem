/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package organizations;

import business.models.Role.Role;
import business.models.User.UserCatalog;
import java.util.ArrayList;


/**
 *
 * @author Rajashree
 */
public abstract class Organization {

    private String name;
    private workQueue workQueue;
   
    private UserCatalog userCatalog;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Distributor("Distributor Organization"), Lab("Lab Organization"), Supplier("Supplier Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new workQueue();
       
        userCatalog = new UserCatalog();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserCatalog getUserAccountDirectory() {
        return userCatalog;
    }

    public int getOrganizationID() {
        return organizationID;
    }


    
    public String getName() {
        return name;
    }

    public workQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(workQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
