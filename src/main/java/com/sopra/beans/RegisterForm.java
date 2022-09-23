package com.sopra.beans;

public class RegisterForm 
{
	private String empid;
	private String empname;
	private String empcontact;
	private String empemail;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpcontact() {
		return empcontact;
	}
	public void setEmpcontact(String empcontact) {
		this.empcontact = empcontact;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	
	public RegisterForm(String empid, String empname, String empcontact, String empemail) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empcontact = empcontact;
		this.empemail = empemail;
	}
	
	public RegisterForm() {
		super();
	}
	
	@Override
	public String toString() {
		return "RegisterForm [empid=" + empid + ", empname=" + empname + ", empcontact=" + empcontact + ", empemail="
				+ empemail + "]";
	}
		
}
