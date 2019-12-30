package com.pepcus.core.concept.exception;


public class ResourceNotFoundException extends ApplicationException {
  private static final long serialVersionUID = 1L;

  public ResourceNotFoundException() {
    super(APIStatus.NOT_FOUND);
  }

  public ResourceNotFoundException(String msg) {
    super(APIStatus.NOT_FOUND, msg);
  }

}
