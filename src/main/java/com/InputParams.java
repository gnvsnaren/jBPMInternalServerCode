package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InputParams implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String param1;

	private java.lang.String param2;

	private java.lang.String param3;

	private java.lang.String param4;

	private java.lang.String param5;

	private java.lang.String client_Number;

	private java.lang.String sid;

	public InputParams() {
	}

	public java.lang.String getParam1() {
		return this.param1;
	}

	public void setParam1(java.lang.String param1) {
		this.param1 = param1;
	}

	public java.lang.String getParam2() {
		return this.param2;
	}

	public void setParam2(java.lang.String param2) {
		this.param2 = param2;
	}

	public java.lang.String getParam3() {
		return this.param3;
	}

	public void setParam3(java.lang.String param3) {
		this.param3 = param3;
	}

	public java.lang.String getParam4() {
		return this.param4;
	}

	public void setParam4(java.lang.String param4) {
		this.param4 = param4;
	}

	public java.lang.String getParam5() {
		return this.param5;
	}

	public void setParam5(java.lang.String param5) {
		this.param5 = param5;
	}

	public java.lang.String getClient_Number() {
		return this.client_Number;
	}

	public void setClient_Number(java.lang.String client_Number) {
		this.client_Number = client_Number;
	}

	public java.lang.String getSid() {
		return this.sid;
	}

	public void setSid(java.lang.String sid) {
		this.sid = sid;
	}

	public InputParams(java.lang.String param1, java.lang.String SID,
			java.lang.String client_Number, java.lang.String param2,
			java.lang.String param3, java.lang.String param4,
			java.lang.String param5) {
		this.param1 = param1;
		this.SID = SID;
		this.client_Number = client_Number;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		this.param5 = param5;
	}
}