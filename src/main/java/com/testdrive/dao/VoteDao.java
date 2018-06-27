package com.testdrive.dao;

import java.util.List;

import com.testdrive.model.Vote;

public interface VoteDao {
	
Vote findById(int id);
	
	Vote findByVoteId(int voterid);
	
	void save(Vote employee);
	
	void update(Vote employee);
		
	void deleteByVoteId(String employeeid);
	
	List<Vote> findAllVotes();
	
	VoteDao selectMaxOfVoteId();
	
	List<Vote> selectAllVotes();
	
	List selectConditionList();


}
