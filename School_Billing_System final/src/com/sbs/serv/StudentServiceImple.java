package com.sbs.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.dao.StudentDao;
import com.sbs.dto.Student;

@Service
public class StudentServiceImple implements StudentService{
    @Autowired
	private StudentDao studentDao;
	
	@Override
	public void insertStudent(Student student) {
		studentDao.addStudent(student);
		
	}

	@Override
	public void modifyStudent(Student student) {
		studentDao.updateStudent(student);
		
	}

	@Override
	public void removeStudent(int sid) {
		studentDao.deleteStudent(sid);
		
	}
	@Override
	public Student findStudent(int sid) {
		return studentDao.selectStudent(sid);
	}


	@Override
	public List<Student> selectDivStud() {
		return studentDao.selectAll();
	}

	@Override
	public Student showBill(int sid,int std) {
		return studentDao.selectBill(sid, std);
	}

	@Override
	public List<Student> selectwhere(Student student) {
		return studentDao.selectAllWhere(student);
	}
	

}
