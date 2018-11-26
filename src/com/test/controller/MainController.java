package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	 @RequestMapping(value="/main")
	 public ModelAndView main(HttpServletRequest request){
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("main/main");
		 return modelAndView;
	 }
	 
	 @RequestMapping(value="/logout")
	 public String Logout(HttpSession session)
	 {
		session.invalidate();//销毁session
		 return "login";
	 }
}
