package com.mkyong.employee.dao;

import com.mkyong.employee.model.Employee;

public interface EmployeeDao {
	
	void save(Employee employee);
	
	void update(Employee employee);
	
	void delete(Employee employee);
	
	Employee findByEmployeeCode(String employeeCode);

}
