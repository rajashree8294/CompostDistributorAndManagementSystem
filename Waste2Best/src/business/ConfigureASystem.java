/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import business.models.Employee.Employee;
import business.models.Role.AdminRole;

/**
 *
 * @author Rajashree
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){

        Ecosystem system = Ecosystem.getInstance();

        Employee employee = system.getEmployeeDirectory().createEmployee("ARA");

        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", "sysadmin", "NEU", employee, new AdminRole());

        return system;
    }
}
