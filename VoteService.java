package org.techhub.VotingAppsApplications.Service;

public interface VoteService {
	
    void vote(Long userId, int candidateId);
    int getVotes(int candidateId);
    boolean hasVoted(Long userId);
}
