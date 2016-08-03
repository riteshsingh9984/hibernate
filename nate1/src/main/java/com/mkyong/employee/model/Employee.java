package com.mkyong.employee.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long employeeId;
	private String employeeCode;
	private String employeeName;

	public Employee() {
	}

	public Employee(String employeeCode, String employeeName) {
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
	}

	public Long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeCode=" + employeeCode + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + "]";
	}

	
}
