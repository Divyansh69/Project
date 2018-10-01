package com.niit.controller;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.Model.Category;
import com.niit.Model.Product;
import com.niit.Model.User;
	import com.niit.Repository.UserRepository;
	@Controller
	public class UserController {
		@Autowired
		User user;
		@Autowired
		UserRepository userRepository;
		
		@Autowired
		Category category;
		
		@RequestMapping(value="addUser", method=RequestMethod.POST)
		public String register(@ModelAttribute("user") User user){
			userRepository.addUser(user);
			
			return "login";
			
		}
		@RequestMapping("/addUser")
		public String userAdd(Model model)
		{ List<User> AllUser= userRepository.getAllUser();
			model.addAttribute("cus",new User());
			model.addAttribute("userList",AllUser);
			return "User";
		}

	}
