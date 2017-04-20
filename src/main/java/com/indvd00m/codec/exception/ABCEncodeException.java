package com.indvd00m.codec.exception;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2017-Apr-20 8:52:45 PM
 *
 */
public class ABCEncodeException extends RuntimeException {

	private static final long serialVersionUID = -1161097640628704111L;

	public ABCEncodeException() {

	}

	public ABCEncodeException(String message) {
		super(message);
	}

	public ABCEncodeException(Throwable cause) {
		super(cause);
	}

	public ABCEncodeException(String message, Throwable cause) {
		super(message, cause);
	}

	public ABCEncodeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
