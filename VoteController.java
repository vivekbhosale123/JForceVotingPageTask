package org.techhub.VotingAppsApplications.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.techhub.VotingAppsApplications.Service.UserService;
import org.techhub.VotingAppsApplications.Service.VoteService;

@Controller
public class VoteController {

    @Autowired
    VoteService vServ;

    @Autowired
    UserService uServ;

    @RequestMapping(value = "/vote", method = RequestMethod.GET)
    public ModelAndView votePage(HttpSession session) 
    {
        String username = (String) session.getAttribute("username");

        if (username == null) {
        	
            return new ModelAndView("redirect:/login");
        }

        Long userId = uServ.getUserIdByUsername(username);

        if (userId == null) 
        {
         
            return new ModelAndView("error", "message", "User not found");
        }

        if (vServ.hasVoted(userId)) 
        {
            return new ModelAndView("vote", "message", "You have already voted");
        } 
        else 
        {
        	
            return new ModelAndView("vote");
        }
    }

    @RequestMapping(value = "/vote", method = RequestMethod.POST)
    public ModelAndView vote(int candidate, HttpSession session) {
        String username = (String) session.getAttribute("username");

        if (username == null) {
        
            return new ModelAndView("redirect:/login");
        }

        Long userId = uServ.getUserIdByUsername(username);

        if (userId == null) 
        {

            return new ModelAndView("error", "message", "User not found");
        }
        
        vServ.vote(userId, candidate);
        return new ModelAndView("vote", "message", "Thank you for voting");
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView adminPage(HttpSession session)
    {
        String username = (String) session.getAttribute("username");

        if (username == null || !username.equals("admin")) 
        {
            return new ModelAndView("redirect:/login");
        }
        
        ModelAndView mav = new ModelAndView("admin");
        mav.addObject("candidate1Votes", vServ.getVotes(1));
        mav.addObject("candidate2Votes", vServ.getVotes(2));
        mav.addObject("candidate3Votes", vServ.getVotes(3));
        mav.addObject("candidate4Votes", vServ.getVotes(4));
        return mav;
    }

}
