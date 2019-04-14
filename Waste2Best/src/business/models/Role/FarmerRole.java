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
import organizations.LabOrganization;
import organizations.Organization;

/**
 *
 * @author Aditya
 */
public class FarmerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Organization organization, Enterprise enterprise, Ecosystem business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   /*  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, (LabOrganization)organization, enterprise);
    }*/
}
