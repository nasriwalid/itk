package com.nojoum.al.malaeb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Formation implements Serializable {
	@Id @GeneratedValue 
	private Long formationID;
	
	private String formationNAME;
	@OneToMany
	private List<Member> members;
	public Formation() {
		super();
	}
	public Formation(String formationNAME) {
		super();
		this.formationNAME = formationNAME;
	}
	public Long getFormationID() {
		return formationID;
	}
	public void setFormationID(Long formationID) {
		this.formationID = formationID;
	}
	public String getFormationNAME() {
		return formationNAME;
	}
	public void setFormationNAME(String formationNAME) {
		this.formationNAME = formationNAME;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}

}
