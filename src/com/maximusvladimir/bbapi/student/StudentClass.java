/**
 * 
 */
package com.maximusvladimir.bbapi.student;

import com.maximusvladimir.bbapi.BBException;
import com.maximusvladimir.bbapi.CreditLevel;

/**
 * @author maximusvladimir
 *
 */
public class StudentClass {
	private String className = "";
	private CreditLevel credit = CreditLevel.Unknown;
	private double g1 = 0;
	private double g2 = 0;
	private double g3 = 0;
	private double g4 = 0;
	public StudentClass() {
		
	}
	
	public StudentClass(String className) {
		this.className = className;
	}
	
	public StudentClass(String className, CreditLevel credit) {
		this.className = className;
		this.credit = credit;
	}
	
	public double getGrade(int quarterNum) {
		if (quarterNum == 1)
			return g1;
		else if (quarterNum == 2)
			return g2;
		else if (quarterNum == 3)
			return g3;
		else if (quarterNum == 4)
			return g4;
		else
			throw new BBException("Unknown quarter specified. (" + quarterNum + "). ");
	}
	
	public void setGrade(int quarterNum, double grade) {
		if (quarterNum == 1)
			g1 = grade;
		else if (quarterNum == 2)
			g2 = grade;
		else if (quarterNum == 3)
			g3 = grade;
		else if (quarterNum == 4)
			g4 = grade;
		else
			throw new BBException("Unknown quarter specified. (" + quarterNum + "). ");
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public CreditLevel getCreditLevel() {
		return credit;
	}
	
	public void setCreditLevel(CreditLevel credit) {
		this.credit = credit;
	}
}
