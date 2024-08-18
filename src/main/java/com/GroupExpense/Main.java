package com.GroupExpense;

import java.util.ArrayList;
import java.util.Arrays;

import com.GroupExpense.Expense.Expense;
import com.GroupExpense.Group.Group;
import com.GroupExpense.Group.GroupManager;
import com.GroupExpense.User.GroupUser;
import com.GroupExpense.User.User;
import com.GroupExpense.User.UserManager;
import com.GroupExpense.User.API.UserGroupAPI;

public class Main {
	
	public static void main(String[] args) {
		
		UserManager userManager = new UserManager() ;
		
		User jai = userManager.createUser("Jai") ;
		User john = userManager.createUser("John") ;
		
		GroupManager grpManager = new GroupManager() ;
		
		ArrayList<UserGroupAPI> arr =  new ArrayList<UserGroupAPI>(Arrays.asList( john) );
		
		Group gp = grpManager.createGroup(  "Tripgroup" ,  arr ) ; 
		
		Expense expense = new Expense(jai, 1000, arr, "Tent", gp.getId() ) ; 
		
		gp.addExpense(expense) ;
		
		// get balance of each member in group here  here 
		
		GroupUser gprUser = jai.getGroupUser(gp.getId()) ;
		
		
	}

}
