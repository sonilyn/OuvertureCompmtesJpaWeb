package com.objis.cameroun.ouverturecomptes.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.objis.cameroun.ouverturecomptes.dao.Dao;
import com.objis.cameroun.ouverturecomptes.dao.IDao;
import com.objis.cameroun.ouverturecomptes.domaine.Banque;
import com.objis.cameroun.ouverturecomptes.domaine.User;

public class Service implements IService {
	
	User u = new User();
	Banque b = new Banque();
	
	
	private IDao dao;

	public Service() {
		this.dao = new Dao();
		
	}
	
			
	
	@Override
	public int saveUserService(User user) {
		
		return dao.saveUserDao(user);
	}
	
	
	@Override
	public List<User> getAllUserService() {
	
		return dao.getAllUserDao();
	}

	@Override
	public int connecterUserService( String login, String password) {
	
		return dao.connecterUserDao(login,password);
	}


	@Override
	public User getUserService() {
		
		return dao.getUserDao();
	}
	
	
	public Service(EntityManager em) {

		this.dao = new Dao(em);
	}
	
	
	/*@Override
	public List<Banque> getAllBanqueService() {
		
		return dao.getAllBanqueDao();
	}
	
	@Override
	public int saveBanqueService(Banque banque) {
		
		return dao.saveBanqueDao(banque);
	}*/
	


	/* Methode getListBanques affiche la liste des banques que propose le service
	 * (non-Javadoc)
	 * @see com.objis.cameroun.service.IService#getListBanques()
	 */ /*
	@Override
	public Collection<Banque> getListBanques() {
				// 1. Déclaration d'une collection d'employés Le type de la liste est ArrayList 
				//    (à préférer pour opérations de recherche)
				
				Collection<Banque> maListeBanques = new ArrayList<Banque>();		//Le type de retour est une Collection

				// 2. Déclaration des employés
				Banque banque1 = new Banque("ECOBANK","Compte courant");
				Banque banque2 = new Banque("SGBC","Compte epargne");
				Banque banque3 = new Banque("AFRILAND FIRST BANK","Compte courant");
				
				// 3. Ajout des employés dans la liste
				maListeBanques.add(banque1);
				maListeBanques.add(banque2);
				maListeBanques.add(banque3);
				
				return maListeBanques ;
	}

*/

}
