package org.byn.stickynotes.controllers;

import java.util.Date;

import org.byn.stickynotes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value="/")
	//@ResponseBody
	public String showHomePage(){
		return "index";
	}
		
	@RequestMapping(value="/userLogin", method=RequestMethod.GET)
	public String goToLoginPage(ModelMap model){
		model.put("timestamp", new Date());
		return "login";
	}
	
	@RequestMapping(value="/userLogin", method=RequestMethod.POST)
	//@ResponseBody
	public String goToLoginPage(@RequestParam String uname, @RequestParam String pwd, ModelMap model){
		if(userService.validateUser(uname, pwd)){
			model.put("username", uname);
			return "profile";
		}
		else{
			model.put("errorMessage", "Invalid Creditials!!");
			model.put("timestamp", new Date());
			return "login";
		}
	}
	
	@RequestMapping(value="/userSignup", method=RequestMethod.GET)
	public String goToRegisterPage(){
		return "signup";
		
	}
	
	@RequestMapping(value="/userSignup", method=RequestMethod.POST)
	@ResponseBody
	public String goToRegisterPage(@RequestParam String name, @RequestParam String email, @RequestParam String uname, @RequestParam String pwd){
		
			System.out.println("Username "+name);
			System.out.println("email "+email);
		return "your sign up is successful";
	}

}
