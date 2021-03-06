package com.spring.mvc.HomeController;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/help")
	public String help() {
		System.out.println("this is out help page");
		
		return "help";
	}

	@RequestMapping("/home")
	public String Home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","Parvaiz sajad");
		List<String> friends= new ArrayList<String>();
		friends.add("baabji");
		friends.add("moina");
		friends.add("Marilyn");
		friends.add("parvaiz");
		model.addAttribute("f",friends);
		return "index";
	}
	@RequestMapping("/about")
	public ModelAndView about() {
		System.out.println("this is out about page");
		ModelAndView mv= new ModelAndView();
		mv.addObject("name","Parvaiz sajad");
		LocalDateTime now = LocalDateTime.now();
		//List 
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(12);
		marks.add(23);
		marks.add(33);
		marks.add(2020);
		mv.addObject("marks", marks);
		mv.addObject("date",now);
		mv.addObject("roll_no",12345);
		
		
		mv.setViewName("about");
		
		return mv;
	}
	@RequestMapping("/services")
	public String services() {
		
		System.out.println("this is the services page");
		return "services";
	}
	
}
