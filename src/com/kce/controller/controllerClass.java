package com.kce.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kce.model.RegisterBean;
import com.kce.model.RegisterBean;
import com.kce.service.Service;

public class controllerClass {
	
	@Autowired
	HttpServletRequest request;


	@Autowired
	Service service;
	
	@Autowired
	HttpSession ses;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView doStart() {
		return new ModelAndView("Home");
	}
	
	@RequestMapping("/login2")
	public String login2() {
		return "redirect:/login";
	}
	
	@RequestMapping("/sign")
	public String sign() {
		return "redirect:/signup";
	}

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public String validate(@ModelAttribute("login") RegisterBean login) {
		String name = login.getName();
		String passw = login.getPass();
		
		
				if (service.validate(name, passw) == 1) {
					return ("Landing");
				} else {
					return ("redirect:/login");
				}
	}



@RequestMapping("/login")
public String login() {
	return "Login";
}

@RequestMapping(value = "/register", method = RequestMethod.POST)
public String reg(@ModelAttribute("regBean") RegisterBean regBean) {

	if (regBean.getName() != null && regBean.getEmail() != null && regBean.getPass() != null
			&& regBean.getPhone() != null) {
		if (service.reg(regBean) != null) {
			return "redirect:/login";
		}
	}

	return "redirect:/signup";
}

@RequestMapping("/signup")
public String signup() {
	return "Registration";
}

@RequestMapping("/reset")
public String reset() {
	return "Reset";
}

@RequestMapping("/add")
public String add() {
	return "Add";
}

@RequestMapping("/search")
public String search() {
	return "Search";
}



@RequestMapping(value = "/resetPass", method = RequestMethod.POST)
public String resetPass(@ModelAttribute("repass") RegisterBean repass) {
	String pass1 = repass.getPass1();
	String pass2 = repass.getPass2();
	
	
			if (service.resetpass(pass1, pass2) == 1) {
				return ("Landing");
			} else {
				return ("Reset");
			}
}
}

