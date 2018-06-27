package com.testdrive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="VOTE")
@Entity
public class Vote {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="VOTERSID")
	private int votersid;
	
	@Column(name="CANDIDATEID")
	private int candidateid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVotersid() {
		return votersid;
	}

	public void setVotersid(int votersid) {
		this.votersid = votersid;
	}

	public int getCandidateid() {
		return candidateid;
	}

	public void setCandidateid(int candidateid) {
		this.candidateid = candidateid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + candidateid;
		result = prime * result + id;
		result = prime * result + votersid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		if (candidateid != other.candidateid)
			return false;
		if (id != other.id)
			return false;
		if (votersid != other.votersid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", votersid=" + votersid + ", candidateid=" + candidateid + "]";
	}
	
	

}
