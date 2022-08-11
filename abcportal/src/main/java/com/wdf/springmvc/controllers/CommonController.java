package com.wdf.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * common controller used to be for developed purpose only
 * */
@Controller
public class CommonController {

	/*
	 * for mapping he homepage url
	 * */
	@RequestMapping("/homepage")
	public String toHome(){
		return "homepage";
	}
	
	/*
	 * for developed purpose only
	 * */
	@RequestMapping("/thankyou")
	public String toThanks(){
		return "thankyou";
	}
	
	@RequestMapping("/")
	public String toLanding(){
		return "index";
	}
	
}
