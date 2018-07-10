package com.aks.healthservice.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the memberenrollment database table.
 * 
 */
@Entity
@NamedQuery(name="Memberenrollment.findAll", query="SELECT m FROM Memberenrollment m")
public class Memberenrollment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int memberid;

	private String city;

	private String firstname;

	private String lastname;

	private int ssn;

	private String state;

	private int zip;

	public Memberenrollment() {
	}

	public int getMemberid() {
		return this.memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSsn() {
		return this.ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return this.zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}