/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package organizations;

import java.util.ArrayList;
import organizations.Organization.Type;

/**
 *
 * @author Rajashree
 */
public class OrganizationCatalog {
    
    private ArrayList<Organization> organizationList;

    public OrganizationCatalog() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Lab.getValue())){
             organization = new LabOrganization();
           
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Distributor.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}