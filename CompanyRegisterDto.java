package com.Jobprofile.demo.Dto;

public class CompanyRegisterDto {
private String name;
private String mail;
private Long phone;
private String address;
private String typeofcomapany;
private int noofemployess;
public CompanyRegisterDto(String name, String mail, Long phone, String address, String typeofcomapany,
		int noofemployess) {
	super();
	this.name = name;
	this.mail = mail;
	this.phone =  phone;
	this.address = address;
	this.typeofcomapany = typeofcomapany;
	this.noofemployess = noofemployess;
}
public CompanyRegisterDto() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTypeofcomapany() {
	return typeofcomapany;
}
public void setTypeofcomapany(String typeofcomapany) {
	this.typeofcomapany = typeofcomapany;
}
public int getNoofemployess() {
	return noofemployess;
}
public void setNoofemployess(int noofemployess) {
	this.noofemployess = noofemployess;
}

}
