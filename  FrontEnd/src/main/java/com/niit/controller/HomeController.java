
package com.niit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.Backend.RepositoryImpl.CategoryRepositoryImpl;
import com.niit.Backend.RepositoryImpl.ProductRepositoryImpl;
import com.niit.Backend.RepositoryImpl.UserRepositoryImpl;
import com.niit.Model.Category;
import com.niit.Model.Product;
import com.niit.Model.User;
import com.niit.Repository.CategoryRepository;
import com.niit.Repository.ProductRepository;
import com.niit.Repository.UserRepository;
	



	@Controller
	public class HomeController {
		@Autowired
		 Category category;
				
		@Autowired
	    	CategoryRepository categoryRepository;

		@Autowired
		 Product product;
				
		@Autowired
	    	ProductRepository productRepository;		
		
		@Autowired
		 User user;
				
		@Autowired
	    	UserRepository userRepository;		
		
		
		@RequestMapping("/Registration")
		public String Registration()
		{
			return "Registration";
		}
		@RequestMapping("/login")
		public String login()
		{
			return "login";
		}
		
		
		@RequestMapping("/")
		public String homePage()
		{
			return "index";
		}
		
		@RequestMapping("/Category")
		public String categoryPage(Model model)
		{  List<Category> AllCategories= categoryRepository.getAllCategory();
			model.addAttribute("cat",category);
			model.addAttribute("categoryList",AllCategories);
			return "Category";
			
			
			
			
		}
		
		@RequestMapping("/Product")
		public String productPage(Model model)
		{  List<Product> AllProduct= productRepository.getAllProduct();
			model.addAttribute("pro",product);
			model.addAttribute("productList",AllProduct);
			return "Product";
			
		}
		
	}

