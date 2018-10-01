package com.niit.Repository;

import java.util.List;

import com.niit.Model.User;
public interface UserRepository {

	



			public boolean addUser(User User);
			public boolean updateUser(User User);
			public boolean deleteUser(int UserId);
			public List<User> getAllUser();
			public User getUserById(int UserId);
			
			}
