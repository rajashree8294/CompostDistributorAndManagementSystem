/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;

import java.util.ArrayList;

/**
 *
 * @author tinyteddybear
 */
public class SupplierCatalog {
    private ArrayList<Supplier> supplierCatalog;

    public ArrayList<Supplier> getSupplierCatalog() {
        return supplierCatalog;
    }

    public void setSupplierCatalog(ArrayList<Supplier> supplierCatalog) {
        this.supplierCatalog = supplierCatalog;
    }
    
    public Supplier addSupplier()
    {
        Supplier s = new Supplier();
        supplierCatalog.add(s);
        return s;
    }
    
    public void deleteSupplier(Supplier s)
    {
        supplierCatalog.remove(s);
    }
    
}
