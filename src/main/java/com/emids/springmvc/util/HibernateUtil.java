package com.emids.springmvc.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emids.springmvc.model.Employee;

@Repository
public class HibernateUtil {

	@Autowired
	private SessionFactory sessionFactory;

	public void create(Employee employee) {
		try {
			sessionFactory.getCurrentSession().save(employee);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Employee");// here persistent
															// class name is Emp
		@SuppressWarnings("unchecked")
		List<Employee> empList = query.list();
		return empList;
	}

	public Employee getEmpById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, id);
		return employee;
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		String hql = "UPDATE Employee set firstname =:empfirstname, lastname =:emplastname, age=:empage, email=:empemail, birthday=:empbirthday, designation=:empdesignation, department=:empdepartment  WHERE id =:empId";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("empId", employee.getId());
		query.setParameter("empfirstname", employee.getFirstname());
		query.setParameter("emplastname", employee.getLastname());
		query.setParameter("empemail", employee.getEmail());
		query.setParameter("empage", employee.getAge());
		query.setParameter("empbirthday", employee.getBirthday());
		query.setParameter("empdesignation", employee.getDesignation());
		query.setParameter("empdepartment", employee.getDepartment());
		int result = query.executeUpdate();
		System.out.println("Rows Affected: " + result);
	}

	public void deleteEmpById(int id) {
		// TODO Auto-generated method stub
		
		/* * Query query = sessionFactory.getCurrentSession().createSQLQuery(
		 * "delete from Employee where id = :id"); query.setParameter("id", id);
		 * query.executeUpdate();
		 */

		String hql = "DELETE FROM Employee " + "WHERE id = :empid";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("empid", id);
		int result = query.executeUpdate();
		System.out.println("Rows Affected: " + result);
	}

}
