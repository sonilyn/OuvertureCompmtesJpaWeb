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
 * Servlet implementation class ListUserServlet
 */
@WebServlet("/ListUserServlet")
public class ListUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Recuperation de la liste des utilisateurs enregristes en BD
		
		
				// Obtain a database connection:
		        EntityManagerFactory emf = (EntityManagerFactory)getServletContext().getAttribute("emf");
		        EntityManager em = emf.createEntityManager();
				
				IService service = new Service(em);
				
				List<User> listUser;
				listUser = service.getAllUserService();
				
				System.out.println("taille ********* = "+ listUser.size());
				
				// Enregistrement de la liste dans la session
				HttpSession session = request.getSession();
				session.setAttribute("listUser", listUser);
				request.getRequestDispatcher("listUsers.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
