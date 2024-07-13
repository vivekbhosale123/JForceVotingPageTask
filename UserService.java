package org.techhub.VotingAppsApplications.Service;

import org.techhub.VotingAppsApplications.Model.User;

public interface UserService {
	
    boolean validateUser(String username, String password);
    void registerUser(User user);
    Long getUserIdByUsername(String username);
    boolean hasVoted(Long userId);
}
