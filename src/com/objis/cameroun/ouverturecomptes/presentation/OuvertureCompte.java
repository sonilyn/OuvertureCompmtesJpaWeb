package com.objis.cameroun.ouverturecomptes.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.ouverturecomptes.domaine.User;
import com.objis.cameroun.ouverturecomptes.service.Service;

import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;

public class OuvertureCompte extends JFrame {

	private JPanel contentPane;
	private JTextField LoginTextField;
	private JPasswordField passwordField;
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField emailTextField;
	private JTextField telTextField;
	private JTextField ageTextField;
	private JTextField adresseTextField;
	private JTextField cinTextField;
	private JTextField revenusTextField;
	private JTextField fileTextField;
	private JTextField pseudoTextField;
	private JTextField mpTextField;

	

	/**
	 * Create the frame.
	 */
	public OuvertureCompte() {
		setTitle("Ouverture de Compte en ligne");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 688, 436);
		contentPane.add(tabbedPane_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.LIGHT_GRAY);
		tabbedPane_1.addTab("Ouverture de mon compte en ligne", null, tabbedPane, null);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Formulaire", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblCivil = new JLabel("Civilit\u00E9 ");
		lblCivil.setBounds(10, 11, 71, 14);
		panel.add(lblCivil);
		
		JRadioButton rdbtnMadame = new JRadioButton("Madame");
		rdbtnMadame.setBounds(87, 7, 86, 23);
		panel.add(rdbtnMadame);
		
		JRadioButton rdbtnMonsieur = new JRadioButton("Monsieur");
		rdbtnMonsieur.setBounds(175, 7, 86, 23);
		panel.add(rdbtnMonsieur);
		
		JLabel lblNom = new JLabel("Nom * :");
		lblNom.setBounds(10, 52, 80, 14);
		panel.add(lblNom);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(100, 49, 161, 20);
		panel.add(nomTextField);
		nomTextField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom * :");
		lblPrenom.setBounds(10, 88, 80, 14);
		panel.add(lblPrenom);
		
		prenomTextField = new JTextField();
		prenomTextField.setBounds(100, 85, 161, 20);
		panel.add(prenomTextField);
		prenomTextField.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail * :");
		lblEmail.setBounds(10, 127, 80, 14);
		panel.add(lblEmail);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(100, 124, 161, 20);
		panel.add(emailTextField);
		emailTextField.setColumns(10);
		
		JLabel lblTephone = new JLabel("Telephone * :");
		lblTephone.setBounds(10, 164, 80, 14);
		panel.add(lblTephone);
		
		telTextField = new JTextField();
		telTextField.setBounds(100, 161, 161, 20);
		panel.add(telTextField);
		telTextField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age * :");
		lblAge.setBounds(10, 279, 80, 14);
		panel.add(lblAge);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(100, 276, 161, 20);
		panel.add(ageTextField);
		ageTextField.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse * :");
		lblAdresse.setBounds(10, 204, 80, 14);
		panel.add(lblAdresse);
		
		adresseTextField = new JTextField();
		adresseTextField.setBounds(100, 201, 161, 20);
		panel.add(adresseTextField);
		adresseTextField.setColumns(10);
		
		JLabel lblProfession = new JLabel("Profession * :");
		lblProfession.setBounds(308, 52, 98, 14);
		panel.add(lblProfession);
		
		cinTextField = new JTextField();
		cinTextField.setBounds(100, 242, 161, 20);
		panel.add(cinTextField);
		cinTextField.setColumns(10);
		
		JLabel lblCin = new JLabel("CIN * :");
		lblCin.setBounds(10, 239, 80, 14);
		panel.add(lblCin);
		
		JLabel lblNotifications = new JLabel("Notifications d'op\u00E9rations : ");
		lblNotifications.setBounds(308, 164, 183, 14);
		panel.add(lblNotifications);
		
		JRadioButton rdbtnSms = new JRadioButton("SMS");
		rdbtnSms.setBounds(514, 160, 59, 23);
		panel.add(rdbtnSms);
		
		JRadioButton rdbtnEmail = new JRadioButton("Email");
		rdbtnEmail.setBounds(599, 160, 59, 23);
		panel.add(rdbtnEmail);
		
		JComboBox professionComboBox = new JComboBox();
		professionComboBox.setModel(new DefaultComboBoxModel(new String[] {"ARCHITECTE", "ANALYSTE ", "AVOCAT(E)", "CHARGE(E) DE PROJET", "CHEF DE SERVICE", "DIRECTEUR(TRICE) DES OPERATIONS", "FORMATEUR(TRICE)", "INFORMATICIEN(NE)", "INGENIEUR DES TRAVAUX", "TECHNICIEN(NE)"}));
		professionComboBox.setBounds(437, 49, 231, 20);
		panel.add(professionComboBox);
		
		JLabel lblRevenus = new JLabel("Revenus mensuels :");
		lblRevenus.setBounds(308, 127, 134, 14);
		panel.add(lblRevenus);
		
		revenusTextField = new JTextField();
		revenusTextField.setBounds(448, 124, 156, 20);
		panel.add(revenusTextField);
		revenusTextField.setColumns(10);
		
		JLabel lblFcfa = new JLabel("FCFA");
		lblFcfa.setBounds(614, 127, 54, 14);
		panel.add(lblFcfa);
		
		JButton btnContinuer = new JButton("Suivant");
		btnContinuer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnContinuer.setBounds(564, 346, 104, 23);
		panel.add(btnContinuer);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				// Recuperation des valeurs saisies dans le formulaire
				
					// Declaration des variables
				String nom, prenom, cin, profession, email, adresse, login, password;
				int age, telephone;
				
					// Affectation des valeurs saisies dans le formulaire
				nom = nomTextField.getText();
				prenom = prenomTextField.getText();
				age = Integer.parseInt(ageTextField.getText());		
				cin = cinTextField.getText();
				profession =(String) professionComboBox.getSelectedItem();
				telephone = Integer.parseInt(telTextField.getText());
				email = emailTextField.getText();
				adresse = adresseTextField.getText();
				login = pseudoTextField.getText();
				password = mpTextField.getText();
								
				
					// Creation d'un objet user
				User user = new User();
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
				
				
					// Appel de la methode de la couche Service
				Service service = new Service();
				
				int etat;
				etat = service.saveUserService(user);
				
				if(etat ==1) {
					
						// Vider des zones textes
					nomTextField.setText("");
					prenomTextField.setText("");
					ageTextField.setText("");
					cinTextField.setText("");
					professionComboBox.setActionCommand("");
					telTextField.setText("");
					emailTextField.setText("");
					adresseTextField.setText("");
					pseudoTextField.setText("");
					mpTextField.setText("");
					
						// Affichage du dialoguebox succes
					JOptionPane.showMessageDialog(null, "L'utilisateur " + user.getNom() + " a ete enregistre avec succes dans la base de donnée!");
					
				} else {
					JOptionPane.showMessageDialog(null, " Une erreur s'est produite pendant l'enregistrement");
					
				}
						
			}
		});
		btnEnregistrer.setBounds(448, 346, 98, 23);
		panel.add(btnEnregistrer);
		
		JButton btnAffichers = new JButton("Affichage");
		btnAffichers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Affichage frame = new Affichage();
				frame.setVisible(true);
			}
		});
		btnAffichers.setBounds(548, 7, 120, 23);
		panel.add(btnAffichers);
		
		JLabel lblUser = new JLabel("Pseudo * :");
		lblUser.setBounds(308, 245, 98, 14);
		panel.add(lblUser);
		
		pseudoTextField = new JTextField();
		pseudoTextField.setBounds(448, 242, 156, 20);
		panel.add(pseudoTextField);
		pseudoTextField.setColumns(10);
		
		JLabel lblMotdepasse = new JLabel("Mot de Passe * :");
		lblMotdepasse.setBounds(308, 279, 115, 14);
		panel.add(lblMotdepasse);
		
		mpTextField = new JTextField();
		mpTextField.setBounds(448, 273, 156, 20);
		panel.add(mpTextField);
		mpTextField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Pièces justificatives", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Suivant");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1.setBounds(370, 228, 129, 23);
		panel_1.add(btnNewButton_1);
		
		fileTextField = new JTextField();
		fileTextField.setBounds(37, 45, 286, 29);
		panel_1.add(fileTextField);
		fileTextField.setColumns(10);
		
		JButton btnJoindre = new JButton("Joindre");
		btnJoindre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String filename = f.getAbsolutePath();
				fileTextField.setText(filename);
				
			}
		});
		btnJoindre.setBounds(369, 48, 89, 23);
		panel_1.add(btnJoindre);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Activation du Compte", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Passer \u00E0 l'Identification");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane_1.setSelectedIndex(2);
			}
		});
		btnNewButton.setBounds(275, 240, 223, 23);
		panel_2.add(btnNewButton);
		
		JTextArea txtrConfirmationDacceptation = new JTextArea();
		txtrConfirmationDacceptation.setEditable(false);
		txtrConfirmationDacceptation.setFont(new Font("Century", Font.PLAIN, 10));
		txtrConfirmationDacceptation.setText("1.\tConfirmation d'acceptation du dossier:\r\n\t- R\u00E9ception du code d'acc\u00E8s et du mot de passe pour acc\u00E9der \u00E0 votre espace personnel\r\n\t- Vous pourrez donc acc\u00E9der \u00E0 votre RIB, et faire le versement minimum \r\n\tobligatoire pour activer le compte\r\n\r\n2.\tVersement minimum :\r\n\t- Une fois le virement parvenu sur votre compte bancaire, vous recevrez \r\n\tpar courrier votre carte bancaire\r\n\r\n3.\tR\u00E9ception et activation de la carte bancaire :\r\n\tQuelques jours apr\u00E8s viremement et r\u00E9ception de votre carte bancaire, \r\n\tle code de votre carte bancaire sera\r\n\t- soit envoy\u00E9 dans un courrier s\u00E9par\u00E9\r\n\t- soit vous devrez aller le r\u00E9cup\u00E9rer par SMS depuis votre espace client.\r\n\r\n\tA partir de ce moment l\u00E0 votre compte bancaire en ligne sera activ\u00E9, et votre carte \r\n\tbancaire op\u00E9rationnelle.\r\n");
		txtrConfirmationDacceptation.setBounds(10, 11, 507, 229);
		panel_2.add(txtrConfirmationDacceptation);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Mes Contacts", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_1.addTab("Me Connecter", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblLogin = new JLabel("Identifiant :");
		lblLogin.setBounds(51, 50, 115, 25);
		panel_4.add(lblLogin);
		
		JLabel lblpwd = new JLabel("Mot de passe :");
		lblpwd.setBounds(51, 125, 115, 25);
		panel_4.add(lblpwd);
		
		LoginTextField = new JTextField();
		LoginTextField.setBounds(205, 47, 156, 25);
		panel_4.add(LoginTextField);
		LoginTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(205, 125, 156, 25);
		panel_4.add(passwordField);
		
		JButton btnConnexion = new JButton("Connexion");
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			// Recuperation des valeurs saisies dans le formulaire
				
				// Declaration des variables
				
				String login, password;
				
				// Affectation des valeurs saisies dans le formulaire
				
				login = LoginTextField.getText();
				password = passwordField.getText();
			
				
				// Creation d'un objet user
				/*User user = new User();
				user.setLogin(login);
				user.setPassword(password);*/
							
				// Appel de la methode de la couche Service
				Service service = new Service();
				int etat = service.connecterUserService(login,password);
				//int etat = service.connecterUserService();
				
				// Vider des zones textes
				LoginTextField.setText("");
				passwordField.setText("");
				
				if(etat ==1) {	
					
					// Affichage du dialoguebox succes
					JOptionPane.showMessageDialog(null, " Connexion reussie !");
					EspaceAdmin frame = new EspaceAdmin();
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Identifiant ou Mot de passe erroné");
				}	
							
			}
		});
		btnConnexion.setBounds(342, 223, 115, 25);
		panel_4.add(btnConnexion);
		
		
	}
}
