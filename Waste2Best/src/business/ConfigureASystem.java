/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import business.models.Employee.Employee;
import business.models.Product.Seed;
import business.models.Product.SeedList;
import business.models.Role.SupplierRole;
import business.models.Role.SystemAdminRole;
import network.Network;
import business.models.User.Supplier;

/**
 *
 * @author Rajashree
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){

        Ecosystem system = Ecosystem.getInstance();
        
        Network network = system.createAndAddNetwork();
        network.setName("Boston");

        Employee employee = system.getEmployeeDirectory().createEmployee("ARA");

        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", "sysadmin", "NEU", employee, new SystemAdminRole());
        
        Employee employeeSup = system.getEmployeeDirectory().createEmployee("Supp");

        Supplier supplier = (Supplier)system.getUserAccountDirectory().createUserAccount("Supplier", "Supplier", "Supplier", "NEU", employeeSup, new SupplierRole());
        SeedList SeedInventory = new SeedList();
        //Seed blueBerry = new Seed();
        //blueBerry.setQuantity(18);
        SeedInventory.createSeed(0, 19, "Berry", "BlueBerry", 0);
        SeedInventory.createSeed(0, 21, "Berry", "StrawBerry", 0);
        supplier.setSeedList(SeedInventory);
        return system;
    }
}
