package com.testdrive.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testdrive.dao.VoteDao;
import com.testdrive.model.Vote;

@Service("voteService")
@Transactional 
public class VoteServiceImpl implements VoteService{

	@Autowired
	private VoteDao dao;
	
	@Override
	public List<Vote> selectAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllConditionList() {
		// TODO Auto-generated method stub
		return dao.selectConditionList();
	}

}
