/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.models.User;

import business.models.Employee.Employee;
import business.models.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class UserDirectory {
    private ArrayList<User> userAccountList;

    public UserDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userAccountList;
    }
    
    public User authenticateUser(String username, String password){
        for (User ua : userAccountList)
            if (ua.getUserID().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
     public User createUserAccount(String name,String username, String password,String location, Employee employee, Role role){
        User user = new User();
        user.setName(name);
        user.setUserID(username);
        user.setPassword(password);
        user.setLocation(location);
        user.setEmployee(employee);
        
        user.setRole(role);
        userAccountList.add(user);
        return user;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (User ua : userAccountList ){
            if (ua.getUserID().equals(username))
                return false;
        }
        return true;
    }
}
