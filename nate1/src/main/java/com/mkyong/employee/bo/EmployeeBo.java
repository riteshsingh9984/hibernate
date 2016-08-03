package com.mkyong.employee.bo;

import com.mkyong.employee.model.Employee;

public interface EmployeeBo {
	
	void save(Employee employee);
	
	void update(Employee employee);
	
	void delete(Employee employee);
	
	Employee findByEmployeeCode(String employeeCode);

}
