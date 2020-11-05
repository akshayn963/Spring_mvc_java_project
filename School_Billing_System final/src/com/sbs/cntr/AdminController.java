package com.sbs.cntr;


import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbs.dto.Admin;
import com.sbs.serv.AdminService;


@Controller
public class AdminController {
 
@Autowired
private AdminService adminService;

@Autowired
private MailSender mailSender;


@RequestMapping("/admin_login_form.jsp")
public String showform1() {
	return "admin_login_form.jsp";
}

@RequestMapping(value = "/Admin_login",method = RequestMethod.POST)
public String register(Admin admin) {
	adminService.registerAdmin(admin);
	return "Admin_login";
}

@RequestMapping(value = "/Admin_login")
public String login() {
	return "Admin_login";
}

@RequestMapping(value = "/home.htm", method=RequestMethod.POST)
public String checkAdmin(Admin admin,HttpSession session) {
	boolean b=adminService.findAdmin(admin);
	if(b) {
		session.setAttribute("admin", admin);
		return "home";
		
	}else {
		return "Admin_login";
	}
}

@RequestMapping(value = "/forgot_password.htm",method = RequestMethod.POST)
public String forgotPassword(@RequestParam String adminEmail,ModelMap map) {		
	String pass = adminService.forgotPassword(adminEmail);
	//System.out.println(adminEmail);
	String msg = "you are not registered";
	if(pass!=null) {	
		
		SimpleMailMessage message = new SimpleMailMessage();  
        message.setFrom("akshaysabale07@gmail.com");  
        message.setTo(adminEmail);  
        message.setSubject("Your password");  
        message.setText(pass);  
        //sending message   
        mailSender.send(message);
		msg = "check the mail for password";
	}
	map.put("msg", msg);
	return "msg";
}

}
