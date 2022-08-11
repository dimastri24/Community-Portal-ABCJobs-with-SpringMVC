package com.wdf.springmvc.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wdf.springmvc.model.User;
import com.wdf.springmvc.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private UserService userService;

	/*
	 * controller for see admin profile
	 * get the session and retrieve data from database
	 * */
	@RequestMapping(value = "/adprofile", method = RequestMethod.GET)
	public ModelAndView seeProfile(HttpServletRequest request) throws Exception{
		ModelAndView model = new ModelAndView();
        HttpSession session = request.getSession(true);
        Integer userId = (int)session.getAttribute("userId");
        //List<User> user = userService.findUserById(userId);
       User user = userService.findUserById(userId);

		if (user == null) {
			model.addObject("msg", "User Profile Can't be found.");
			model.setViewName("filenotfound");
		} else {
			model.addObject("user", user);
			model.setViewName("admin-profile");
		}
		
		return model;
	}
	
	/*
	 * controller for listing all user from database
	 * then pass it to the view
	 * */
	@RequestMapping(value = "/dashboard")
	public ModelAndView showAllUsers(ModelAndView model) {
		List<User> listuser = userService.showAllUsers();
		model.addObject("listuser", listuser);
		model.setViewName("admin-dashboard");
		
		return model;
	}

	/*
	 * controller for adding new user
	 * goes to add form
	 * */
	@RequestMapping(value = "/adduser", method = RequestMethod.GET)
	public ModelAndView addUser() {
		ModelAndView mav = new ModelAndView("admin-add");
		mav.addObject("user", new User());
		
		return mav;
	}

	/*
	 * controller for retrieve data that will be edit
	 * goes to edit form
	 * */
	@RequestMapping(value = "/edituser/{id}", method = RequestMethod.GET)
	public ModelAndView editUser(@PathVariable int id, ModelAndView model) {
		//List<User> listuser = userService.findUserById(id);
		//Optional<User> listuser = userService.findUserById(id);
		User user = userService.findUserById(id);

		if (user == null) {
			model.addObject("msg", "Edit User data Can't be found.");
			model.setViewName("filenotfound");
		} else {
			model.addObject("user", user);
			model.setViewName("admin-edit");
		}
//		if (listuser == null || !listuser.isPresent()) {
////			profile id is not found
//		} else {
//			model.addObject("user", listuser);
//			model.setViewName("admin-add");
//		}
		
		return model;
	}
	
	/*
	 * controller for collecting the edited data
	 * passed it to database
	 * goes back to dashboard
	 * */
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView updateUser(
			@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, @RequestParam("pass") String pass,
			@RequestParam("country") String country, @RequestParam("city") String city,
			@RequestParam("phone") String phone, @RequestParam("company") String company, 
			@RequestParam("userID") Integer userID) {

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName); 
		user.setEmail(email);
		user.setPass(pass);
		user.setCountry(country);
		user.setCity(city);
		user.setPhone(phone);
		user.setCompany(company);
		user.setUserID(userID);
	
		userService.updateUser(user);

		return new ModelAndView("redirect:/admin/dashboard");
			
//			@ModelAttribute("user")User user) {
//		
//		userService.updateUser(user);
//		
//		return new ModelAndView("redirect:/admin/dashboard");
	}

	/*
	 * controller for save the input data to the database
	 * goes back to dashboard
	 * */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveChange(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("user") User user) {

		userService.register(user);

		return new ModelAndView("redirect:/admin/dashboard");
	}
	
	/*
	 * controller for delete user data by using the user id
	 * to specify which one
	 * */
	@RequestMapping(value = "/deleteuser/{id}", method = RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
		
		return new ModelAndView("redirect:/admin/dashboard");
	}

}
