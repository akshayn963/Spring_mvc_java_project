package com.sbs.serv;

import java.util.List;

import com.sbs.dto.Staff;
import com.sbs.dto.Student;


public interface StaffService {
	void insertStaff(Staff staff);
	 void modifyStaff(Staff staff);
	 void removeStaff(String staffId);
	 Staff findStaff(String staffId);
	 List<Staff> selectAllStaff();
	 Staff showBillStaff(String staffId);
	List<Staff> selectwhereStaff(Staff staff);
}
