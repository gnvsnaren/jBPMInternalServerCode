package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Incident implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String sys_id;
	private java.lang.String number;
	private java.util.List<com.Solutions> solutions;

	public Incident() {
	}

	public java.lang.String getSys_id() {
		return this.sys_id;
	}

	public void setSys_id(java.lang.String sys_id) {
		this.sys_id = sys_id;
	}

	public java.lang.String getNumber() {
		return this.number;
	}

	public void setNumber(java.lang.String number) {
		this.number = number;
	}

	public java.util.List<com.Solutions> getSolutions() {
		return this.solutions;
	}

	public void setSolutions(java.util.List<com.Solutions> solutions) {
		this.solutions = solutions;
	}

	public Incident(java.lang.String sys_id, java.lang.String number,
			java.util.List<com.Solutions> solutions) {
		this.sys_id = sys_id;
		this.number = number;
		this.solutions = solutions;
	}

}