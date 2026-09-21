package com.Jobprofile.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public Skill() {
		super();
	}
	public Skill(String skillname) {
		super();
		this.skillname = skillname;
	}
	private String skillname;
}
