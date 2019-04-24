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
        
        return system;
    }
}
