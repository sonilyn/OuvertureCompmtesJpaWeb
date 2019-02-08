package com.objis.cameroun.ouverturecomptes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.objis.cameroun.ouverturecomptes.domaine.User;




public class Dao implements IDao {
	
	private EntityManager em;
	
	// Instanciation de l'objet sc de type Scanner
	Scanner sc = new Scanner(System.in);
	
	// Instanciation de l'objet user de type User
	User user = new User();

	// Constructeur par defaut
	public Dao() {
		
	}
	
	public Dao(EntityManager em) {
		super();
		this.em = em;
	}
	
	
	@Override
	public int saveUserDao(User user) {
		
				
		try {

						// 1: Obtention d'un EntityManager
						EntityManager em = GenerateManagerEntity.getEntityManagerInstance();

						// 2 : Ouverture transaction 
						EntityTransaction tx =  em.getTransaction();
						tx.begin();
						
						
						// 3 : Persistance Objet/Relationnel : création d'un enregistrement en base
						 em.persist(user);
						
						// 4 : Fermeture transaction 
						 tx.commit();
						
			
			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (Exception e) {
			e.printStackTrace();
			
			return 0;
		} 
		
		return 1;
		
	}
	
	
	
	 @Override
	public List<User> getAllUserDao() {
		

       //création d'une collection des utilisateurs
		List<User> maListUser= new ArrayList<User>();
	
		
		try {

			/// 1: Obtention d'un EntityManager
			EntityManager em = GenerateManagerEntity.getEntityManagerInstance();

			// 2 : Ouverture transaction 
			EntityTransaction tx =  em.getTransaction();
			tx.begin();
						
						
			// 3 : Obtention de la liste des utilisateurs via EntityManger
			 maListUser = em.createQuery("from User", User.class).getResultList();	// ici utilisation du pattern singleton
			
			//Affiche la liste des utilisateurs 
			//maListUser = em.createQuery("from User u where u.prenom = :pn", User.class).setParameter("pn", "LI").getResultList();
						
			// 4 : Fermeture transaction 
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} 
			
		return maListUser;
		
	}	 
	 
	 

	 @Override
	 public int connecterUserDao(String login, String password) {
			
					
			try {

							// 1: Obtention d'un EntityManager
							EntityManager em = GenerateManagerEntity.getEntityManagerInstance();

							// 2 : Ouverture transaction 
							EntityTransaction tx =  em.getTransaction();
							tx.begin();
							
							
							// 3 : Persistance Objet/Relationnel : création d'un enregistrement en base
							List<User> users = em.createQuery("from User u where u.login = :l and u.password = :p", User.class).setParameter("l", login)
																															   .setParameter("p", password)
									                                                                                           .getResultList();


							// 4 : Fermeture transaction 
							 tx.commit();
							 
							 
							 if(users.size()>=1) {
								 return 1;
							 } else {
								 return 0;
							 }
							
				
				// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
			} catch (Exception e) {
				e.printStackTrace();
				
				return 0;
			} 
				
			
		}
		
	  
	 
	 
	 @Override
		public User getUserDao() {
			   
			
			try {

				// Etape 1 : récupération de la connexion
				Connection cn = ConnectionMYSQL.getInstance();

				// Etape 2 : préparation requête
				String sql = "SELECT id, nom, prenom, age, cin, profession, telephone, email, adresse  FROM user where name=? ";
				
				Statement st = cn.createStatement();
				
				
				((PreparedStatement) st).setString(1, user.getLogin());
				

				// Etape 3 : exécution requête
				ResultSet rs = st.executeQuery(sql);

				// Etape 4 :parcours Resultset (optionnel)
				while (rs.next()) {
					// Recuperation des valeurs d'une ligne de la table user, pour initialiser dans un objet user
					User user =  new User();
					user.setIdentifiant(rs.getInt("id"));					
					user.setNom(rs.getString("nom"));
					user.setPrenom(rs.getString("prenom"));
					user.setAge(rs.getInt("age"));
					user.setCin(rs.getString("cin"));
					user.setProfession(rs.getString("profession"));	
					user.setTelephone(rs.getInt("telephone"));
					user.setEmail(rs.getString("email"));
					user.setAdresse(rs.getString("adresse"));
					 
					st.close();			
					
				}
				
				// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			return user; 
		
	 }
	 
	 
}
