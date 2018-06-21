package demo.spring.mvc.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.spring.mvc.dto.UserDetails;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	@Autowired
	UserDetails userDetails;
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello(final Model model) {
		userDetails.setUserid(UUID.randomUUID().toString());
		model.addAttribute("userid",userDetails.getUserid());
		return "hello-world";
		
	}
}