package com.GroupExpense.User;

import java.util.HashMap;

import com.GroupExpense.Expense.Expense;
import com.GroupExpense.User.API.UserGroupAPI;

public class GroupUser {
	
	private UserGroupAPI user;
	private HashMap<Integer, Long> userIdToBalance;
	
	public GroupUser(UserGroupAPI user) {
		userIdToBalance = new HashMap<Integer, Long>() ;
		this.user = user;
	}

	public UserGroupAPI getUser() {
		return user;
	}

	public long  getBalance( int userId ) {
		return userIdToBalance.get(userId);
	}

	public void addExpense(Expense expense) {
		// TODO Auto-generated method stub
		
		if(this.user == expense.getPayer()) {
			
			for (UserGroupAPI user : expense.getUsers()) {

				if (userIdToBalance.get(user.getId()) == null) {

				}

				long bal = userIdToBalance.get(user.getId());

				bal -= expense.getTotalExpense() / (expense.getUsers().size() + 1);

				userIdToBalance.put(user.getId(), bal);

			}

		}

		else {
			int payerId = expense.getPayer().getId();
			if (userIdToBalance.get(payerId) == null) {

				userIdToBalance.put(payerId, 0l);

			}

			long bal = userIdToBalance.get(payerId);

			bal += expense.getTotalExpense() / (expense.getUsers().size() + 1);

			userIdToBalance.put(payerId, bal);

		}
		
	}

	@Override
	public String toString() {
		return "GroupUser [user=" + user + ", userIdToBalance=" + userIdToBalance + "]";
	}
	

}










































