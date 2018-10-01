package com.niit.Backend.RepositoryImpl;



	import java.util.List;

	import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.Product;
import com.niit.Repository.ProductRepository;
@Transactional	
@Repository
	public class ProductRepositoryImpl implements ProductRepository {

		@Autowired
		private SessionFactory sessionFactory;


		public List<Product> getAllProduct() {
		Session session=sessionFactory.getCurrentSession();
	    try { 
		Query query =session.createQuery("from Product");
		List<Product> ProductList=(List<Product>)query.getResultList();
		return ProductList;
	    }
		catch(HibernateException e){
			e.printStackTrace();
			return null;	
		}
		
		}

		public Product getProductById(int ProductId) {
			Session session=sessionFactory.getCurrentSession();
		    try {
		    	Product Product=(Product)session.get(Product.class,ProductId);
			  return Product;
		    }	
		 catch(HibernateException e) {
			 e.printStackTrace();
			 return null; 
		 }
		  
		}


		public boolean updateProduct(Product Product) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			try {
				session.update(Product);
		         return true;	
			}
			catch(HibernateException e) {
				e.printStackTrace();}
			return false;
		}

		public boolean deleteProduct(int ProductId) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			try {
				session.delete(getProductById(ProductId));
		         return true;	
			}
			catch(HibernateException e) {
				e.printStackTrace();	
			return false;
		}
		}

		public boolean addProduct(Product Product) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			try {
				session.save(Product);
				return true;
			}
			catch (HibernateException e) {
				e.printStackTrace();
			return false;
		}
		}

		public Product getProductId(int ProductId) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
		    try {
		    	Product Product=(Product)session.get(Product.class,ProductId);
			  return Product;
		    }	
		 catch(HibernateException e) {
			 e.printStackTrace();
			 return null; 
		 }
		}
		}
		


