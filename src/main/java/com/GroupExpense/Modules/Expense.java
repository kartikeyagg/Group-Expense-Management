package com.GroupExpense.Modules;

import java.util.ArrayList;
import java.util.Arrays;

public class Expense {
	
	private Long totalExpenseValue;
	private String note;
	private ArrayList<Integer> users ;
	
	public Expense(Long totalExpenseValue, String note, Integer ...users) {
		
		this.totalExpenseValue = totalExpenseValue;
		this.note = note;
		this.users = (ArrayList<Integer>) Arrays.asList(users) ;
	}
	
	
	public Expense(Long totalExpenseValue, Integer ...users) {
		
		this.totalExpenseValue = totalExpenseValue;
		this.users = (ArrayList<Integer>) Arrays.asList(users) ;
	}


	public Long getTotalExpenseValue() {
		return totalExpenseValue;
	}


	public String getNote() {
		return note;
	}


	public ArrayList<Integer> getUsers() {
		return users;
	}
	
	
	

}
