/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enterprise;

import business.models.Product.ProductDirectory;
import organizations.Organization;
import organizations.OrganizationDirectory;

/**
 *
 * @author Rajashree
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private ProductDirectory productDirectory;

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        OrganicFoodPromotor("Organic Crop Promotor & Producer");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        productDirectory = new ProductDirectory();
    }
}
