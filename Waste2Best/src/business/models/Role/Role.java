/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.Role;

import business.models.User.User;
import javax.swing.JPanel;
import organizations.Organization;
import business.Ecosystem;
import enterprise.Enterprise;

/**
 *
 * @author tinyteddybear
 */
public abstract class Role {
     public enum RoleType{
        Admin("Admin"),
        Supplier("Supplier"),
        Distributor("Distributor"),
        LabAssistant("Lab Assistant"),
        Customer("Customer"),
         Farmer("Farmer");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
     
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User user, 
            Organization organization, 
            Enterprise enterprise, 
            Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
