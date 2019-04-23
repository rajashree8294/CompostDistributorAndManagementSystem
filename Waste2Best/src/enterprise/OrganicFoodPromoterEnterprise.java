/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise;

import business.models.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class OrganicFoodPromoterEnterprise extends Enterprise {
    public OrganicFoodPromoterEnterprise(String name){
        super(name,EnterpriseType.OrganicFoodPromotor);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
