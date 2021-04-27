package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import models.*;


@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String Main(Login login)
	{
		//login.addAttribute("login", new Login());
		return "Login";
	}
	
	/**
	@ResponseBody
	@RequestMapping
	String entry() {
		return "My test string this works u know it does";
	}**/
	
	@RequestMapping("/login")
	public String Login(Login login)
	{
		//login.addAttribute("login", new Login());
		return "Login";
	}
	
	
}
