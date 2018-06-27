package com.testdrive.dao;

import java.util.List;

import com.testdrive.model.Candidate;

public interface CandidateDao {
	
Candidate findById(int id);
	
	Candidate findByCandidateId(String employeeid);
	
	void save(Candidate employee);
	
	void update(Candidate employee);
		
	void deleteByCandidateId(String employeeid);
	
	List<Candidate> findAllCandidates();
	
	Candidate selectMaxOfCandidateId();
	
	List<Candidate> selectAllCandidates();


}
