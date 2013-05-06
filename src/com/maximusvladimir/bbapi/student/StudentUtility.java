/**
 * 
 */
package com.maximusvladimir.bbapi.student;

import com.maximusvladimir.bbapi.BBException;
import com.maximusvladimir.bbapi.BBStudentConnection;
import com.maximusvladimir.bbapi.CreditLevel;

/**
 * @author maximusvladimir
 *
 */
public class StudentUtility implements Runnable {
	private BBStudentConnection connection;
	private Thread worker;
	
	private double gpa = 0.0;
	private StudentClass[] classes = null;
	public StudentUtility(BBStudentConnection connection) {
		if (connection == null || !connection.isLoggedIn())
			throw new BBException("User must be logged in to proceed.");
		this.connection = connection;
		refresh();
	}
	
	public double getEstimatedAnnualGPA() {
		return gpa;
	}
	
	public double getGrade(int classIndex, int quarterNum) {
		return classes[classIndex].getGrade(quarterNum);
	}
	
	public StudentClass[] getClasses() {
		return classes;
	}
	
	public int getNumClasses() {
		return classes.length;
	}
	
	public StudentClass getClass(int index) {
		return classes[index];
	}
	
	public void refresh() {
		worker = new Thread(this);
		worker.start();
	}
	
	private void doGPAWork() {
		
	}
	
	public void run() {
		doGPAWork();
	}
}
