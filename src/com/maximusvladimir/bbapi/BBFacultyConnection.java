/**
 * Blackbaud read-only API.
 */
package com.maximusvladimir.bbapi;

/**
 * @author maximusvladimir
 *
 */
public class BBFacultyConnection extends BBConnection {

	public BBFacultyConnection(int serverID, String serverURL) {
		super(serverID, serverURL);
	}

	/* (non-Javadoc)
	 * @see com.maximusvladimir.bbapi.BBConnection#getFullURL()
	 */
	public String getFullURL() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.maximusvladimir.bbapi.BBConnection#makeConnection()
	 */
	public boolean makeConnection() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.maximusvladimir.bbapi.BBConnection#login(java.lang.String, java.lang.String)
	 */
	public boolean login(String username, String password) {
		return false;
	}

}
