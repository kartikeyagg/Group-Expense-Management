package com.GroupExpense.User;

import java.util.HashMap;

import com.GroupExpense.Group.API.GroupMemberAPI;
import com.GroupExpense.User.API.UserGroupAPI;

public class User implements UserGroupAPI {
	
	private String name;
	private int id;
	
	private HashMap<Integer, GroupMemberAPI> grpIdToGrp ; 

	public User(int userId, String name) {
		// TODO Auto-generated constructor stub
		this.name = name; 
		this.id = userId ;
		this.grpIdToGrp = new HashMap<Integer, GroupMemberAPI>() ;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}


	public GroupMemberAPI getGroupInfo(int grpID) {

		return grpIdToGrp.get(grpID);

	}
	
	
	public GroupUser getGroupUser( int grpID ) {
		
		GroupMemberAPI grp = this.getGroupInfo( grpID) ;
		
		return grp.getgroupUser(this.id) ;
		
		
	}

	@Override
	public void addGroup(GroupMemberAPI grp) {
		// TODO Auto-generated method stub
		
		this.grpIdToGrp.put(grp.getId(), grp);
		
	}



}


























