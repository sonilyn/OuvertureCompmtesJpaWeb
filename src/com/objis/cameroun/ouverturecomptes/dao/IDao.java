package com.objis.cameroun.ouverturecomptes.dao;

import java.util.List;

import com.objis.cameroun.ouverturecomptes.domaine.Banque;
import com.objis.cameroun.ouverturecomptes.domaine.User;

public interface IDao {
	
	
	public int saveUserDao(User user);
	public List<User> getAllUserDao();
	int connecterUserDao(String login, String password);
	User getUserDao();
	
	
	
	

}
