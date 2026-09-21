package com.Jobprofile.demo.Dto;

public class CandidateRegisterDto {
private String name;
private String mail;
private Long phone;
private int age;
private String gender;
public CandidateRegisterDto(String name, String mail, Long phone, int age, String gender) {
	super();
	this.name = name;
	this.mail = mail;
	this.phone = phone;
	this.age = age;
	this.gender = gender;
}
public CandidateRegisterDto() {
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

}
