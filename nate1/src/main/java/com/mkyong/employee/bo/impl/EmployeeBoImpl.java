package com.mkyong.employee.bo.impl;

import com.mkyong.employee.bo.EmployeeBo;
import com.mkyong.employee.dao.EmployeeDao;
import com.mkyong.employee.model.Employee;

public class EmployeeBoImpl implements EmployeeBo{
	
	EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void save(Employee employee){
		employeeDao.save(employee);
	}
	
	public void update(Employee employee){
		employeeDao.update(employee);
	}
	
	public void delete(Employee employee){
		employeeDao.delete(employee);
	}
	
	public Employee findByEmployeeCode(String employeeCode){
		return employeeDao.findByEmployeeCode(employeeCode);
	}

	public Employee findByemployeeCode(String employeeCode) {
		// TODO Auto-generated method stub
		return null;
	}
}
