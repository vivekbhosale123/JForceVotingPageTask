package org.techhub.VotingAppsApplications.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.VotingAppsApplications.Model.Vote;
import org.techhub.VotingAppsApplications.Repository.VoteRepository;

@Service("vServ")
public class VoteServiceImpl implements VoteService {

    @Autowired
    VoteRepository vRepo;

    @Override
    public void vote(Long userId, int candidateId) 
    {
        Vote vote = new Vote();
        vote.setUserId(userId);
        vote.setCandidateId(candidateId);
        vRepo.save(vote);
    }

    @Override
    public int getVotes(int candidateId) 
    {
        return vRepo.countVotesByCandidate(candidateId);
    }

    @Override
    public boolean hasVoted(Long userId) 
    {
        return vRepo.hasUserVoted(userId);
    }
}
