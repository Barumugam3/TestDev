package com.testdrive.dao;

import java.util.List;

import com.testdrive.model.Employee;

public interface EmployeeDao {
	
Employee findById(int id);
	
	Employee findByEmployeeId(String employeeid);
	
	void save(Employee employee);
	
	void update(Employee employee);
		
	void deleteByEmployeeId(String employeeid);
	
	List<Employee> findAllEmployees();
	
	Employee selectMaxOfEmployeeId();
	
	List<Employee> selectAllEmployees();

}
