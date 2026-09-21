package com.Jobprofile.demo.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
private String name;
@Column(unique=true)
private String mail;
@Column(unique = true)
private Long  phone;
private String gender;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public Long  getPhone() {
	return phone;
}
public void setPhone(Long  phone) {
	this.phone =phone ;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public List<Edjucation> getEdjucation() {
	return edjucation;
}
public void setEdjucation(List<Edjucation> edjucation) {
	this.edjucation = edjucation;
}
public List<Expernice> getExpernice() {
	return expernice;
}
public void setExpernice(List<Expernice> expernice) {
	this.expernice = expernice;
}
public List<Skill> getSkill() {
	return skill;
}
public void setSkill(List<Skill> skill) {
	this.skill = skill;
}
public List<Application> getApplication() {
	return application;
}
public void setApplication(List<Application> application) {
	this.application = application;
}
public Candidate() {
	super();
}
public Candidate(String name, String mail, Long phone, String gender, int age, List<Edjucation> edjucation,
		List<Expernice> expernice, List<Skill> skill, List<Application> application) {
	super();
	this.name = name;
	this.mail = mail;
	this.phone = phone;
	this.gender = gender;
	this.age = age;
	this.edjucation = edjucation;
	this.expernice = expernice;
	this.skill = skill;
	this.application = application;
}
@OneToMany
private List<Edjucation> edjucation;
@OneToMany
private List<Expernice>expernice;
@OneToMany
private List <Skill>skill;
@OneToMany
private List<Application>application;
}
