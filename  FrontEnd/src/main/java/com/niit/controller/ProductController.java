
	package com.niit.controller;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.niit.Repository.CategoryRepository;
import com.niit.Model.Category;
import com.niit.Model.Product;
import com.niit.Repository.ProductRepository;

	@Controller
	public class ProductController {
		@Autowired
		Product product;
		@Autowired
		CategoryRepository categoryRepository;

		
		@Autowired
		ProductRepository productRepository;

		@RequestMapping(value="/addProduct",method=RequestMethod.POST)
		public String productAdd(@ModelAttribute("cat") Product product)
		{
			if(product.getProductId()==0)
			{
				productRepository.addProduct(product);
			}
			else
			{
				productRepository.updateProduct(product);
			}
			
			return "redirect:/Product";
		}
		
		
		@RequestMapping("/deleteProduct/{id}")
		
			public String productDelete(@PathVariable("id") int productId)
			{
			productRepository.deleteProduct(productId);
				return "redirect:/Product";
		}
		
		
		@RequestMapping("/editProduct/{id}")
		
		public String productUpdate(@PathVariable("id") int productId,Model model)
		{
			Product productData=productRepository.getProductId(productId);
			List<Category> AllCategory= categoryRepository.getAllCategory();
			List<Product> AllProduct= productRepository.getAllProduct();
			model.addAttribute("pro",productData);
			model.addAttribute("productList",AllProduct);
			model.addAttribute("categoryList",AllCategory);
			
			return "Product";
	}
		
		
		
		
		
		
	}





