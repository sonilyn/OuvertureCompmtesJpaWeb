package com.objis.cameroun.ouverturecomptes.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe Banque
 * @author Sonia Tonye
 *
 */


@Entity
public class Banque {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBank;
	private String name;
	private String typeService;
	
	
	
	// Getters & Setters
	
	
	public int getIdBank() {
		return idBank;
	}

	public void setIdBank(int idBank) {
		this.idBank = idBank;
	}
	
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name le nom de la banque
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return typeService
	 */
	public String getTypeCount() {
		return typeService;
	}
	
	/**
	 * @param typeCount le type de compte ou service que propose une banque
	 */
	public void setTypeCount(String typeCount) {
		this.typeService = typeCount;
	}
	
	
	// Constructeurs

	
	/**
	 * Constructeur par defaut 
	 */
	public Banque() {
		super();
	}
	
	
	/**
	 * @param name le nom de la banque
	 */
	public Banque(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param name
	 * @param typeService
	 */
	public Banque(String name, String typeService) {
		super();
		this.name = name;
		this.typeService = typeService;
	}
	
	
	public Banque(int idBank, String name, String typeService) {
		super();
		this.idBank = idBank;
		this.name = name;
		this.typeService = typeService;
	}

	/* Methode toString 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Banque [idBank=" + idBank + ", name=" + name + ", typeService=" + typeService + "]";
	}


	
	

}
