package com.objis.cameroun.ouverturecomptes.service;

import java.util.Collection;
import java.util.List;

import com.objis.cameroun.ouverturecomptes.domaine.Banque;
import com.objis.cameroun.ouverturecomptes.domaine.User;



public interface IService {
	
	public int saveUserService(User user);
	public List<User> getAllUserService();
	int connecterUserService(String login, String password);
	public User getUserService();
	
	
	



}
