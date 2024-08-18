package com.GroupExpense.User;

import java.util.HashMap;

public class UserManager {
	
	
	private int userID ;
	private HashMap<Integer, User> userIdtoUser;
	

	public UserManager() {
		userIdtoUser =  new HashMap<Integer, User>() ;
		userID = 0 ;
	}
	
	
	private int getUserId() {
		return ++this.userID  ;
	}


	public User createUser(String name) {
		
		User user = new User(this.getUserId() , name) ;
		userIdtoUser.put(user.getId(), user) ; 
		return user;
		
	}

}




































