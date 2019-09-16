package com.pnc.cpo.outer.exception;

public class OuterException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public OuterException() {
		super();
	}

	public OuterException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}