package org.example;

/**
 * to throw when input is not valid
 */
public class InvalidTypeException extends Exception{
	/**
	 * @param errorMessage
	 */
	public InvalidTypeException(String errorMessage) {
		super(errorMessage);
	}
}
