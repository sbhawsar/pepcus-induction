package com.pepcus.core.concept.exception;


public class InternalServerError extends ApplicationException {
  private static final long serialVersionUID = 1L;

  public InternalServerError() {
    super(APIStatus.INTERNAL_SERVER_ERROR);
  }

  public InternalServerError(String msg) {
    super(APIStatus.INTERNAL_SERVER_ERROR, msg);
  }

}
