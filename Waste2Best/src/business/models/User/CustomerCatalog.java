/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;

import business.models.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tinyteddybear
 */
public class CustomerCatalog {
/*    ArrayList <Customer> customerList; 

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer()
    {
        Customer c = new Customer();
        customerList.add(c);
        return c;
    }
    
    public void deleteDistributor(Customer c)
    {
        customerList.remove(c);
    }
*/
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    private ArrayList<Customer> customerAccountList;

    public CustomerCatalog() {
        customerAccountList = new ArrayList();
    }

    public ArrayList<Customer> getcustomerAccountList() {
        return customerAccountList;
    }
    
    public User authenticateUser(String username, String password){
        for (Customer cu : customerAccountList)
            if (cu.getUserID().equals(username) && cu.getPassword().equals(password)){
                return cu;
            }
        return null;
    }
    
     public Customer createCustomerAccount(String name,String username, String password,String location){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setUserID(username);
        customer.setPassword(password);
        customer.setLocation(location);
        

        customerAccountList.add(customer);
        return customer;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Customer cu : customerAccountList ){
            if (cu.getUserID().equals(username))
                return false;
        }
        return true;
    }
}


