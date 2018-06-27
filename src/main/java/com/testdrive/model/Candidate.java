package com.testdrive.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CANDIDATE")
public class Candidate {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int candidateid;
	
	@Column(name="CANDIDATENAME")
	private String candidatename;
	
	public int getCandidateid() {
		return candidateid;
	}

	public void setCandidateid(int candidateid) {
		this.candidateid = candidateid;
	}

	public String getCandidatename() {
		return candidatename;
	}

	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + candidateid;
		result = prime * result + ((candidatename == null) ? 0 : candidatename.hashCode());
		
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
		Candidate other = (Candidate) obj;
		if (candidateid != other.candidateid)
			return false;
		if (candidatename == null) {
			if (other.candidatename != null)
				return false;
		} else if (!candidatename.equals(other.candidatename))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Candidate [candidateid=" + candidateid + ", candidatename=" + candidatename + "]";
	}
	

}
