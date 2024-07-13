package org.techhub.VotingAppsApplications.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.techhub.VotingAppsApplications.Model.User;
import org.techhub.VotingAppsApplications.Service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService uServ;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginPage() 
    {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(String username, String password, HttpSession session)
    {
        if (username.equals("admin") && password.equals("admin")) 
        {
            session.setAttribute("username", username);
            return new ModelAndView("redirect:/admin");
            
        } else if (uServ.validateUser(username, password)) {
        	
            session.setAttribute("username", username);
            return new ModelAndView("redirect:/vote");
            
        } else {
        	
            return new ModelAndView("login", "error", "Invalid credentials");
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage() 
    {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(User user) 
    {
        uServ.registerUser(user);
        return new ModelAndView("login", "message", "Registration successful");
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logout(HttpSession session) 
    {
        session.invalidate();
        return "redirect:/login";
    }
}
