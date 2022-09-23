package com.sopra.beans;

public class indexbean 
{
	private String empid;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public indexbean(String empid) {
		super();
		this.empid = empid;
	}

	public indexbean() {
		super();
	}

	@Override
	public String toString() {
		return "Indexbean [empid=" + empid + "]";
	}
}
