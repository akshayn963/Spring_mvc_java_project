package com.sbs.serv;

import com.sbs.dto.Admin;

public interface AdminService {
 void registerAdmin(Admin admin);
 boolean findAdmin(Admin admin);
 String forgotPassword(String adminEmail);
 
}
