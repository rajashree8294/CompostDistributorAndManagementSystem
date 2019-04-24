/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package organizations;

import business.models.Role.LabAssistantRole;
import business.models.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rajashree
 */
public class LabOrganization extends Organization{

    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }
     
   
    
    
}
