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

import com.sbs.dto.Staff;
import com.sbs.dto.Student;

@Repository
public class StaffDaoImple implements StaffDao {

	@Autowired
	private HibernateTemplate hibernateTemplate; 
	
	@Override
	public void addStaff(Staff staff) {
			hibernateTemplate.execute(new HibernateCallback<Void>() {

				@Override
				public Void doInHibernate(Session session) throws HibernateException {
					Transaction tr=session.beginTransaction();
					session.save(staff);
					tr.commit();
					session.flush();
					session.close();
					return null;
				}
				
			}); 
		}
		

	@Override
	public void updateStaff(Staff staff) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr=session.beginTransaction();
				session.update(staff);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		}); 
		
	}

	@Override
	public void deleteStaff(String staffId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Staff(staffId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public Staff selectStaff(String staffId) {
		Staff staff = hibernateTemplate.execute(new HibernateCallback<Staff>() {

			@Override
			public Staff doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Staff st = (Staff)session.get(Staff.class, staffId);
				tr.commit();
				session.flush();
				session.close();
				return st;
			}
			
		});
		return staff;
	}

	@Override
	public List<Staff> selectAll() {
		List<Staff> staffList = hibernateTemplate.execute(new HibernateCallback<List<Staff>>() {

			@Override
			public List<Staff> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Staff");
				List<Staff> li = q.list(); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return staffList;
	}


	@Override
	public Staff selectBillst(String staffId) {
		Staff staff = hibernateTemplate.execute(new HibernateCallback<Staff>() {

			@Override
			public Staff doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q=session.createQuery("from Staff where staffId =?");
				System.out.println(staffId);
				q.setString(0,staffId);
		
			    Staff stf = (Staff)session.get(Staff.class, staffId);
				tr.commit();
				session.flush();
				session.close();
				return stf;
			}
			
		});
		return staff;
	}


	@Override
	public List<Staff> selectAllWherest(Staff staff) {
		List<Staff> staffList = hibernateTemplate.execute(new HibernateCallback<List<Staff>>() {

			@Override
			public List<Staff> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Staff where staffId = ?");
				q.setString(0,staff.getStaffId());
				
				List<Staff> li = q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return staffList;
	}

}
