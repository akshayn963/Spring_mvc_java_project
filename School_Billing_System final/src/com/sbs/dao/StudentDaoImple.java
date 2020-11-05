package com.sbs.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sbs.dto.Student;

@Repository
public class StudentDaoImple implements StudentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate; 
	
	public void addStudent(Student student) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				session.save(student);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		}); 
	}

	public void updateStudent(Student student) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				session.update(student);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		}); 
		
	}

	public void deleteStudent(int sid) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Student(sid));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}
	public Student selectStudent(int sid) {
		Student student = hibernateTemplate.execute(new HibernateCallback<Student>() {

			@Override
			public Student doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Student st = (Student)session.get(Student.class, sid);
				tr.commit();
				session.flush();
				session.close();
				return st;
			}
			
		});
		return student;
	}

	

	public List<Student> selectAll() {
		List<Student> studList = hibernateTemplate.execute(new HibernateCallback<List<Student>>() {

			@Override
			public List<Student> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Student");
				List<Student> li = q.list(); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return studList;
	}

	@Override
	public Student selectBill(int sid,int std) {
		Student student = hibernateTemplate.execute(new HibernateCallback<Student>() {

			@Override
			public Student doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q=session.createQuery("from Student where sid =? and std =?");
				System.out.println(sid+" "+std);
				q.setInteger(0,sid);
				q.setInteger(1,std);
			    Student st = (Student)session.get(Student.class, sid);
				tr.commit();
				session.flush();
				session.close();
				return st;
			}
			
		});
		return student;
		
	}

	@Override
	public List<Student> selectAllWhere(Student student) {
		List<Student> studList = hibernateTemplate.execute(new HibernateCallback<List<Student>>() {

			@Override
			public List<Student> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Student where sid = ? and std = ?");
				q.setInteger(0,student.getSid());
				q.setInteger(1,student.getStd());
				List<Student> li = q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return studList;
		
	}
	
}

