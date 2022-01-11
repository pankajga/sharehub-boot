/**
 * 
 */
package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author panka
 *
 */


@Entity
public class ShareHub {
	
	@Id
	private String mfName;
	private String mfTagLine;
	private String mfReturns;
	private String mfYearPlan;
	private String mfEquity;
	private String mfLogo;
	/**
	 * @return the mfLogo
	 */
	public String getMfLogo() {
		return mfLogo;
	}
	/**
	 * @param mfLogo the mfLogo to set
	 */
	public void setMfLogo(String mfLogo) {
		this.mfLogo = mfLogo;
	}
	/**
	 * @return the mfName
	 */
	public String getMfName() {
		return mfName;
	}
	/**
	 * @param mfName the mfName to set
	 */
	public void setMfName(String mfName) {
		this.mfName = mfName;
	}
	/**
	 * @return the mfTagLine
	 */
	public String getMfTagLine() {
		return mfTagLine;
	}
	/**
	 * @param mfTagLine the mfTagLine to set
	 */
	public void setMfTagLine(String mfTagLine) {
		this.mfTagLine = mfTagLine;
	}
	/**
	 * @return the mfReturns
	 */
	public String getMfReturns() {
		return mfReturns;
	}
	/**
	 * @param mfReturns the mfReturns to set
	 */
	public void setMfReturns(String mfReturns) {
		this.mfReturns = mfReturns;
	}
	/**
	 * @return the mfYearPlan
	 */
	public String getMfYearPlan() {
		return mfYearPlan;
	}
	/**
	 * @param mfYearPlan the mfYearPlan to set
	 */
	public void setMfYearPlan(String mfYearPlan) {
		this.mfYearPlan = mfYearPlan;
	}
	/**
	 * @return the mfEquity
	 */
	public String getMfEquity() {
		return mfEquity;
	}
	/**
	 * @param mfEquity the mfEquity to set
	 */
	public void setMfEquity(String mfEquity) {
		this.mfEquity = mfEquity;
	}
	

}
