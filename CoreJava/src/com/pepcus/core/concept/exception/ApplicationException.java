package com.pepcus.core.concept.exception;

/**
 * Custom exception class to handle Application Exception
 * @author Surabhi.Bhawsar
 *
 */
public class ApplicationException extends RuntimeException {


  private static final long serialVersionUID = 1L;
  private APIStatus apiStatus;
  private String errorMessage;

  /**
   * Constructor to set message
   * @param msg
   */
  public ApplicationException(String msg) {
    super(msg);
    this.errorMessage = msg;
  }

  /**
   * Constructor to set API Status
   * @param msg
   */
  public ApplicationException(APIStatus apiStatus) {
    super(apiStatus.getMessage());
    this.errorMessage = apiStatus.getMessage();
    this.apiStatus = apiStatus;
  }

  /**
   * Constructor to set API Status & message
   * @param apiStatus
   * @param message
   */
  public ApplicationException(APIStatus apiStatus, String message) {
    super(message);
    this.errorMessage = message;
    this.apiStatus = apiStatus;
  }
  
  /**
   * @return the statusCode
   */
  public APIStatus getStatusCode() {
    return apiStatus;
  }


  /**
   * @param statusCode the statusCode to set
   */
  public void setStatusCode(APIStatus statusCode) {
    this.apiStatus = statusCode;
  }


  /**
   * @return the errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }


  /**
   * @param errorMessage the errorMessage to set
   */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


}
