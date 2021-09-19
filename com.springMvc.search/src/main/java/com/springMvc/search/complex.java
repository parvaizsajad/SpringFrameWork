package com.springMvc.search;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class complex {

	@RequestMapping("/complex")
	public String complexform() {
		
		return"/complex";
	}
	
	@RequestMapping(path = "/handleform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute Form form,BindingResult result) {
		if(result.hasErrors()) {
			return"/complex";
		}
	System.out.println(form.getAddress());
		return "/login";
	}
}
