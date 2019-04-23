/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizations;

import business.models.Role.FarmerRole;
import business.models.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class FarmerOrganization extends Organization {
      public FarmerOrganization() {
        super(Organization.Type.Farmer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FarmerRole());
        return roles;
    }
}
