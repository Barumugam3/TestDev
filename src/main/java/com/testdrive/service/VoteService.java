package com.testdrive.service;

import java.util.List;

import com.testdrive.model.Employee;
import com.testdrive.model.Vote;

public interface VoteService {
	
	List<Vote> selectAllEmployees();
	List getAllConditionList();

}
