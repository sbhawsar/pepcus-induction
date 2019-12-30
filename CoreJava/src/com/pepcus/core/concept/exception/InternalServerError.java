package com.pepcus.core.concept.exception;

/**
 * Exception class to handle Internal Server Error
 * @author Surabhi.Bhawsar
 *
 */
public class InternalServerError extends ApplicationException {
  
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor
   */
  public InternalServerError() {
    super(APIStatus.INTERNAL_SERVER_ERROR);
  }

  /**
   * Constructor to set custom error message
   * @param msg
   */
  public InternalServerError(String msg) {
    super(APIStatus.INTERNAL_SERVER_ERROR, msg);
  }

}
