package com.objis.cameroun.savelifes.presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.savelifes.domaine.Donneur;
import javax.swing.JPasswordField;

public class Enregistrement extends JFrame {
	
	private JTextField nomTextField;
	private JTextField prenomTextField;
	private JTextField telephoneTextField;
	private JTextField adresseTextField;
	private JTextField villeTextField;

	private JPanel contentPane;
	
	//Déclaration des variables d'enregistrement du donneur
	String nom;
	String prenom ;
	String sexe ;
	String age ;
	String groupSang ;
	String groupeDesire ;
	String telephone ;
	String adresseMail ;
	String villeResidence ;
	String motDePasse;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enregistrement frame = new Enregistrement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	
	public void fermer() {
		dispose();
	}
	/**
	 * Create the frame.
	 */
	public Enregistrement() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(10, 11, 405, 483);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(38, 48, 340, 394);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(185, 5, 0, 0);
		panel_1.add(label);
		
		JLabel lblNom = new JLabel("NOM :");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNom.setBounds(29, 11, 46, 14);
		panel_1.add(lblNom);
		
		JLabel lblPrenom = new JLabel("PRENOM :");
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrenom.setBounds(29, 52, 77, 14);
		panel_1.add(lblPrenom);
		
		nomTextField = new JTextField();
		nomTextField.setBounds(97, 9, 201, 20);
		panel_1.add(nomTextField);
		nomTextField.setColumns(10);
		
		prenomTextField = new JTextField();
		prenomTextField.setColumns(10);
		prenomTextField.setBounds(97, 50, 201, 20);
		panel_1.add(prenomTextField);
		
		JLabel label_2 = new JLabel("SEXE :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(29, 124, 46, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("\u00C2GE :");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(32, 162, 46, 14);
		panel_1.add(label_3);
		
		JComboBox ageComboBox = new JComboBox();
		ageComboBox.setModel(new DefaultComboBoxModel(new String[] {"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70"}));
		ageComboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ageComboBox.setBounds(108, 159, 46, 20);
		panel_1.add(ageComboBox);
		
		JLabel label_4 = new JLabel("GROUPE SANGUIN :");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(29, 204, 119, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("TELEPHONE :");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(32, 250, 84, 14);
		panel_1.add(label_5);
		
		telephoneTextField = new JTextField();
		telephoneTextField.setColumns(10);
		telephoneTextField.setBounds(108, 248, 190, 20);
		panel_1.add(telephoneTextField);
		
		JLabel label_6 = new JLabel("ADRESSE MAIL :");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(29, 295, 119, 14);
		panel_1.add(label_6);
		
		adresseTextField = new JTextField();
		adresseTextField.setColumns(10);
		adresseTextField.setBounds(133, 293, 168, 20);
		panel_1.add(adresseTextField);
		
		JLabel label_7 = new JLabel("VILLE DE RESIDENCE :");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(29, 333, 134, 14);
		panel_1.add(label_7);
		
		villeTextField = new JTextField();
		villeTextField.setText("");
		villeTextField.setColumns(10);
		villeTextField.setBounds(165, 327, 138, 20);
		panel_1.add(villeTextField);
		
		JButton button = new JButton("Suivant");
		
		button.setIcon(new ImageIcon("C:\\Dossier PersonnelEclipse\\WorkSpacedls\\SaveLifes\\icon\\Globe_16x16.png"));
		button.setBounds(217, 360, 96, 23);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(74, 108, 224, 43);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton radioFemme = new JRadioButton("Femme");
		
		radioFemme.setBackground(new Color(240, 230, 140));
		radioFemme.setBounds(6, 12, 69, 23);
		panel_2.add(radioFemme);
		
		JRadioButton radioHomme = new JRadioButton("Homme");
		radioHomme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radioHomme.isSelected()) {
					radioFemme.setSelected(false);
				}
			}
		});
		
		radioFemme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radioFemme.isSelected());
					radioHomme.setSelected(false);
			}
		});
		
		radioHomme.setBackground(new Color(240, 230, 140));
		radioHomme.setBounds(82, 12, 78, 23);
		panel_2.add(radioHomme);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 230, 140));
		panel_3.setBounds(148, 179, 192, 58);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton aRadio = new JRadioButton("A+");
		
		aRadio.setBackground(new Color(240, 230, 140));
		aRadio.setBounds(0, 7, 41, 23);
		panel_3.add(aRadio);
		
		JRadioButton aaRadio = new JRadioButton("A-");
		
		
		aaRadio.setBackground(new Color(240, 230, 140));
		aaRadio.setBounds(43, 7, 37, 23);
		panel_3.add(aaRadio);
		
		JRadioButton bRadio = new JRadioButton("B+");
		
		bRadio.setBackground(new Color(240, 230, 140));
		bRadio.setBounds(82, 7, 41, 23);
		panel_3.add(bRadio);
		
		JRadioButton bbRadio = new JRadioButton("B-");
		
		bbRadio.setBackground(new Color(240, 230, 140));
		bbRadio.setBounds(125, 7, 41, 23);
		panel_3.add(bbRadio);
		
		JRadioButton oRadio = new JRadioButton("O+");
		
		oRadio.setBackground(new Color(240, 230, 140));
		oRadio.setBounds(0, 33, 41, 23);
		panel_3.add(oRadio);
		
		JRadioButton ooRadio = new JRadioButton("O-");
		
		ooRadio.setBackground(new Color(240, 230, 140));
		ooRadio.setBounds(43, 33, 47, 23);
		panel_3.add(ooRadio);
		
		JRadioButton aBRadio = new JRadioButton("AB+");
		
		aBRadio.setBackground(new Color(240, 230, 140));
		aBRadio.setBounds(92, 33, 50, 23);
		panel_3.add(aBRadio);
		
		JRadioButton abRadio = new JRadioButton("AB-");
		
		abRadio.setBackground(new Color(240, 230, 140));
		abRadio.setBounds(141, 33, 51, 23);
		panel_3.add(abRadio);
		
		JLabel lblMotDePasse = new JLabel("MOT DE PASSE :");
		lblMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMotDePasse.setBounds(29, 89, 107, 14);
		panel_1.add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 87, 165, 20);
		panel_1.add(passwordField);
		
		JLabel label_1 = new JLabel("One register - One life save");
		label_1.setForeground(new Color(25, 25, 112));
		label_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		label_1.setBounds(122, 453, 189, 19);
		panel.add(label_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 11, 370, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 39, 370, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 454, 370, 2);
		panel.add(separator_2);
		
		JLabel label_8 = new JLabel("    =====SaveLifes=====");
		label_8.setForeground(new Color(0, 0, 205));
		label_8.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		label_8.setBounds(59, 11, 276, 30);
		panel.add(label_8);
		
		JLabel lblNbVeuillezRemplir = new JLabel("NB: Veuillez remplir tous les champs");
		lblNbVeuillezRemplir.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		lblNbVeuillezRemplir.setBounds(20, 505, 199, 14);
		contentPane.add(lblNbVeuillezRemplir);
		
		JLabel label_9 = new JLabel("___Joelvic___");
		label_9.setForeground(new Color(25, 25, 112));
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_9.setBounds(327, 535, 88, 14);
		contentPane.add(label_9);
		
		//Gestion des radio button sanguin
		//Cas A+
		aRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(aRadio.isSelected()) {
					aaRadio.setSelected(false);
					bRadio.setSelected(false);
					bbRadio.setSelected(false);
					oRadio.setSelected(false);
					ooRadio.setSelected(false);
					aBRadio.setSelected(false);
					abRadio.setSelected(false);
				}
			}
		});
		
		//Cas A-
		aaRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(aaRadio.isSelected()) {
					aRadio.setSelected(false);
					bRadio.setSelected(false);
					bbRadio.setSelected(false);
					oRadio.setSelected(false);
					ooRadio.setSelected(false);
					aBRadio.setSelected(false);
					abRadio.setSelected(false);
				}
			}
		});
		
		//Cas B+
		bRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bRadio.isSelected()) {
					aRadio.setSelected(false);
					aaRadio.setSelected(false);
					bbRadio.setSelected(false);
					oRadio.setSelected(false);
					ooRadio.setSelected(false);
					aBRadio.setSelected(false);
					abRadio.setSelected(false);
				}
			}
		});
		
		//Cas B-
		bbRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(bbRadio.isSelected()) {
					aRadio.setSelected(false);
					aaRadio.setSelected(false);
					bRadio.setSelected(false);
					oRadio.setSelected(false);
					ooRadio.setSelected(false);
					aBRadio.setSelected(false);
					abRadio.setSelected(false);
				}
			}
		});
		
		//Cas O+
		oRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(oRadio.isSelected()) {
					aRadio.setSelected(false);
					aaRadio.setSelected(false);
					bRadio.setSelected(false);
					bbRadio.setSelected(false);
					ooRadio.setSelected(false);
					aBRadio.setSelected(false);
					abRadio.setSelected(false);
				}
			}
		});
		
		//Cas O-
		ooRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(ooRadio.isSelected()) {
					aRadio.setSelected(false);
					aaRadio.setSelected(false);
					bRadio.setSelected(false);
					bbRadio.setSelected(false);
					oRadio.setSelected(false);
					aBRadio.setSelected(false);
					abRadio.setSelected(false);
				}
			}
		});
		
		//Cas AB
		aBRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(aBRadio.isSelected()) {
					aRadio.setSelected(false);
					aaRadio.setSelected(false);
					bRadio.setSelected(false);
					bbRadio.setSelected(false);
					oRadio.setSelected(false);
					ooRadio.setSelected(false);
					abRadio.setSelected(false);
				}
			}
		});
		
		//Cas AB-
		abRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				if(abRadio.isSelected()) {
					aRadio.setSelected(false);
					aaRadio.setSelected(false);
					bRadio.setSelected(false);
					bbRadio.setSelected(false);
					oRadio.setSelected(false);
					ooRadio.setSelected(false);
					aBRadio.setSelected(false);
				}
			}
		});
		//Fonctionalité du boutton suivant
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String choix = " ";
				String monchoix = " ";
				//Recupération des données entrées pour l'enregistrement 
				
				nom = nomTextField.getText();
				prenom = prenomTextField.getText();
				motDePasse = passwordField.getText();
				if(radioFemme.isSelected()) {
					
					sexe = "F";
				}
				else{
					sexe = "M";
				};
				
				age = ageComboBox.getSelectedItem().toString();
			//	telephone = telephoneTextField.getText();
			//	adresseMail = adresseTextField.getText();
			
				if(aRadio.isSelected()){
					
					groupSang = "A+";
					
				}
				else if(aaRadio.isSelected())
				{
						groupSang = "A-";
				}
				else if(bRadio.isSelected())
				{
					groupSang = "B+";
				}
				else if(bbRadio.isSelected())
				{
					groupSang = "B-";
				}else if(oRadio.isSelected())
				{
					groupSang = "O+";
				}else if(ooRadio.isSelected())
				{
					groupSang = "O-";
				}else if(aBRadio.isSelected())
				{
					groupSang = "AB+";
				}else if(abRadio.isSelected())
				{
					groupSang = "AB-";
				}
			
				telephone = telephoneTextField.getText();
				
				adresseMail = adresseTextField.getText();
				
				villeResidence = villeTextField.getText();
				
				telephoneTextField.setText(null);
				adresseTextField.setText(null);
				aRadio.setText(null);
				nomTextField.setText(null);
				prenomTextField.setText(null);
				radioFemme.setText(null);
				aRadio.setText(null);
				aaRadio.setText(null);
				bRadio.setText(null);
				bbRadio.setText(null);
				oRadio.setText(null);
				ooRadio.setText(null);
				aBRadio.setText(null);
				abRadio.setText(null);
				
				
				Donneur donneur = new Donneur(nom, prenom, sexe, age, groupSang, telephone, adresseMail, villeResidence, motDePasse);
				
				VerifierEnregistement  frame = new VerifierEnregistement(donneur);
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				fermer();
			}
		});
	
	}
}
