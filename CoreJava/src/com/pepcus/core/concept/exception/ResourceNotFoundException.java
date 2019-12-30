package com.pepcus.core.concept.exception;

/**
 * Exception class to handle Resource Not Found Exception
 * @author Surabhi.Bhawsar
 *
 */
public class ResourceNotFoundException extends ApplicationException {
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor
   */
  public ResourceNotFoundException() {
    super(APIStatus.NOT_FOUND);
  }

  /**
   * Constructor to set custom error message
   * @param msg
   */
  public ResourceNotFoundException(String msg) {
    super(APIStatus.NOT_FOUND, msg);
  }

}
