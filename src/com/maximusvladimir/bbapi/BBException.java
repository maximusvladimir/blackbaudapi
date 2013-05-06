/**
 * 
 */
package com.maximusvladimir.bbapi;

/**
 * @author maximusvladimir
 *
 */
public class BBException extends RuntimeException {

	/**
	 * 
	 */
	public BBException() {
	}

	/**
	 * @param arg0
	 */
	public BBException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public BBException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public BBException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public BBException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
