package com.sbs.serv;

import java.util.List;

import com.sbs.dto.Student;


public interface StudentService {
	 void insertStudent(Student student);
	 void modifyStudent(Student student);
	 void removeStudent(int sid);
	 Student findStudent(int sid);
	 List<Student> selectDivStud();
	Student showBill(int sid, int std);
	List<Student> selectwhere(Student student);
}
