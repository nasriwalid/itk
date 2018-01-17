package com.nojoum.al.malaeb.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Level implements Serializable {
@Id @GeneratedValue
private Long levelID;
private String levelNAME;
//*****************************************************relationshipe****************************************************************//
@OneToMany
private List<Member> members;
//************************************************end relationshipe****************************************************************//
public Level() {
	super();
}
public Level(String levelNAME, List<Member> members) {
	super();
	this.levelNAME = levelNAME;
	this.members = members;
}
public Long getLevelID() {
	return levelID;
}
public void setLevelID(Long levelID) {
	this.levelID = levelID;
}
public String getLevelNAME() {
	return levelNAME;
}
public void setLevelNAME(String levelNAME) {
	this.levelNAME = levelNAME;
}
public List<Member> getMembers() {
	return members;
}
public void setMembers(List<Member> members) {
	this.members = members;
}

}
