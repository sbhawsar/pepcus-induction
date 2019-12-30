package com.pepcus.core.concept.exception;


public class BadRequestException extends ApplicationException {
  private static final long serialVersionUID = 1L;

  public BadRequestException() {
    super(APIStatus.BAD_REQUEST);
  }

  public BadRequestException(String msg) {
    super(APIStatus.BAD_REQUEST, msg);
  }

}
