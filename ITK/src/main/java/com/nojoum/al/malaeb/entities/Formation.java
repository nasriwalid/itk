package com.nojoum.al.malaeb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Formation implements Serializable {
	@Id @GeneratedValue 
	private Long formationID;
	private String formationNAME;

}
