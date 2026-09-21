package com.Jobprofile.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
	private String status;
	private int applicationdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getApplicationdate() {
		return applicationdate;
	}
	public void setApplicationdate(int applicationdate) {
		this.applicationdate = applicationdate;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public Application() {
		super();
	}
	public Application(String status, int applicationdate, Job job, Candidate candidate) {
		super();
		this.status = status;
		this.applicationdate = applicationdate;
		this.job = job;
		this.candidate = candidate;
	}
	@ManyToOne
	private Job job;
	@ManyToOne
	private Candidate candidate;
	

}
