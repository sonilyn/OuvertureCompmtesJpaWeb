package com.objis.cameroun.ouverturecomptes.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import com.objis.cameroun.ouverturecomptes.domaine.UserModel;
import com.objis.cameroun.ouverturecomptes.service.IService;
import com.objis.cameroun.ouverturecomptes.service.Service;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Affichage extends JFrame {

	private UserModel UserModel;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;



	/**
	 * Create the frame.
	 */
	public Affichage() {
		setTitle("Affichage des informations saisies \u00E0 l'inscription");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 645, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				IService service = new Service();
				
				UserModel =new UserModel(service.getAllUserService());
				 	
				table = new JTable(UserModel);
					
				contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
			}
		});
		
		
		
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 53, 317, 119);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
