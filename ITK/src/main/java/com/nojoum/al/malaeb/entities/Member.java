package com.nojoum.al.malaeb.entities;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Member {
@Id @GeneratedValue
private Long memberID ;
@NotEmpty @Size(min=3,max=15)
private String memberFNAME;
@NotEmpty @Size(min=3,max=15)
private String memberSNAME;
@NotEmpty @Email(message="email non valide")
private String memberEMAIL;
private String memberPWD;
private String memberADRESSE;
private String memberCIN;
private String memberPP;
private String memberPHOTO;
private String cinPHOTO;
private String ppPHOTO;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date memberBEARTH;
@DateTimeFormat(pattern="YYYY-mm-dd")
private Date cinDATE;
@DateTimeFormat(pattern="YYYY-mm-dd")
private Date ppDate;

//******************************************************Relationshipe***************************************************//
@ManyToOne
private Country country;
@ManyToOne
private Level level;
@ManyToOne
private Formation formation;
//******************************************************end relationshipe*********************************************//
public Member() {
	super();
}
public Member(String memberFNAME, String memberSNAME, String memberEMAIL, String memberPWD, String memberADRESSE,
		String memberCIN, String memberPP, String memberPHOTO, String cinPHOTO, String ppPHOTO, Date memberBEARTH,
		Date cinDATE, Date ppDate, Country country, Level level,Formation formation) {
	super();
	this.memberFNAME = memberFNAME;
	this.memberSNAME = memberSNAME;
	this.memberEMAIL = memberEMAIL;
	this.memberPWD = memberPWD;
	this.memberADRESSE = memberADRESSE;
	this.memberCIN = memberCIN;
	this.memberPP = memberPP;
	this.memberPHOTO = memberPHOTO;
	this.cinPHOTO = cinPHOTO;
	this.ppPHOTO = ppPHOTO;
	this.memberBEARTH = memberBEARTH;
	this.cinDATE = cinDATE;
	this.ppDate = ppDate;
	this.country = country;
	this.level = level;
	this.formation=formation;
}


public Member(String memberFNAME, String memberSNAME, String memberEMAIL, String memberPWD, Country country,
		Level level, Formation formation) {
	super();
	this.memberFNAME = memberFNAME;
	this.memberSNAME = memberSNAME;
	this.memberEMAIL = memberEMAIL;
	this.memberPWD = memberPWD;
	this.country = country;
	this.level = level;
	this.formation = formation;
}




public Member(String memberFNAME, String memberSNAME, String memberEMAIL, String memberPWD, String memberADRESSE,
		String memberPHOTO, Date memberBEARTH, Country country, Level level, Formation formation) {
	super();
	this.memberFNAME = memberFNAME;
	this.memberSNAME = memberSNAME;
	this.memberEMAIL = memberEMAIL;
	this.memberPWD = memberPWD;
	this.memberADRESSE = memberADRESSE;
	this.memberPHOTO = memberPHOTO;
	this.memberBEARTH = memberBEARTH;
	this.country = country;
	this.level = level;
	this.formation = formation;
}



public Long getMemberID() {
	return memberID;
}
public void setMemberID(Long memberID) {
	this.memberID = memberID;
}
public String getMemberFNAME() {
	return memberFNAME;
}
public void setMemberFNAME(String memberFNAME) {
	this.memberFNAME = memberFNAME;
}
public String getMemberSNAME() {
	return memberSNAME;
}
public void setMemberSNAME(String memberSNAME) {
	this.memberSNAME = memberSNAME;
}
public String getMemberEMAIL() {
	return memberEMAIL;
}
public void setMemberEMAIL(String memberEMAIL) {
	this.memberEMAIL = memberEMAIL;
}
public String getMemberPWD() {
	return memberPWD;
}
public void setMemberPWD(String memberPWD) {
	this.memberPWD = memberPWD;
}
public String getMemberADRESSE() {
	return memberADRESSE;
}
public void setMemberADRESSE(String memberADRESSE) {
	this.memberADRESSE = memberADRESSE;
}
public String getMemberCIN() {
	return memberCIN;
}
public void setMemberCIN(String memberCIN) {
	this.memberCIN = memberCIN;
}
public String getMemberPP() {
	return memberPP;
}
public void setMemberPP(String memberPP) {
	this.memberPP = memberPP;
}
public String getMemberPHOTO() {
	return memberPHOTO;
}
public void setMemberPHOTO(String memberPHOTO) {
	this.memberPHOTO = memberPHOTO;
}
public String getCinPHOTO() {
	return cinPHOTO;
}
public void setCinPHOTO(String cinPHOTO) {
	this.cinPHOTO = cinPHOTO;
}
public String getPpPHOTO() {
	return ppPHOTO;
}
public void setPpPHOTO(String ppPHOTO) {
	this.ppPHOTO = ppPHOTO;
}
public Date getMemberBEARTH() {
	return memberBEARTH;
}
public void setMemberBEARTH(Date memberBEARTH) {
	this.memberBEARTH = memberBEARTH;
}
public Date getCinDATE() {
	return cinDATE;
}
public void setCinDATE(Date cinDATE) {
	this.cinDATE = cinDATE;
}
public Date getPpDate() {
	return ppDate;
}
public void setPpDate(Date ppDate) {
	this.ppDate = ppDate;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
public Level getLevel() {
	return level;
}
public void setLevel(Level level) {
	this.level = level;
}
public Formation getFormation() {
	return formation;
}
public void setFormation(Formation formation) {
	this.formation = formation;
}

         
}
