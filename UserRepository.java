package org.techhub.VotingAppsApplications.Repository;

import org.techhub.VotingAppsApplications.Model.User;

public interface UserRepository {
	
    User findByUsernameAndPassword(String username, String password);
    void save(User user);
    Long findUserIdByUsername(String username);
    boolean hasVoted(Long userId);
}
