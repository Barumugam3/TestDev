package com.testdrive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testdrive.model.Employee;
import com.testdrive.service.EmployeeService;
import com.testdrive.service.VoteService;

@Controller
@RequestMapping("/")
public class AppController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	VoteService voteservice;
			
	@RequestMapping(value = { "/", "/emplist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {
				
		List  empList = voteservice.getAllConditionList();

		
		model.addAttribute("employees1", empList);
		
		List<Employee> employees = employeeService.findAllUsers();
		model.addAttribute("employees", employees);
		//model.addAttribute("loggedinuser", getPrincipal());
		return "employee";
	}

}
