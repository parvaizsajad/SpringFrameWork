package com.springMvc.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class ImageController {
	@RequestMapping("/upload")
	public String ImageUpload() {
		
		return"fileForm";
	}
	
	@RequestMapping(path = "/handleImage",method = RequestMethod.POST)
 public String handleImage(@RequestParam("image") CommonsMultipartFile im,HttpSession ss,Model mod) {
		System.out.println(im.getContentType());
		System.out.println(im.getName());
		System.out.println(im.getSize());
		System.out.println(im.getStorageDescription());
		System.out.println(im.getOriginalFilename());
	 System.out.println("here we will handle images");
	 byte[] Fbytes = im.getBytes();
	 System.out.println("**********************************");
	 //we need to save this file 
	 String realPath = ss.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+im.getOriginalFilename();
	 FileOutputStream fio;
	try {
		fio = new FileOutputStream(realPath);
		try {
			fio.write(Fbytes);
			fio.close();
			System.out.println("done file uploading");
			Model addAttribute = mod.addAttribute("msg", im.getOriginalFilename().toString());
			mod.addAttribute("success", "file Uploaded successfully");
			 System.out.println(realPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			mod.addAttribute("success","something went wrong");
		}
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		mod.addAttribute("success","something went wrong");
		e.printStackTrace();
	}

	
	 
	 return"imageSuccess";
 }
}
