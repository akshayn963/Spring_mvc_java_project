package com.sbs.dao;

import java.util.List;


import com.sbs.dto.Staff;
import com.sbs.dto.Student;

public interface StaffDao {
	void addStaff(Staff staff);
	void updateStaff(Staff staff);
	void deleteStaff(String staffId);
	Staff selectStaff(String staffId);
	List<Staff> selectAll();
	Staff selectBillst(String staffId);
	List<Staff> selectAllWherest(Staff staff);
}
