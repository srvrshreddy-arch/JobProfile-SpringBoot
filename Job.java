package com.Jobprofile.demo.Entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String reqskills;
	private String jobdiscription;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReqskills() {
		return reqskills;
	}
	public void setReqskills(String reqskills) {
		this.reqskills = reqskills;
	}
	public String getJobdiscription() {
		return jobdiscription;
	}
	public void setJobdiscription(String jobdiscription) {
		this.jobdiscription = jobdiscription;
	}
	public int getNoofpositions() {
		return noofpositions;
	}
	public void setNoofpositions(int noofpositions) {
		this.noofpositions = noofpositions;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBond() {
		return bond;
	}
	public void setBond(double bond) {
		this.bond = bond;
	}
	public double getReqexperince() {
		return reqexperince;
	}
	public void setReqexperince(double reqexperince) {
		this.reqexperince = reqexperince;
	}
	public int getPosteddate() {
		return posteddate;
	}
	public void setPosteddate(int posteddate) {
		this.posteddate = posteddate;
	}
	public int getLastdate() {
		return lastdate;
	}
	public void setLastdate(int lastdate) {
		this.lastdate = lastdate;
	}
	public String getReqqualification() {
		return reqqualification;
	}
	public void setReqqualification(String reqqualification) {
		this.reqqualification = reqqualification;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<Application> getApplication() {
		return application;
	}
	public void setApplication(List<Application> application) {
		this.application = application;
	}
	public Job() {
		super();
	}
	public Job(String reqskills, String jobdiscription, int noofpositions, double salary, double bond,
			double reqexperince, int posteddate, int lastdate, String reqqualification, Company company,
			List<Application> application) {
		super();
		this.reqskills = reqskills;
		this.jobdiscription = jobdiscription;
		this.noofpositions = noofpositions;
		this.salary = salary;
		this.bond = bond;
		this.reqexperince = reqexperince;
		this.posteddate = posteddate;
		this.lastdate = lastdate;
		this.reqqualification = reqqualification;
		this.company = company;
		this.application = application;
	}
	private int noofpositions;
	private double salary;
	private double bond;
	private double reqexperince;
	private int posteddate;
	private int lastdate;
	private String reqqualification;
	@ManyToOne
	 private Company company; 
	@OneToMany
	private List<Application>application;
}
