package com.sbs.dao;

import java.util.List;

import com.sbs.dto.Student;

public interface StudentDao {
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int sid);
	Student selectStudent(int sid);
	List<Student> selectAll();
	Student selectBill(int sid, int std);
	List<Student> selectAllWhere(Student student);
}
