package com.sbs.cntr;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbs.dto.Student;
import com.sbs.serv.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/add_form.htm")
	public String addstudent() {
		return "addstudent_form";
	}

	@RequestMapping(value = "/process",method = RequestMethod.POST)
	public String add(Student student,HttpSession session) {
		session.setAttribute("student", student);
		studentService.insertStudent(student);
		return "home";
	}
	
	
	@RequestMapping(path= "/show_record.htm",method = RequestMethod.GET)
	public String AllStudent(ModelMap map,HttpSession session) {
       
		session.getAttribute("student");
		 List<Student> li = studentService.selectDivStud();
		 
        map.put("studentlist",li);
		return "search_list_stud";
   }
	
	@RequestMapping(value = "/student_delete.htm",method = RequestMethod.GET)
	public String studentDelete(@RequestParam int StId,ModelMap map,HttpSession session) {
		
		studentService.removeStudent(StId); 
		
		session.getAttribute("student");
		List<Student> li = studentService.selectDivStud();
		map.put("studentlist", li);
		return "search_list_stud";
	}
	
	@RequestMapping(value = "/student_update_form.htm",method = RequestMethod.GET)
	public String studentUpdateForm(@RequestParam int StId,ModelMap map) {
		
		Student st = studentService.findStudent(StId);
		map.put("student", st);
		
		return "student_update_form";
	}
	
	@RequestMapping(value = "/student_update.htm",method = RequestMethod.POST)
	public String expenseUpdate(Student student,ModelMap map,HttpSession session) {
		studentService.modifyStudent(student);
		return "home";
	}
	
	@RequestMapping(value = "/show_bill.htm",method = RequestMethod.POST)
	public String studentShow(@RequestParam int sid,@RequestParam int std,ModelMap map,HttpSession session,Student student) {
		System.out.println(sid+" "+std);
		Student st = studentService.showBill(sid,std);
		session.getAttribute("student");
		map.put("student", st);
		
		
		List<Student> li = studentService.selectwhere(student);
		map.put("studentlist", li);
		return "view_stud";
		
	}
	
	
}
