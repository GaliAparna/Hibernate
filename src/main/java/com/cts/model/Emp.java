package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="emp")
public class Emp {
	
	@Column(name="eid")
	@Id
	private Integer eid;
	private String ename;
	
	public Emp(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	public Emp() {
		
	}
	
	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	
	
	

}
