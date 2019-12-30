package com.pepcus.core.concept.exception;

/**
 * Exception class to handle Bad Request Exception
 * @author Surabhi.Bhawsar
 *
 */
public class BadRequestException extends ApplicationException {
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor
   */
  public BadRequestException() {
    super(APIStatus.BAD_REQUEST);
  }

  /**
   * Constructor to set custom error message
   * @param msg
   */
  public BadRequestException(String msg) {
    super(APIStatus.BAD_REQUEST, msg);
  }

}
