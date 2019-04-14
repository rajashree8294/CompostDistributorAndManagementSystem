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
public class CustomerCatalog {
    private ArrayList <Customer> customerCatalog;

    public ArrayList<Customer> getCustomerCatalog() {
        return customerCatalog;
    }

    public void setCustomerCatalog(ArrayList<Customer> customerCatalog) {
        this.customerCatalog = customerCatalog;
    }
    
    public Customer addCustomer()
    {
        Customer c = new Customer();
        customerCatalog.add(c);
        return c;
    }
    
    public void deleteCustomer(Customer c)
    {
        customerCatalog.remove(c);
    }
    
}
