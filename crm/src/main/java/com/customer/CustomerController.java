package com.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CustomerController {
	
	@RequestMapping("/")
	public String listCustomere(Model model) {
		return "home";
	}

}
