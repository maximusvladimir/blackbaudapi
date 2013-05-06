/**
 * 
 */
package com.maximusvladimir.bbapi;

/**
 * @author maximusvladimir
 * Connection for Blackbaud client.
 */
public abstract class BBConnection {
	private int serverID;
	private String serverURL;
	private long serverTimeout;
	protected boolean connectionEstablished = false;
	protected boolean loginEstablished = false;
	/**
	 * Creates a connection instance.
	 * @param serverURL The id of the client. This is typically 4-6 digits.
	 * @param serverURL The server to connect to. This is typically
	 * "blackbaudondemand.com".
	 */
	public BBConnection(int serverID, String serverURL) {
		this.serverURL = serverURL;
		this.serverID = serverID;
	}
	
	/**
	 * Is the connection established, and is the user logged in?
	 * @return
	 */
	public boolean isLoggedIn() {
		return loginEstablished && connectionEstablished;
	}
	
	/**
	 * Is the client connected to a server?
	 * @return
	 */
	public boolean isConnected() {
		return connectionEstablished;
	}
	
	/**
	 * Gets how long the server takes before it will timeout the connection.
	 * (This is typically about 20 minutes.)
	 * @return
	 */
	public long getServerTimeout() {
		return serverTimeout;
	}
	
	/**
	 * Gets the Server ID. This is typically 4-6 digits.
	 * @return
	 */
	public int getServerID() {
		return serverID;
	}
	
	/**
	 * Gets the Server URL. This is typically "blackbaudondemand.com".
	 * @return
	 */
	public String getServerURL() {
		return serverURL;
	}
	
	/**
	 * Gets the full URL of the connection. This could be something like:
	 * "https://XXXXXXnetclass.blackbaudondemand.com/NetClassroom7/Forms/NCShell.aspx";
	 * @return
	 */
	public abstract String getFullURL();
	
	/**
	 * Opens a connection to the server.
	 */
	public abstract boolean makeConnection();
	
	/**
	 * Logins into the server with the given username and password.
	 * @param username The username to login with.
	 * @param password The password to login with.
	 */
	public abstract boolean login(String username, String password);
	
}
