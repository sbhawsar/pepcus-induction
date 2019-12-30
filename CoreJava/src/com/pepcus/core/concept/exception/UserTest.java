package com.pepcus.core.concept.exception;

public class UserTest {

  public static void main(String[] args) {
    try {
      User user = setupUserData(5, "John", 1); // Parameters are : userId, userName, age

      if (user.getAge() <= 0) {
        throw new BadRequestException("Age must be valid number");
        //throw new BadRequestException();
      }

      if (user.getUserId() == null) {
        throw new ResourceNotFoundException("User Id is not found in the system");
        // throw new ResourceNotFoundException();
      }

      saveUser(user);
      
    } catch (ApplicationException e) {
      System.out.println("Status code : "+e.getStatusCode().getStatus());
      System.out.println("Status  : "+e.getStatusCode());
      System.out.println("Error Message : "+ e.getMessage());
    }
  }


  public static User setupUserData(Integer userId, String userName, Integer age) {
    User user = new User();
    user.setUserId(userId);
    user.setUserName(userName);
    user.setAge(age);
    return user;
  }

  public static User saveUser(User user) {
    throw new InternalServerError("Error occured while saving user record"); 
  }

}
