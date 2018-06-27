package com.testdrive.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;
import org.springframework.stereotype.Repository;

import com.testdrive.model.Candidate;
import com.testdrive.model.Vote;

@Repository("VoteDao")
public class VoteDaoImpl extends AbstractDao<Integer, Vote> implements VoteDao{

	@Override
	public Vote findById(int id) {
		// TODO Auto-generated method stub
		return getByKey(id);
	}

	

	@Override
	public void save(Vote employee) {
		persist(employee);// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByVoteId(String employeeid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vote> findAllVotes() {
		
		return null;
		
	}

	@Override
	public VoteDao selectMaxOfVoteId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vote> selectAllVotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vote findByVoteId(int voterid) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List selectConditionList() {
		Criteria accountCriteria = getSession().createCriteria(Vote.class);
		ProjectionList properties = Projections.projectionList();

		//properties.add(Projections.property("candidateid"));
		properties.add(Projections.countDistinct("votersid"));
		properties.add(Projections.groupProperty( "candidateid"));
		accountCriteria.setProjection(properties);
/*		Criteria bookCriteria =  getSession() .createCriteria(Candidate.class);
		ProjectionList properties1 = Projections.projectionList();
		properties1.add(Projections.property("candidateid"));
		bookCriteria.setProjection(properties1);		
		List listDate = bookCriteria.list();*/
		DetachedCriteria candidateQry = DetachedCriteria.forClass(Candidate.class)
		        .setProjection( Property.forName("candidateid") );
		
				//accountCriteria.add( Subqueries.geAll("candidateid", candidateQry) );
				accountCriteria.add( Subqueries.propertyIn("candidateid", candidateQry));
		//accountCriteria.add(Restrictions.in("candidateid", (Collection) Subqueries.geAll("candidateid", candidateQry)));

				
				/*Criteria accountCriteria = getSession().createCriteria(Vote.class, "a");
				accountCriteria.createAlias("vote", "b");
				ProjectionList properties = Projections.projectionList();

				//properties.add(Projections.property("candidateid"));

				properties.add(Projections.groupProperty( "a.candidateid"));
				properties.add(Projections.groupProperty( "b.candidatename"));
				properties.add(Projections.count("a.votersid"));
				accountCriteria.setProjection(properties);
				DetachedCriteria candidateQry = DetachedCriteria.forClass(Candidate.class)
				        .setProjection( Property.forName("candidateid") );		
				accountCriteria.add( Restrictions.eqProperty("a.candidateid", "b.candidateid"));
						accountCriteria.add( Subqueries.propertyIn("a.candidateid", candidateQry));
				//accountCriteria.add(Restrictions.in("candidateid", (Collection) Subqueries.geAll("candidateid", candidateQry)));
*/
				
		
		List employeesnew = accountCriteria.list();
		
		return employeesnew;
	}



}
