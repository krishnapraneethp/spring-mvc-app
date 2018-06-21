package demo.spring.mvc.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	@Autowired
	ModelAndView model;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView hello() {
		
		model.addObject("userid", UUID.randomUUID().toString());
		model.setViewName("user-registration");
		return model;
		
	}
}