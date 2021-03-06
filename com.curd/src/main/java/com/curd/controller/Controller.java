package com.curd.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.curd.Entities.Product;
import com.curd.dao.ProductDao;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	public ProductDao prodDao;
	@RequestMapping("/")
	public String view(Model mod) {
		List<Product> products = prodDao.getStudent();
		mod.addAttribute("listOfProducts",products);
		System.out.println("hi this is home controller");
		return "index";
	}
	@RequestMapping("/addProduct")
	public String AddProduct(Model m) {
		m.addAttribute("title","Add product");
		return "add-product-form";
	}
@RequestMapping(method = RequestMethod.POST,path  = ("/takeForm"))
	public RedirectView takeForm(@ModelAttribute Product model,HttpServletRequest req) {
System.out.println(model);
prodDao.createProduct(model);
RedirectView rd=new RedirectView();
	rd.setUrl(req.getContextPath()+"/");

		return rd;
	}
@RequestMapping("/deleteProduct/{id}")
public RedirectView deleteProduct(@PathVariable("id") int id, HttpServletRequest req) {
	this.prodDao.deleteProduct(id);
	RedirectView rd=new RedirectView();
	rd.setUrl(req.getContextPath()+"/");

		return rd;
}
@RequestMapping("/updateProduct/{id}")
public String updateProduct(@PathVariable("id") int id,Model m) {
 Product product = this.prodDao.getProduct(id);
	m.addAttribute("product", product);

		return "updateForm";
}

@RequestMapping(method = RequestMethod.POST,path  = ("/updateForm"))
public RedirectView updateForm(@ModelAttribute Product model,HttpServletRequest req) {
System.out.println(model);
prodDao.createProduct(model);
RedirectView rd=new RedirectView();
rd.setUrl(req.getContextPath()+"/");

	return rd;
}

}
