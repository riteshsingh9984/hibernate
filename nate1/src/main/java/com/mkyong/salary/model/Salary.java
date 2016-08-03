package com.mkyong.salary.model;

import java.io.Serializable;

public class Salary implements Serializable {

	private Long employeeId;
	private String salary;
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [ employeeId=" + employeeId
				+ ", employeeSalary=" + salary + "]";
	}
}
