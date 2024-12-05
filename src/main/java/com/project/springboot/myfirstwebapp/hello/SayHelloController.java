package com.project.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//"say-hello" - url returns "hello! whar are you learning today?"
	//url - http://localhost:8081/say-hello
	@RequestMapping("say-hello") //anyone hit this url the below msg returns back
	@ResponseBody
	public String sayHello() {
		return "Hello! whar are you learning today?";
	}
	
	@RequestMapping("say-hello-html") //for html
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append(false);
		
		return "Hello! whar are you learning today?";
	}
	
	@RequestMapping("say-hello-jsp") //anyone hit this url it will redirect to the jsp page html 
	
	public String sayHelloJsp() {
		return "sayHello";
	}
	
	

}
