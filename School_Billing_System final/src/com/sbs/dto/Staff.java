package com.sbs.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {
	@Id
	@Column(name = "staff_id",unique = true)
	private String staffId;
	@Column(name= "staff_name")
	private String staffName;
	@Column(name = "staff_salary")
	private float staffSalary;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(String staffId) {
		super();
		this.staffId = staffId;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public float getStaffSalary() {
		return staffSalary;
	}
	public void setStaffSalary(float staffSalary) {
		this.staffSalary = staffSalary;
	}
	
	
}