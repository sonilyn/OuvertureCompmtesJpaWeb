package com.objis.cameroun.ouverturecomptes.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class Accueil {

	private JFrame frmBienvenueDansEbank;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil window = new Accueil();
					window.frmBienvenueDansEbank.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBienvenueDansEbank = new JFrame();
		frmBienvenueDansEbank.getContentPane().setForeground(Color.BLACK);
		frmBienvenueDansEbank.setTitle("Bienvenue dans e-bank");
		frmBienvenueDansEbank.setBounds(100, 100, 724, 497);
		frmBienvenueDansEbank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBienvenueDansEbank.getContentPane().setLayout(null);
		
		JButton btnOuvrirCompte = new JButton("Ouvrir un compte bancaire");
		btnOuvrirCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Cacher la premiere fenetre et faire apparaitre la deuxieme
				frmBienvenueDansEbank.dispose();	
				OuvertureCompte frame = new OuvertureCompte();
				frame.setVisible(true);
				
			}
		});
		btnOuvrirCompte.setBounds(186, 297, 215, 39);
		frmBienvenueDansEbank.getContentPane().add(btnOuvrirCompte);
		
		JTextArea txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh = new JTextArea();
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.setEditable(false);
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.setText("Ouvrir un compte bancaire en ligne en 4 etapes:\r\n\r\n\r\n1- \tVerifier les conditions d'eligibilite\r\n\r\n2- \tRemplir le formulaire en ligne\r\n\r\n3- \tEnvoi des pieces justificatives\r\n\r\n4- \tActivation du compte et de la carte bancaire\r\n");
		txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.setBounds(20, 23, 484, 244);
		frmBienvenueDansEbank.getContentPane().add(txtrHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh);
	}
}
