package org.techhub.VotingAppsApplications.Model;

public class Vote {

	private Long id;
	private Long userId;
	private int candidateId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public Vote() {
		super();
		this.id = id;
		this.userId = userId;
		this.candidateId = candidateId;
	}
	
}
