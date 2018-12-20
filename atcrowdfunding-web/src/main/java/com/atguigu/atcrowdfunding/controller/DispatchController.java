package com.atguigu.atcrowdfunding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.atcrowdfunding.service.UserService;

@Controller
public class DispatchController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index(){
		System.out.println(userService);
		return "index";
	}
}
