package com.sopra.beans;

public class LoginForm 
{
	private String empid;
	private String empname;
	private String datetime;
	public String getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
	public LoginForm(String empid, String empname, String datetime) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.datetime = datetime;
	}
	
	public LoginForm() {
		super();
	}
	
	@Override
	public String toString() {
		return "LoginForm [empid=" + empid + ", empname=" + empname + ", datetime=" + datetime + "]";
	}
}
