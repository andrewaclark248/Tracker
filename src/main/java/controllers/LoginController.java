package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String Login()
	{
		return "Login";
	}
	
	@ResponseBody
	@RequestMapping
	String entry() {
		return "My test string this works u know it does";
	}
}
