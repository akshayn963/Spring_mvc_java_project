package com.sbs.dao;

import com.sbs.dto.Admin;

public interface AdminDao {
	void insertAdmin(Admin admin);
	boolean checkAdmin(Admin admin);
	String forgotPassword(String adminEmail);
}
