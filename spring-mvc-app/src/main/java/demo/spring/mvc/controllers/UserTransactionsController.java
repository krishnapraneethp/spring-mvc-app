package demo.spring.mvc.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.spring.mvc.dto.UserDetails;

@Controller
@RequestMapping("/usertransactions")
public class UserTransactionsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserTransactionsController.class);
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("UserDetails") UserDetails userDetails, Model model) {
		
		if(userDetails!=null) {
			LOGGER.info("Username: "+userDetails.getUsername());
			model.addAttribute("username", userDetails.getUsername());
			return "success";
		}
		
		return "failure";
		
	}
}