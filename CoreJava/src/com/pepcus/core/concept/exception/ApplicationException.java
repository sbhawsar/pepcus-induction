package com.pepcus.core.concept.exception;


public class ApplicationException extends RuntimeException {

  private static final long serialVersionUID = 1L;
  private APIStatus statusCode;
  private String errorMessage;


  public APIStatus getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(APIStatus statusCode) {
    this.statusCode = statusCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ApplicationException(String msg) {
    super(msg);
    this.errorMessage = msg;
  }

  
  public ApplicationException(APIStatus apiStatus) {
    super(apiStatus.getMessage());
    this.errorMessage = apiStatus.getMessage();
    this.statusCode = apiStatus;
  }

  public ApplicationException(APIStatus apiStatus, String message) {
    super(message);
    this.errorMessage = message;
    this.statusCode = apiStatus;
  }

  public static ApplicationException createInternalServerError() {
    ApplicationException exception = new ApplicationException(APIStatus.INTERNAL_SERVER_ERROR.getMessage());
    exception.setStatusCode(APIStatus.INTERNAL_SERVER_ERROR);
    return exception;
  }

  public static ApplicationException createInternalServerError(String error) {
    ApplicationException exception = new ApplicationException(error);
    exception.setStatusCode(APIStatus.INTERNAL_SERVER_ERROR);
    return exception;
  }
  
}
