package com.sqxxcx.customer.exception;

public class SqxxcxException extends RuntimeException{

	private static final long serialVersionUID = -7632227644167156972L;

	public SqxxcxException() {
		super();
	}

	public SqxxcxException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SqxxcxException(String message, Throwable cause) {
		super(message, cause);
	}

	public SqxxcxException(String message) {
		super(message);
	}

	public SqxxcxException(Throwable cause) {
		super(cause);
	}
}
