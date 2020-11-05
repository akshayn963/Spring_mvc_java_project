package com.sbs.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbs.dto.Staff;
import com.sbs.dto.Student;
import com.sbs.serv.StaffService;

@Controller
public class StaffController {
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value = "/addstaff_form.htm")
	public String addstudent() {
		return "addstaff_form";
	}
	
	@RequestMapping(value = "/process1",method = RequestMethod.POST)
	public String addStaff1(Staff staff,HttpSession session) {
		session.setAttribute("staff", staff);
		staffService.insertStaff(staff);
		return "home";
	}
	
	@RequestMapping(path= "/showstaff_record.htm",method = RequestMethod.GET)
	public String AllProduct1(ModelMap map,HttpSession session) {
       
		session.getAttribute("staff");
		 List<Staff> li = staffService.selectAllStaff();
		 
        map.put("stafflist",li);
		return "search_list_staff";
   }
	
	@RequestMapping(value = "/staff_delete.htm",method = RequestMethod.GET)
	public String studentDelete(@RequestParam String SfId,ModelMap map,HttpSession session) {
		
		staffService.removeStaff(SfId); 
		
		    session.getAttribute("staff");
		List<Staff> li = staffService.selectAllStaff();
		map.put("stafflist", li);
		return "search_list_staff";
	}
	
	@RequestMapping(value = "/staff_update_form.htm",method = RequestMethod.GET)
	public String studentUpdateForm(@RequestParam String SfId,ModelMap map) {
		
		Staff st = staffService.findStaff(SfId);
		map.put("staff", st);
		
		return "staff_update_form";
	}
	
	@RequestMapping(value = "/staff_update.htm",method = RequestMethod.POST)
	public String expenseUpdate(Staff staff,ModelMap map,HttpSession session) {
		staffService.modifyStaff(staff);
		return "home";
	}
	
	@RequestMapping(value = "/show_staffbill.htm",method = RequestMethod.POST)
	public String studentShow(@RequestParam String staffId,ModelMap map,HttpSession session,Staff staff) {
		System.out.println(staffId);
		Staff stf = staffService.showBillStaff(staffId);
		session.getAttribute("staff");
		map.put("staff", stf);
		
		
		List<Staff> li = staffService.selectwhereStaff(staff);
		map.put("stafflist", li);
		return "view_staff";
		
	}
}
