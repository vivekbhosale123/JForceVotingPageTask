package org.techhub.VotingAppsApplications.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.techhub.VotingAppsApplications.Model.Vote;

@Repository("vRepo")
public class VoteRepositoryImpl implements VoteRepository {

    @Autowired
    JdbcTemplate template;

    @Override
    public void save(Vote vote) 
    {
        String sql = "insert into votes (user_id, candidate_id) values (?, ?)";
        template.update(sql, vote.getUserId(), vote.getCandidateId());
    }

    @Override
    public int countVotesByCandidate(int candidateId) 
    {
        String sql = "select count(*) from votes where candidate_id = ?";
        return template.queryForObject(sql, new Object[]{candidateId}, Integer.class);
    }

    @Override
    public boolean hasUserVoted(Long userId) 
    {
        String sql = "select count(*) from votes where user_id = ?";
        Integer count = template.queryForObject(sql, new Object[]{userId}, Integer.class);
        return count != null && count > 0;
    }
}
