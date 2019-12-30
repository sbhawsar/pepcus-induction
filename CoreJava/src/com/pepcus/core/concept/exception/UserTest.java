package com.pepcus.core.concept.exception;

/**
 * UserTest Class to verify concept of exception handling
 * @author Surabhi.Bhawsar
 *
 */
public class UserTest {

  public static void main(String[] args) {
    try {
      
      // Setup User Data, Parameters are : userId, userName, age
      User user = UserService.setupUserData(null, "John", 5);
      
      // Validate User Data
      UserService.validateUserData(user);

      // Get User Details to save
      user = UserService.getUserDetails(user);
      
      // Save User Details
      UserService.saveUser(user);
      
    } catch (ApplicationException e) {
      System.out.println("Status code : "+e.getStatusCode().getStatus());
      System.out.println("Status  : "+e.getStatusCode());
      System.out.println("Error Message : "+ e.getMessage());
    }
  }


}
