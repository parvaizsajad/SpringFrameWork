package com.spring.mvc.HomeController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.jasper.tagplugins.jstl.core.Out;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;
import com.spring.service.UserService;

@Controller
public class form {

	@RequestMapping("/form")
	public String view() {
		return "form";
	}
	@ModelAttribute
	public void commonForm(Model md) {
		md.addAttribute("welcomeName", "welcome Parvaiz Sajad");
		md.addAttribute("desc", "hello programmers");
	}
	@Autowired
	 private UserService userService;

	@RequestMapping(path = "processform",method = RequestMethod.POST)
	public String getForm(@ModelAttribute User user,Model model) {
		if(user.getName().isBlank()) {
			model.addAttribute("msg1","All fields are mendatory");
			return "redirect:/form";
		}
		int id = this.userService.createUser(user);
		
		model.addAttribute("msg","the user has been created successfully with id:   "+id);
		return"success";
	}
	
	/*
	 * @RequestMapping(path = "processform",method = RequestMethod.POST) public
	 * String getForm(@RequestParam("email") String email, @RequestParam("name")
	 * String name,
	 * 
	 * @RequestParam("password") String password, Model model) {
	 * 
	 * System.out.println("email:"+email); System.out.println("user name: "+name);
	 * System.out.println("user Password :"+ password);
	 * 
	 * User user =new User(email, name, password); model.addAttribute("user",user);
	 * return"success"; }
	 */
}
