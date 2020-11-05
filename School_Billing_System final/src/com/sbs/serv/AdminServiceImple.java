package com.sbs.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.dao.AdminDao;
import com.sbs.dto.Admin;

@Service
public class AdminServiceImple implements AdminService {
    @Autowired
	private AdminDao adminDao;
	
    @Override
	public void registerAdmin(Admin admin) {
		adminDao.insertAdmin(admin);
	}
    
	@Override
	public boolean findAdmin(Admin admin) {
		return adminDao.checkAdmin(admin);
	}
    
	@Override
	public String forgotPassword(String adminEmail) {
		return adminDao.forgotPassword(adminEmail);
	}
	
}
