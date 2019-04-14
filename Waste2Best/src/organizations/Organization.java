/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package organizations;

import business.models.User.Role;
import business.models.User.UserCatalog;
import java.util.ArrayList;
import business.models.workQueue.WorkQueue;

/**
 *
 * @author Rajashree
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
   
    private UserCatalog userCatalog;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization");
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
        workQueue = new WorkQueue();
       
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

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
