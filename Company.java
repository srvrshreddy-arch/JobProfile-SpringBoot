package com.Jobprofile.demo.Entity;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
	private String name;
	@Column(unique=true)
	private String mail;
	@Column(unique=true)
	private Long phone;
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
	public String getTypeofcompany() {
		return typeofcompany;
	}
	public void setTypeofcompany(String typeofcompany) {
		this.typeofcompany = typeofcompany;
	}
	public int getNoofemployess() {
		return noofemployess;
	}
	public void setNoofemployess(int noofemployess) {
		this.noofemployess = noofemployess;
	}
	public List<Job> getJob() {
		return job;
	}
	public void setJob(List<Job> job) {
		this.job = job;
	}
	public Company() {
		super();
	}
	public Company(String name, String mail, Long phone, String address, String typeofcompany, int noofemployess,
			List<Job> job) {
		super();
		this.name = name;
		this.mail = mail;
		this.phone = phone;
		this.address = address;
		this.typeofcompany = typeofcompany;
		this.noofemployess = noofemployess;
		this.job = job;
	}
	private String address;
	private String typeofcompany;
	private int noofemployess;
	@OneToMany
	private List<Job>job;
}
