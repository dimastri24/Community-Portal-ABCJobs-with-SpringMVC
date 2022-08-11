package com.wdf.springmvc.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wdf.springmvc.model.User;
import com.wdf.springmvc.service.UserService;

@Controller
public class SearchController {
	
	@Autowired
	public UserService userService;
	
	/*
	 * controller for search another person from user input into request parameter
	 * then listing all the result in result search page
	 * */
    @GetMapping("/search")
    public ModelAndView searchUser(@RequestParam(value = "searchValue", required = false) String searchValue,
    		HttpServletRequest request, HttpServletResponse response, ModelAndView model){
        List<User> userListResponse = userService.searchUser(searchValue);
    	//Optional<User> userListResponse = userService.searchUser(searchValue);
    	
        
    	if (userListResponse == null || userListResponse.isEmpty()) {
    		model.addObject("msgsearchResult", "Sorry we couldn't find any result for " + "'" + searchValue + "'");
    	} else {
    		model.addObject("msgsearchResult", "Result of your search for " + "'" + searchValue + "'");
    		model.addObject("userlist", userListResponse);    		
    	}
    	model.setViewName("searchResult");
        return model;
    }

	/*
	 * controller to see the search user profile
	 * */
	@RequestMapping(value = "/seeprofile/{id}", method = RequestMethod.GET)
	public ModelAndView seeProfile(@PathVariable int id) throws Exception{
		ModelAndView model = new ModelAndView();
		//List<User> user = userService.findUserById(id);
		//Optional<User> user = userService.findUserById(id);
		User user = userService.findUserById(id);

		if (user == null ) {
			model.addObject("msg", "User Profile Can't be found, Please contact us if this message still showing.");
			model.setViewName("filenotfound");
		} else {
			model.addObject("user", user);
			model.setViewName("someoneProfile");
		}
		
		return model;
	}

}
