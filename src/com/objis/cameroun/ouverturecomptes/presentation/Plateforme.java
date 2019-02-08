package com.objis.cameroun.ouverturecomptes.presentation;

import java.util.List;
import java.util.Scanner;

import com.objis.cameroun.ouverturecomptes.domaine.Banque;
import com.objis.cameroun.ouverturecomptes.domaine.User;
import com.objis.cameroun.ouverturecomptes.service.Service;
import com.objis.cameroun.ouverturecomptes.service.IService;




/**
 * Plateforme est la classe principale du projet
 * 
 * @author Ngo Tonye Sonia
 *
 */
public class Plateforme {

	private static Scanner sc;


	/**
	 * @param args 
	 */
	public static void main(String[] args) {

		User user = new User();
		

		// Appel de la couche Service			
		IService s = new Service();


		// Creation d'un objet sc pour lire les chaines de caractères
		Scanner sc = new Scanner(System.in); 
		sc = new Scanner(System.in); 




		// Affichage du menu principal

		System.out.println (" * !!!! 	Bienvenue dans le système de gestion de banque en ligne		!!!! " + '\n'
				+ " *																			 " + '\n'
				+ " * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! " + '\n'
				+ " *																	  " + '\n'
				+ " *			Tapez le code approprié pour accéder à un service 		  " + '\n'
				+ " *																	  " + '\n'
				+ " *			A. Enregistrement										  " + '\n'
				+ " *			B. Connexion											  " + '\n'
				+ " *			C. Affichage de la liste des utilisateurs								  " + '\n'
				+ " *			D. Ouverture de Compte								  	  " + '\n'
				+ " *			E. Consultation de la fiche client						  " + '\n'
				+ " *																	  " + '\n'
				+ " * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");	



		//declaration et affectation de la reponse de l'utilisateur dans une variable de type caractere
		char choix= sc.nextLine().charAt(0);


		//Tant que la réponse donnée est égale à oui…
		while (choix == 'A' || choix ==  'B' || choix ==  'C' || choix ==  'D' || choix == 'E'){



			switch (choix){

			case 'A':

				//Appel de la methode qui permettra d'enregistrer un utilisateur dans la base de donnee
				s.saveUserService(user);


				break;
			case 'B':

				//Appel de la methode qui permettra à un utilisateur de se connecter 	 
				//s.connecterUserService(login, password);
				
				break;
			case 'C':
				
				// Recuperation de la liste des utilisateurs
				
				List<User> listeUsers = s.getAllUserService();
				
				// Affichage de la liste des utilisateurs enregistrés en BD
						
				for(User u : listeUsers) {
							
					System.out.println(u);
				}
				
				break;
			case 'D':

				//Remplir le formulaire d'ouverture de compte

				System.out.println("Ouverture de Compte");
				break;
			case 'E':

				//Afficher la fiche client 
				System.out.println("Consulter votre fiche client");
				break;
			default:
				//Message par defaut

				System.out.println("Merci");
			}

			//Refaire un essai
			System.out.println(" Faites votre choix comme l'indique le menu en entrant A, B, C, D ou E. Sinon taper N pour quitter!"); 

			//Recuperation dans la variable choix de la réponse saisie par l'utilisateur	 
			choix = sc.nextLine().charAt(0);
		} 	  

		//Quitter la plateforme
		System.out.println("Aurevoir");		
	}

}
