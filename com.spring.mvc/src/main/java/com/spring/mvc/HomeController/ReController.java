package com.spring.mvc.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView One() {
		System.out.println("this is controller one");
		RedirectView rv=new RedirectView();
		rv.setUrl("two");
		return rv;
	}

	/*
	 * @RequestMapping("/one") public String One() {
	 * System.out.println("this is controller one"); return"redirect:/two"; }
	 */
@RequestMapping("/two")
	public String Two() {
		System.out.println("this is controller two");
		return"form";
	}

}
