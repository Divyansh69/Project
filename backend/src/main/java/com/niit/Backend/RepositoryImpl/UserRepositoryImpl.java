package com.niit.Backend.RepositoryImpl;


	import java.util.List;

	import javax.persistence.Query;
	import javax.transaction.Transactional;
	import org.hibernate.HibernateException;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.User;
import com.niit.Repository.UserRepository;
	@Repository
	@Transactional
	public class UserRepositoryImpl implements UserRepository {

		@Autowired
		
		private SessionFactory sessionFactory;
		

	     

		public boolean updateUser(User User) {
			Session session=sessionFactory.getCurrentSession();
			try {
				session.update(User);
		         return true;	
			}
			catch(HibernateException e) {
				e.printStackTrace();
			return false;
			}
		}

		public boolean deleteUser(int UserId) {
		
			Session session=sessionFactory.getCurrentSession();
		try {
			session.delete(getUserById(UserId));
	         return true;	
		}
		catch(HibernateException e) {
			e.printStackTrace();
			return false;
		}
	    }


		
		
		 
		

		public boolean addUser(org.h2.engine.User User) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			try {
				session.save(User);
				return true;
			}
			catch (HibernateException e) {
				e.printStackTrace();}
			return false;
		}

		public boolean updateUser(org.h2.engine.User User) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			try {
				session.update(User);
		         return true;	
			}
			catch(HibernateException e) {
				e.printStackTrace();
			}
			return false;
		}

		public User getUserById1(int UserId) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
		    try {
		    	User User=(User)session.get(User.class,UserId);
			  return User;
		    }	
		 catch(HibernateException e) {
			 e.printStackTrace();
		 }
			return null;
		}

		



		public List<User> getAllUser() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean addUser(User User) {
			// TODO Auto-generated method stub
			return false;
		}

		public User getUserById(int UserId) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
		    try {
		    	User User=(User)session.get(User.class,UserId);
			  return User;
		    }	
		 catch(HibernateException e) {
			 e.printStackTrace();
		 }
		
			
			return null;
		}

		

		}



		
		
	



		