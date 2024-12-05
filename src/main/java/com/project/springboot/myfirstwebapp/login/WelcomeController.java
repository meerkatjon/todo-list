package com.project.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("name")
public class WelcomeController {
	
//	private AuthenticationService authenticationService;
//	
//	//private Logger logger = LoggerFactory.getLogger(getClass());
//	
//	//constructor injection
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}
	
	//login page controller
	//@RequestParam String name, ModelMap model - for adding parameters from the url to the page
	@RequestMapping(value="/", method = RequestMethod.GET) //anyone hit this url it will redirect to the jsp page html 
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		//logger.info("request param" + name); //instead of sys out print
		//System.out.println("request param" + name);
		return "welcome";
	}
	private String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}


}
