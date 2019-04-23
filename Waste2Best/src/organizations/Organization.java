/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package organizations;

import business.models.Employee.EmployeeDirectory;
import business.models.Role.Role;
import business.models.User.UserDirectory;
import business.models.workQueue.workQueue;

import java.util.ArrayList;


/**
 *
 * @author Rajashree
 */
public abstract class Organization {

    private String name;
    private workQueue workQueue;
    private EmployeeDirectory employeeDirectory;
   
    private UserDirectory userCatalog;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Distributor("Distributor Organization"), Lab("Lab Organization"), Supplier("Supplier Organization"), Farmer("Farmer Organization"),Customer("Customer Organization");
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
        employeeDirectory = new EmployeeDirectory();
        userCatalog = new UserDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserDirectory getUserAccountDirectory() {
        return userCatalog;
    }

    public int getOrganizationID() {
        return organizationID;
    }
   public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
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
