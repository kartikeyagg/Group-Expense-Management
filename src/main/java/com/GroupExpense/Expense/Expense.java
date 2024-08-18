package com.GroupExpense.Expense;

import java.util.ArrayList;

import com.GroupExpense.User.User;
import com.GroupExpense.User.API.UserGroupAPI;

public class Expense {
	
	private long totalExpense ;
	
	private ArrayList<UserGroupAPI> users;
	
	private String comment;
	
	private int grpId;
	
	private User payer;

	public Expense( User payer ,  long totalExpense, ArrayList<UserGroupAPI> users, String comment, int grpId) {
		this.totalExpense = totalExpense;
		this.users = users;
		this.comment = comment;
		this.grpId = grpId;
		this.payer = payer; 
	}

	public long getTotalExpense() {
		return totalExpense;	
	}

	public ArrayList<UserGroupAPI> getUsers() {
		return users;
	}

	public String getComment() {
		return comment;
	}

	public int getGrpId() {
		return grpId;
	}

	public User getPayer() {
		return payer;
	}
	
	

}






























