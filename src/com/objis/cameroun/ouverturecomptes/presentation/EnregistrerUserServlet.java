package com.objis.cameroun.ouverturecomptes.presentation;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.objis.cameroun.ouverturecomptes.domaine.User;
import com.objis.cameroun.ouverturecomptes.service.IService;
import com.objis.cameroun.ouverturecomptes.service.Service;

/**
 * Servlet implementation class EnregistrerUserServlet
 */
@WebServlet("/EnregistrerUserServlet")
public class EnregistrerUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnregistrerUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		


		// Déclatation des variables qui vont contenir les valeurs saisies par l'utilisateur
		
		//int identifiant;
		String nom;
	    String prenom;
	    int age;
	    String cin;
	    String profession;
	    int telephone;
	    String email;
	    String adresse;
	    String login;
		String password;
		
		// Récupération des paramètres envoyés dans le formulaire de la page enregistrer
		
		
		
		nom = request.getParameter("nom");			// matricule est le même que celui dans le champ name="matricule" de enregistrEleve.jsp
		prenom = request.getParameter("prenom");		// nom est le même que celui dans le champ name="nom" de enregistrEleve.jsp
		age = Integer.parseInt(request.getParameter("age")) ;
		cin = request.getParameter("cin");
		profession = request.getParameter("profession");
		telephone = Integer.parseInt(request.getParameter("telephone")) ;
		email = request.getParameter("email");
		adresse = request.getParameter("adresse");
		login = request.getParameter("login");
		password = request.getParameter("password");
		
		
		
		User user = new User();
		// Initialisation des attributs de l'objet contact
		
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setAge(age);
		user.setCin(cin);
		user.setProfession(profession);
		user.setTelephone(telephone);
		user.setEmail(email);
		user.setAdresse(adresse);
		user.setLogin(login);
		user.setPassword(password);
		
		// Enregistrement de l'objet eleve dans la BD
		
		// Obtain a database connection:
        EntityManagerFactory emf = (EntityManagerFactory)getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
		
		IService service = new Service(em);
		service.saveUserService(user);
		

		request.getRequestDispatcher("/ListUserServlet").forward(request, response);
			
	
	
		
	}

}
