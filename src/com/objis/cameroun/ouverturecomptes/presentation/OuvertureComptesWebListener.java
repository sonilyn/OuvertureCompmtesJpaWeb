package com.objis.cameroun.ouverturecomptes.presentation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class OuvertureComptesWebListener
 *
 */
@WebListener
public class OuvertureComptesWebListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public OuvertureComptesWebListener() {
        // TODO Auto-generated constructor stub
    }

    /**
    * @see ServletContextListener#contextInitialized(ServletContextEvent)
    *  Prepare the EntityManagerFactory & Enhance:
    **/
   public void contextInitialized(ServletContextEvent e) {
       //com.objectdb.Enhancer.enhance("guest.*");
       
       //Class.forName("com.mysql.jdbc.Driver");
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("ouverturecomptes-pu");
       e.getServletContext().setAttribute("emf", emf);
   }

	/**
    * @see ServletContextListener#contextDestroyed(ServletContextEvent)
    *  Release the EntityManagerFactory:
    */
   public void contextDestroyed(ServletContextEvent e) {
       EntityManagerFactory emf =
           (EntityManagerFactory)e.getServletContext().getAttribute("emf");
       emf.close();
   }
	
	
}
