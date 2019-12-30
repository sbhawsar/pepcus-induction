package com.pepcus.core.concept.exception;

/**
 * Enum to hold Status code 
 * @author Surabhi.bhawsar
 *
 */
public enum APIStatus {

  //####################################################################################
  //           CLIENT SPECIFIC - ERROR STATUS CODES &  Default Message
  //####################################################################################
  
  BAD_REQUEST(400, "Bad or missing data in request"), 
  NOT_FOUND(404, "Data Not Found for request"),
  INTERNAL_SERVER_ERROR(500, "Internal server error.");

  private Integer status;
  private String message;

  /**
   * Method to set status code & message
   * @param status
   * @param message
   */
  private APIStatus(Integer status, String message) {
    this.status = status;
    this.message = message;
  }

  /**
   * @return the status
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * @param status the status to set
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * @param message the message to set
   */
  public void setMessage(String message) {
    this.message = message;
  }

}
