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
import organizations.DistributorOrganization;
import organizations.Organization;
import userInterface.DistributorRole.DistributorWorkAreaJPanel;

/**
 *
 * @author Aditya
 */
public class DistributorRole extends Role {
    


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return  new DistributorWorkAreaJPanel(userProcessContainer, account, (DistributorOrganization) organization, enterprise);
    }
    
    
}
