/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package organizations;

import business.models.Role.DistributorRole;
import business.models.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rajashree
 */
public class DistributorOrganization extends Organization {



    public DistributorOrganization() {
        super(Organization.Type.Distributor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorRole());
        return roles;
    }
     
   
    
    
}