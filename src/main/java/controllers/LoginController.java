package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import models.*;



@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String Main(Model model)
	{
		Login login = new Login();
        //login.addAttribute(string1);
		//login.addAttribute("login", new Login());
		model.addAttribute("login", login);
		return "Login";
	}
	
	/**
	@ResponseBody
	@RequestMapping
	String entry() {
		return "My test string this works u know it does";
	}**/
	
	//@RequestMapping("/login")
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	@PostMapping("/login")
	public String Login(@ModelAttribute("login") Login login)
	{
		System.out.println(login.email);
		var x = login;
		var y = "timing";
		//login.addAttribute("login", new Login());
		return "Login";
	}
	
	//public String Login(Logi)
	
	
}
