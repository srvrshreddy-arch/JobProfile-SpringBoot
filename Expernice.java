package com.Jobprofile.demo.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Expernice {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getNoofyerasexpeince() {
		return noofyerasexpeince;
	}
	public void setNoofyerasexpeince(double noofyerasexpeince) {
		this.noofyerasexpeince = noofyerasexpeince;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getStartingdate() {
		return startingdate;
	}
	public void setStartingdate(int startingdate) {
		this.startingdate = startingdate;
	}
	public int getEnddate() {
		return enddate;
	}
	public void setEnddate(int enddate) {
		this.enddate = enddate;
	}
	public String getCurrentlyworking() {
		return currentlyworking;
	}
	public void setCurrentlyworking(String currentlyworking) {
		this.currentlyworking = currentlyworking;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public List<Skill> getSkill() {
		return skill;
	}
	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}
	public Expernice() {
		super();
	}
	public Expernice(double noofyerasexpeince, String role, String companyname, int startingdate, int enddate,
			String currentlyworking, String discription, List<Skill> skill) {
		super();
		this.noofyerasexpeince = noofyerasexpeince;
		this.role = role;
		this.companyname = companyname;
		this.startingdate = startingdate;
		this.enddate = enddate;
		this.currentlyworking = currentlyworking;
		this.discription = discription;
		this.skill = skill;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double noofyerasexpeince;
	private String role;
	private String companyname;
	private int startingdate;
	private int enddate;
	private String currentlyworking;
	private String discription;
	@OneToMany
	private List<Skill>skill;
	
	}
