package com.objis.cameroun.ouverturecomptes.presentation;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.ouverturecomptes.domaine.UserModel;
import com.objis.cameroun.ouverturecomptes.service.IService;
import com.objis.cameroun.ouverturecomptes.service.Service;

public class ListUser extends JFrame {

	private JPanel contentPane;
	private JTable tableUser;
	private UserModel userModel;
	

	/**
	 * Create the frame.
	 */
	public ListUser() {
		setTitle("Liste des utilisateurs");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setLayout(null);
		
		
		// Partie modifiee
		
		IService service = new Service();
		
	    userModel = new UserModel(service.getAllUserService());
		
		tableUser = new JTable(userModel);
		
		contentPane.add(new JScrollPane(tableUser), BorderLayout.CENTER);
		
	}

}
