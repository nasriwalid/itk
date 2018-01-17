package com.nojoum.al.malaeb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Country implements Serializable {
	@Id @GeneratedValue
	private Long countryID;
	private String countryNALME;
	//*****************************************************relaltionshipe************************************************************//
	@OneToMany
	private List<Member> members;
	//***********************************************end relationshipe**************************************************************//
	public Country() {
		super();
	}
	public Country(String countryNALME, List<Member> members) {
		super();
		this.countryNALME = countryNALME;
		this.members = members;
	}
	public Long getCountryID() {
		return countryID;
	}
	public void setCountryID(Long countryID) {
		this.countryID = countryID;
	}
	public String getCountryNALME() {
		return countryNALME;
	}
	public void setCountryNALME(String countryNALME) {
		this.countryNALME = countryNALME;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	

}
