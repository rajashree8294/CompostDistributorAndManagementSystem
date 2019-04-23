/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package organizations;

import business.models.Role.Role;
import business.models.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Rajashree
 */
public class SupplierOrganization extends Organization {

  public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierRole());
        return roles;
    }
    
}
