package com.GroupExpense.Group;

import java.util.ArrayList;
import java.util.HashMap;

import com.GroupExpense.User.User;
import com.GroupExpense.User.API.UserGroupAPI;

public class GroupManager {
	
	private int grpId ;
	private HashMap<Integer, Group> grpIdTOGrp ;
	
	public GroupManager() {
		
		this.grpId = 0 ;
		grpIdTOGrp = new HashMap<Integer, Group>() ;
	}
	
	private int getGrpId() {
		
		return ++this.grpId ;
	}

	public Group createGroup(String name, ArrayList<UserGroupAPI> arr) {

		Group grp = new Group(getGrpId(), name, arr);

		grpIdTOGrp.put(grp.getId(), grp);

		for (UserGroupAPI user : arr) {
			user.addGroup(grp);
		}

		return grp;
	}

}
