package com.objis.cameroun.ouverturecomptes.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe User
 * @author Ngo Tonye Sonia
 *
 */

@Entity
public class User {
	
	// Attributs
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	protected int identifiant;
	protected String nom;
    protected String prenom;
    protected int age;
    protected String cin;
    protected String profession;
    protected int telephone;
    protected String email;
    protected String adresse;
    protected String login;
	protected String password;
	
	
	
	
	// Getters & Setters
	
	/**
	 * @return l'identifiant de l'utilisateur
	 */
	public int getIdentifiant() {
		return identifiant;
	}
	
	/**
	 * @param identifiant le nom de l'utilisateur
	 */
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	
	/**
	 * @return le nom de l'utilisateur
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param nom le nom de l'utilisateur
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * @param prenom le prenom de l'utilisateur
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age de l'utilisateur
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return cin
	 */
	public String getCin() {
		return cin;
	}
	
	/**
	 * @param cin le numero de carte d'identite de l'utilisateur
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}
	
	/**
	 * @return profession
	 */
	public String getProfession() {
		return profession;
	}
	
	/**
	 * @param profession de l'utilisateur
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	/**
	 * @return telephone
	 */
	public int getTelephone() {
		return telephone;
	}
	
	/**
	 * @param telephone de l'utilisateur
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email de l'utilisateur
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	
	/**
	 * @param adresse de l'utilisateur
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	/**
	 * @return login
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * @param login de l'utilisateur
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password de l'utilisateur
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	/**
	 * Constructeurs
	 */
	public User() {
		super();
	}
	
	/**
	 * @param nom
	 * @param prenom
	 */
	public User(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	

	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	public User(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param profession
	 */
	public User(String nom, String prenom, String profession) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.profession = profession;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 */
	public User(String nom, String prenom, String login, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param profession
	 * @param email
	 * @param adresse
	 */
	public User(String nom, String prenom, String profession, String email, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.profession = profession;
		this.email = email;
		this.adresse = adresse;
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param cin
	 * @param profession
	 * @param telephone
	 * @param email
	 * @param adresse
	 */
	public User(String nom, String prenom, int age, String cin, String profession, int telephone,
			String email, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.cin = cin;
		this.profession = profession;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
	}
		
	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param cin
	 * @param profession
	 * @param telephone
	 * @param email
	 * @param adresse
	 * @param login
	 * @param password
	 */
	public User(String nom, String prenom, int age, String cin, String profession, int telephone, String email,
			String adresse, String login, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.cin = cin;
		this.profession = profession;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.login = login;
		this.password = password;
	}
	
	
	/**
	 * @param identifiant
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param cin
	 * @param profession
	 * @param telephone
	 * @param email
	 * @param adresse
	 * @param login
	 * @param password
	 */
	public User(int identifiant, String nom, String prenom, int age, String cin, String profession, int telephone,
			String email, String adresse, String login, String password) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.cin = cin;
		this.profession = profession;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.login = login;
		this.password = password;
	}
	
	
	
	/* Methode toString
	 * 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * 
	 */
	public String toString() {
		return " User [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", cin=" + cin + ", profession=" + profession + ", telephone=" + telephone + ", email=" + email + ", adresse=" + adresse + ", login=" + login + ", password=" + password + "]";
	
	}

	

	
}
