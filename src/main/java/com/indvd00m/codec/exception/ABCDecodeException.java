package com.indvd00m.codec.exception;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2017-Apr-20 8:53:45 PM
 *
 */
public class ABCDecodeException extends RuntimeException {

	private static final long serialVersionUID = -1161097640628704111L;

	public ABCDecodeException() {

	}

	public ABCDecodeException(String message) {
		super(message);
	}

	public ABCDecodeException(Throwable cause) {
		super(cause);
	}

	public ABCDecodeException(String message, Throwable cause) {
		super(message, cause);
	}

}
