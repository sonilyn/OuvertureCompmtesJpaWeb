package com.objis.cameroun.ouverturecomptes.domaine;

import javax.persistence.Entity;

/**
 * Class Admin herite de la classe User
 * 
 * @author Ngo Tonye Sonia
 *
 */

@Entity
public class Admin extends User {
	
	
	 // Constructeurs
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param login
	 * @param password
	 */
	public Admin (String login, String password) {
		super(login, password);
	
		
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param profession
	 */
	public Admin (String nom, String prenom, String profession) {
		super(nom, prenom, profession);
		System.out.println(super.nom);
	}


	public Admin(int identifiant, String nom, String prenom, int age, String cin, String profession, int telephone,
			String email, String adresse, String login, String password) {
		super(identifiant, nom, prenom, age, cin, profession, telephone, email, adresse, login, password);
		// TODO Auto-generated constructor stub
	}

	public Admin(String nom, String prenom, int age, String cin, String profession, int telephone, String email,
			String adresse, String login, String password) {
		super(nom, prenom, age, cin, profession, telephone, email, adresse, login, password);
		// TODO Auto-generated constructor stub
	}

	public Admin(String nom, String prenom, int age, String cin, String profession, int telephone, String email,
			String adresse) {
		super(nom, prenom, age, cin, profession, telephone, email, adresse);
		// TODO Auto-generated constructor stub
	}

	public Admin(String nom, String prenom, int age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}

	public Admin(String nom, String prenom, String profession, String email, String adresse) {
		super(nom, prenom, profession, email, adresse);
		// TODO Auto-generated constructor stub
	}

	public Admin(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	//  Redefinition de la methode Connecter
	
	/*
	 * (non-Javadoc)
	 * @see User#Connecter()
	 */
/*	public void Connecter(){
		System.out.println(" Connexion de l'administrateur " );	

	}

	
	// Methode consulterPlateforme();
	
	public void consulterPlateforme(){
		System.out.println("L'abonné " + this.nom +"" +this.prenom + "consulte la plateforme");	
	}

	*/
}
