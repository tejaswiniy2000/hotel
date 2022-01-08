package com.cognizant.ems.beans;

public class Customers {
	
	private int cusId;
	private String cname;
	private String phoneNum;
	private String email;
	private String cpassword;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	@Override
	public String toString() {
		return "Customers [cusId=" + cusId + ", cname=" + cname + ", phoneNum=" + phoneNum + ", email=" + email
				+ ", cpassword=" + cpassword + "]";
	}
	
	
}
		


