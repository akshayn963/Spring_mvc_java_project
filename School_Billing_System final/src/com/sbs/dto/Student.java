package com.sbs.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "s_id")
	private int sid;
	@Column(name= "s_name")
	private String sname;
	@Column(name = "s_std")
	private int std;
	@Column(name="s_div" )
	private char div;
	@Column(name = "s_fee")
	private float fee;
	public Student() {
		
	}
	
	
	public Student(int sid) {
		super();
		this.sid = sid;
	}
	
	


	public Student(int sid, int std) {
		super();
		this.sid = sid;
		this.std = std;
	}


	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public char getDiv() {
		return div;
	}
	public void setDiv(char div) {
		this.div = div;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return  sid + " " + sname + " " + std + " " + div + " " + fee ;
	}
	

}

