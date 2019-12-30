package com.pepcus.core.concept.exception;

/**
 * UserService Class 
 * @author Surabhi.Bhawsar
 *
 */
public class UserService {

  /**
   * Method to setup User Data
   * @param userId
   * @param userName
   * @param age
   * @return
   */
  public static User setupUserData(Integer userId, String userName, Integer age) {
    User user = new User();
    user.setUserId(userId);
    user.setUserName(userName);
    user.setAge(age);
    return user;
  }

  /**
   * Method to validate User Data
   * @param user
   */
  public static void validateUserData(User user) {
    
    // Check User Age : Age should be valid positive number
    if (user.getAge() <= 0) {
      throw new BadRequestException("Age must be valid number"); // Throw BadRequestException with custom message
      //throw new BadRequestException(); // Throw BadRequestException with default error message
    }
  }

  /**
   * Method to save User Data
   * @param user
   * @return
   */
  public static User saveUser(User user) {
    throw new InternalServerError("Error occured while saving user record"); 
  }
  
  /**
   * Method to Get User Details
   * @param user
   * @return
   */
  public static User getUserDetails(User user) {
    
    if (user.getUserId() == null) {
      throw new ResourceNotFoundException("User Id is not found in the system"); // Throw ResourceNotFoundException with  custom message
      // throw new ResourceNotFoundException(); // Throw ResourceNotFoundException with default error message
    }
    return user;
  }
}
