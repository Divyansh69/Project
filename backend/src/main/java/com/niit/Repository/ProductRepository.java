package com.niit.Repository;

import java.util.List;

import com.niit.Model.Product;
public interface ProductRepository {
	

	



			public boolean addProduct(Product Product);
			public boolean updateProduct(Product Product);
			public boolean deleteProduct(int ProductId);
			public List<Product> getAllProduct();
			public Product getProductId(int ProductId);
			
			}

