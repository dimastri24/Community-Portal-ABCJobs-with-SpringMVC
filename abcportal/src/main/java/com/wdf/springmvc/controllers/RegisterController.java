package com.wdf.springmvc.controllers;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wdf.springmvc.model.User;
import com.wdf.springmvc.service.EmailService;
import com.wdf.springmvc.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	public UserService userService;
	
	@Autowired
	private EmailService emailService;
	
	/*
	 * mapping url for the login page and connect it to the database
	 * */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new User());

		return mav;
	}

	/*
	 * controller for save the input data to the database
	 * goes back to dashboard
	 * */
	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") User user, ModelAndView mav) {

		User checkEmail = userService.findByEmail(user.getEmail());
		
		if (checkEmail != null) {
			mav.setViewName("register");
			mav.addObject("dupe", "Email already registered");
			return mav;
		} else {
			userService.register(user);
			mav.addObject("firstName", user.getFirstName());
			try {
				emailService.sendEmailRegisterSuccess(user.getEmail(), user.getFirstName());
				mav.addObject("msg", "*An email has been sent to you. Please check.");
			} catch (UnsupportedEncodingException | MessagingException e) {
				mav.addObject("error", "Error while sending email.");
			} 
			
			mav.setViewName("thankyou");
			return mav;
		}
		
//		userService.register(user);
//		mav.setViewName("thankyou");
//		mav.addObject("firstName", user.getFirstName());
//		return mav;
		
	}

}
