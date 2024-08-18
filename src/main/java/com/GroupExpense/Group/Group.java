package com.GroupExpense.Group;
import java.util.ArrayList;
import java.util.HashMap;

import com.GroupExpense.Expense.Expense;
import com.GroupExpense.Group.API.GroupMemberAPI;
import com.GroupExpense.User.GroupUser;
import com.GroupExpense.User.User;
import com.GroupExpense.User.API.UserGroupAPI;

public class Group implements GroupMemberAPI {
	
	private int id;
	private String name;
	private ArrayList<Expense> expenseList ;
	private HashMap<Integer, GroupUser> userIdTOGrpUser;
	public Group(int id, String name, ArrayList<UserGroupAPI> arr) {
		this.id = id;
		this.name = name;
		userIdTOGrpUser = new HashMap<Integer, GroupUser>() ;
		for(UserGroupAPI user : arr) {
			
			userIdTOGrpUser.put(user.getId(), new GroupUser( user)) ;
		}
		expenseList =  new ArrayList<Expense>() ;
	}
	@Override
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void addExpense(Expense expense) {
		// TODO Auto-generated method stub
		expenseList.add(expense) ;
		
		User payer = expense.getPayer(); 
		
		for(UserGroupAPI user: expense.getUsers()) {
			
			GroupUser gUser = userIdTOGrpUser.get(user.getId()) ;
			if(gUser!=null) {
				gUser.addExpense( expense ) ;
			}
			 
		}
		
		GroupUser gPayer = userIdTOGrpUser.get(payer.getId()) ;
		
		gPayer.addExpense(expense);
		
	}
	public GroupUser getgroupUser(int id2) {
		// TODO Auto-generated method stub
		return userIdTOGrpUser.get(id2);
	}
	
	

}











