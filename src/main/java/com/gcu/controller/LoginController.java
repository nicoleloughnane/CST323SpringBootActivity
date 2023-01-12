package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private OrdersBusinessInterface service;
	
	@Autowired
	private SecurityBusinessService security;
	
	
	@GetMapping("/")
	public String display(Model model) {
		//display login form view
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		//print out values of form
		//System.out.println(String.format("Form with username of %s and password of %s", loginModel.getUsername(), loginModel.getPassword()));
		//check for validation errors
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		//call to the test method
		service.test();
		
		//security business service
		security.authenticate(loginModel.getUsername(), loginModel.getPassword());
		
		//display orders view
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", service.getOrders());
		return "orders";
	}
	
}
