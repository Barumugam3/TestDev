package com.testdrive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testdrive.dao.EmployeeDao;
import com.testdrive.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Employee findByEmployeeId(String employeeid) {
		// TODO Auto-generated method stub
		return dao.findByEmployeeId(employeeid);
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		saveEmployee(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		updateEmployee(employee);
		
	}

	@Override
	public void deleteEmployeeByEmployeeId(String employeeid) {
		// TODO Auto-generated method stub
		deleteEmployeeByEmployeeId(employeeid);
	}

	@Override
	public List<Employee> findAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAllEmployees();
	}

	@Override
	public boolean isUserEmployeeIdUnique(Integer id, String employeeid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findMaxOfEmployeeId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> selectAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
