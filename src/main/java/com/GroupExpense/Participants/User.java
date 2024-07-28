package com.GroupExpense.Participants;

import java.util.HashMap;

public class User {
	
	private String name;
	private Long moneySpent;
	private Long totalMoneyDue;
	private HashMap< User, Long > balancePerUser;
	private int id;
	
	public User(String name, int id) {
		this.name = name;
		this.moneySpent = 0L;
		totalMoneyDue = 0L ;
		balancePerUser = new HashMap<>();
		this.id = id; 
	}

	public String getName() {
		return name;
	}

	public Long getMoneySpent() {
		return moneySpent;
	}

	public Long getTotalMoneyDue() {
		return totalMoneyDue;
	}

	public HashMap<User, Long> getBalancePerUser() {
		return balancePerUser;
	}

	public int getId() {
		return id;
	}
	
	
	

}
