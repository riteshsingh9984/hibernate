package com.mkyong.employee.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mkyong.employee.dao.EmployeeDao;
import com.mkyong.employee.model.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{
	
	public void save(Employee employee){
		getHibernateTemplate().save(employee);
	}
	
	public void update(Employee employee){
		getHibernateTemplate().update(employee);
	}
	
	public void delete(Employee employee){
		getHibernateTemplate().delete(employee);
	}
	
	public Employee findByEmployeeCode(String employeeCode){
		List list = getHibernateTemplate().find("from Employee where employeeCode=?",employeeCode);
		return (Employee)list.get(0);
	}

}
