package com.springMvc.search;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchController {
	@RequestMapping("/path/{id}/{userName}")
	public String PAthHandler(@PathVariable("id") int id,@PathVariable("userName") String name) {
		
		System.out.println("the id in path varriable is "+id);
		System.out.println("the name in path varriable is "+name);
		return("home");
	}
	
	
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("going to home view");
		
		/*
		 String vall =null; System.out.println(vall.length());
		 */
		
		
		return("home");
	}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	public String errorHandler() {
		
		return "nullException";
	}
@RequestMapping("/search")
	public RedirectView search(@RequestParam("search") String sear) {
		String querry="https://www.google.com/search?q="+sear;
		RedirectView rd=new RedirectView();
		if(sear.isBlank()) {
		 rd.setUrl("home");
		 return rd;
		}

		
		rd.setUrl(querry);
		return rd;
	}
}
