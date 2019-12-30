package com.pepcus.core.concept.exception;

public enum APIStatus {

  BAD_REQUEST(400, "Bad or missing data in request"), 
  NOT_FOUND(404, "Data Not Found for request"),
  INTERNAL_SERVER_ERROR(500, "Internal server error.");

  private Integer status;
  private String message;

  private APIStatus(Integer status, String message) {
    this.status = status;
    this.message = message;
  }

  public Integer getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }



}
