package org.techhub.VotingAppsApplications.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.VotingAppsApplications.Model.User;
import org.techhub.VotingAppsApplications.Repository.UserRepository;

@Service("uServ")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository uRepo;

    @Override
    public boolean validateUser(String username, String password) 
    {
        return uRepo.findByUsernameAndPassword(username, password) != null;
    }

    @Override
    public void registerUser(User user)
    {
        uRepo.save(user);
    }

    @Override
    public Long getUserIdByUsername(String username) 
    {
        return uRepo.findUserIdByUsername(username);
    }

    @Override
    public boolean hasVoted(Long userId) 
    {
        return uRepo.hasVoted(userId);
    }
}
