package com.objis.cameroun.ouverturecomptes.presentation;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class EspaceAdmin extends JFrame {

	private JPanel contentPane;
	

	
	/**
	 * Create the frame.
	 */
	public EspaceAdmin() {
		setTitle("Espace Administrateur");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 724, 497);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnListeDesUtilisateurs = new JMenu("G\u00E9rer Utilisateurs");
		menuBar.add(mnListeDesUtilisateurs);
		
		JMenuItem mntmListeDesUtilisateurs = new JMenuItem("Afficher la liste des utilisateurs");
		mntmListeDesUtilisateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ListUser frame = new ListUser();
				frame.setVisible(true);
			}
		});
		mnListeDesUtilisateurs.add(mntmListeDesUtilisateurs);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMessage = new JLabel("Bienvenue!!! Pour consulter la liste des utilisateurs, \r\nveuillez cliquer sur \"G\u00E9rer Utilisateurs\"");
		lblMessage.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 18));
		lblMessage.setForeground(new Color(204, 0, 204));
		lblMessage.setBounds(46, 80, 485, 124);
		contentPane.add(lblMessage);
		
				
	}
}
