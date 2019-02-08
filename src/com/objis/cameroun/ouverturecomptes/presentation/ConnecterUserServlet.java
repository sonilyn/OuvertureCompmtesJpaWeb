package com.objis.cameroun.ouverturecomptes.presentation;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.objis.cameroun.ouverturecomptes.domaine.User;
import com.objis.cameroun.ouverturecomptes.service.IService;
import com.objis.cameroun.ouverturecomptes.service.Service;

/**
 * Servlet implementation class connecterUserServlet
 */
@WebServlet("/ConnecterUserServlet")
public class ConnecterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnecterUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recuperation des val envoyees via le formulaire
		
		String login="";
		String password="";
		
		login = request.getParameter("login");
		password = request.getParameter("password");
		
		// Obtain a database connection:
        EntityManagerFactory emf = (EntityManagerFactory)getServletContext().getAttribute("emf");
        EntityManager em = emf.createEntityManager();
		
		IService service = new Service(em);
		
		//List<User> listUser;
		int connecterUser;

		connecterUser = service.connecterUserService(login, password);
		
		//System.out.println("taille ********* = "+ listUser.size());
		
		
		if(connecterUser==1) {
			
			HttpSession session = request.getSession();
			session.setAttribute("login", login);
			request.getRequestDispatcher("enregistrerUsers.jsp").forward(request, response);
			
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("message", "login ou mot de passe incorrect");
			request.getRequestDispatcher("connecterUser.jsp").forward(request, response);
			
		}
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
