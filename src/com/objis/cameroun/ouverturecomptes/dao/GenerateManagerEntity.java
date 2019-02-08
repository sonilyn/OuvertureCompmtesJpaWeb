package com.objis.cameroun.ouverturecomptes.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenerateManagerEntity {
	
	public static EntityManager em;
	
	
	/**
	 * Methode EntityManager
	 * Elle ne prend rien en parametre
	 * @return EntityManager
	 */
	public static EntityManager getEntityManagerInstance() {
		
		if (em==null) {
			
			try {
				
				// 1 : Ouverture unité de travail JPA
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("ouverturecomptes-pu");
				em = emf.createEntityManager();
				
				
			}catch (Exception e) {
				
				System.out.println("Probleme de creation de l'objet EntityManager");
				
			}
			
		}
		
		return em;
		
	}

}
