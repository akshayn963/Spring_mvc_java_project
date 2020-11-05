package com.sbs.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.dao.StaffDao;
import com.sbs.dto.Staff;
import com.sbs.dto.Student;
@Service
public class StaffServiceImple implements StaffService {
	@Autowired
	private StaffDao staffDao;
	
	@Override
	public void insertStaff(Staff staff) {
		staffDao.addStaff(staff);
		
	}

	@Override
	public void modifyStaff(Staff staff) {
		staffDao.updateStaff(staff);
		
	}

	@Override
	public void removeStaff(String staffId) {
		staffDao.deleteStaff(staffId);
		
	}

	@Override
	public Staff findStaff(String staffId) {
		return staffDao.selectStaff(staffId);
	}

	@Override
	public List<Staff> selectAllStaff() {
		return staffDao.selectAll();
	}

	@Override
	public Staff showBillStaff(String staffId) {
		return staffDao.selectBillst(staffId);
		
	}

	@Override
	public List<Staff> selectwhereStaff(Staff staff) {
		return staffDao.selectAllWherest(staff);
	}

}
