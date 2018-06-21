package demo.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demo.spring.mvc.dto.UserDetails;

@Controller
@RequestMapping("/usertransactions")
public class UserTransactionsController {

	@Autowired
	ModelAndView model;
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public ModelAndView registerUser(@RequestBody UserDetails userDetails) {
		
		return null;
		
	}
}
