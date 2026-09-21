package com.Jobprofile.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Edjucation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
	private String qulification;
	private String specilization;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQulification() {
		return qulification;
	}
	public void setQulification(String qulification) {
		this.qulification = qulification;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int getYearofpassed() {
		return yearofpassed;
	}
	public void setYearofpassed(int yearofpassed) {
		this.yearofpassed = yearofpassed;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public Edjucation() {
		super();
	}
	public Edjucation(String qulification, String specilization, double percentage, int yearofpassed,
			String university) {
		super();
		this.qulification = qulification;
		this.specilization = specilization;
		this.percentage = percentage;
		this.yearofpassed = yearofpassed;
		this.university = university;
	}
	private double percentage;
	private int yearofpassed;
	private String university;
	
	

}
