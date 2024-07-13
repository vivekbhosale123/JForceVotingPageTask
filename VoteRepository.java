package org.techhub.VotingAppsApplications.Repository;

import org.techhub.VotingAppsApplications.Model.Vote;

public interface VoteRepository {
    void save(Vote vote);
    int countVotesByCandidate(int candidateId);
    boolean hasUserVoted(Long userId);
}
