/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.Role;

import business.Ecosystem;
import business.models.User.User;
import enterprise.Enterprise;
import javax.swing.JPanel;
import organizations.CustomerOrganization;
import organizations.Organization;
import userInterface.CustomerRole.CustomerWorkAreaJPanel;

/**
 *
 * @author Aditya
 */
public class CustomerRole extends Role {
    
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new CustomerWorkAreaJPanel(userProcessContainer,account,(CustomerOrganization)organization,enterprise, business);
    }
    
}
