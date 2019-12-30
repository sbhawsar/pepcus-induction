package com.pepcus.core.concept.exception;

/**
 * Class to hold User related attributes & their access methods
 * 
 * @author Surabhi.Bhawsar
 */
public class User {

  private Integer userId;
  private String userName;
  private Integer age;

  /**
   * @return the userId
   */
  public Integer getUserId() {
    return userId;
  }

  /**
   * @param userId the userId to set
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }

  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * @return the age
   */
  public Integer getAge() {
    return age;
  }

  /**
   * @param age the age to set
   */
  public void setAge(Integer age) {
    this.age = age;
  }

}
