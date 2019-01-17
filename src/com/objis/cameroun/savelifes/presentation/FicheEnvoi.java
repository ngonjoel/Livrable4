package com.objis.cameroun.savelifes.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class FicheEnvoi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FicheEnvoi frame = new FicheEnvoi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the frame.
	 */
	public FicheEnvoi() {
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
		panel.setBounds(10, 11, 405, 501);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(22, 48, 358, 429);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(185, 5, 0, 0);
		panel_1.add(label);
		
		JLabel lblInformationsSurLe = new JLabel("Informations sur le b\u00E9n\u00E9ficiaire");
		lblInformationsSurLe.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformationsSurLe.setBounds(39, 5, 284, 14);
		panel_1.add(lblInformationsSurLe);
		
		JTextArea txtrGroupeSanguin = new JTextArea();
		txtrGroupeSanguin.setForeground(new Color(0, 0, 0));
		txtrGroupeSanguin.setBackground(new Color(240, 230, 140));
		txtrGroupeSanguin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrGroupeSanguin.setText("Groupe sanguin :\r\n     recherch\u00E9");
		txtrGroupeSanguin.setBounds(21, 47, 107, 42);
		panel_1.add(txtrGroupeSanguin);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(131, 30, 192, 58);
		panel_1.add(panel_2);
		
		JRadioButton aRadio = new JRadioButton("A+");
		aRadio.setBackground(new Color(240, 230, 140));
		aRadio.setBounds(0, 7, 41, 23);
		panel_2.add(aRadio);
		
		JRadioButton aaRadio = new JRadioButton("A-");
		aaRadio.setBackground(new Color(240, 230, 140));
		aaRadio.setBounds(43, 7, 37, 23);
		panel_2.add(aaRadio);
		
		JRadioButton bRadio = new JRadioButton("B+");
		bRadio.setBackground(new Color(240, 230, 140));
		bRadio.setBounds(82, 7, 41, 23);
		panel_2.add(bRadio);
		
		JRadioButton bbRadio = new JRadioButton("B-");
		bbRadio.setBackground(new Color(240, 230, 140));
		bbRadio.setBounds(125, 7, 41, 23);
		panel_2.add(bbRadio);
		
		JRadioButton oRadio = new JRadioButton("O+");
		oRadio.setBackground(new Color(240, 230, 140));
		oRadio.setBounds(0, 33, 41, 23);
		panel_2.add(oRadio);
		
		JRadioButton ooRadio = new JRadioButton("O-");
		ooRadio.setBackground(new Color(240, 230, 140));
		ooRadio.setBounds(43, 33, 47, 23);
		panel_2.add(ooRadio);
		
		JRadioButton aBRadio = new JRadioButton("AB+");
		aBRadio.setBackground(new Color(240, 230, 140));
		aBRadio.setBounds(92, 33, 50, 23);
		panel_2.add(aBRadio);
		
		JRadioButton abRadio = new JRadioButton("AB-");
		abRadio.setBackground(new Color(240, 230, 140));
		abRadio.setBounds(141, 33, 51, 23);
		panel_2.add(abRadio);
		
		JTextArea txtrVilleDeLocalisation = new JTextArea();
		txtrVilleDeLocalisation.setBackground(new Color(240, 230, 140));
		txtrVilleDeLocalisation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrVilleDeLocalisation.setText("Ville de localisation :\r\n   du b\u00E9n\u00E9ficiaire");
		txtrVilleDeLocalisation.setBounds(21, 114, 122, 36);
		panel_1.add(txtrVilleDeLocalisation);
		
		textField = new JTextField();
		textField.setBounds(145, 115, 132, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrNomDeLhpital = new JTextArea();
		txtrNomDeLhpital.setBackground(new Color(240, 230, 140));
		txtrNomDeLhpital.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrNomDeLhpital.setText("Nom de l'h\u00F4pital :");
		txtrNomDeLhpital.setBounds(21, 179, 107, 22);
		panel_1.add(txtrNomDeLhpital);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 176, 132, 28);
		panel_1.add(textField_1);
		
		JLabel lblDonneurs = new JLabel("20 donneurs :");
		lblDonneurs.setForeground(new Color(0, 0, 0));
		lblDonneurs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDonneurs.setBounds(20, 269, 78, 14);
		panel_1.add(lblDonneurs);
		
		JRadioButton pRadio = new JRadioButton("200 Fcfa");
		pRadio.setForeground(new Color(25, 25, 112));
		pRadio.setBackground(new Color(240, 230, 140));
		pRadio.setBounds(95, 266, 76, 23);
		panel_1.add(pRadio);
		
		JLabel lblDonneurs_1 = new JLabel("30 donneurs :");
		lblDonneurs_1.setForeground(new Color(0, 0, 0));
		lblDonneurs_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDonneurs_1.setBounds(201, 269, 80, 14);
		panel_1.add(lblDonneurs_1);
		
		JTextArea txtrACombienDe = new JTextArea();
		txtrACombienDe.setForeground(new Color(0, 0, 0));
		txtrACombienDe.setBackground(new Color(240, 230, 140));
		txtrACombienDe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtrACombienDe.setText("A combien de donneurs voulez-vous envoyer des \r\nnotifications?");
		txtrACombienDe.setBounds(10, 216, 328, 42);
		panel_1.add(txtrACombienDe);
		
		JRadioButton dRadio = new JRadioButton("300 Fcfa");
		dRadio.setForeground(new Color(25, 25, 112));
		dRadio.setBackground(new Color(240, 230, 140));
		dRadio.setBounds(279, 266, 73, 23);
		panel_1.add(dRadio);
		
		JLabel lblDonneurs_2 = new JLabel("50 donneurs :");
		lblDonneurs_2.setForeground(new Color(0, 0, 0));
		lblDonneurs_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDonneurs_2.setBackground(new Color(240, 230, 140));
		lblDonneurs_2.setBounds(107, 307, 78, 14);
		panel_1.add(lblDonneurs_2);
		
		JRadioButton tRadio = new JRadioButton("400 Fcfa");
		tRadio.setForeground(new Color(25, 25, 112));
		tRadio.setBackground(new Color(240, 230, 140));
		tRadio.setBounds(185, 304, 76, 23);
		panel_1.add(tRadio);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.setIcon(new ImageIcon("C:\\Dossier PersonnelEclipse\\WorkSpacedls\\SaveLifes\\icons\\Globe_16x16.png"));
		btnSuivant.setBounds(249, 395, 99, 23);
		panel_1.add(btnSuivant);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 11, 370, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 39, 370, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 488, 370, 2);
		panel.add(separator_2);
		
		JLabel label_8 = new JLabel("    =====SaveLifes=====");
		label_8.setForeground(new Color(0, 0, 205));
		label_8.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		label_8.setBounds(59, 11, 276, 30);
		panel.add(label_8);
		
		JLabel lblNbVeuillezRemplir = new JLabel("NB: Veuillez remplir tous les champs");
		lblNbVeuillezRemplir.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		lblNbVeuillezRemplir.setBounds(20, 513, 199, 14);
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
				
				//Gestion choix nombre donneur
				//Cas 20 donneur
				pRadio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if(pRadio.isSelected()) {
							
							dRadio.setSelected(false);
							tRadio.setSelected(false);
							
						}
					}
				});
				
				//Cas 30
				dRadio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						if(dRadio.isSelected()) {
							
							pRadio.setSelected(false);
							tRadio.setSelected(false);
							
						}
					}
				});
				
				//Cas 50
				tRadio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						

						if(tRadio.isSelected()) {
							pRadio.setSelected(false);
							dRadio.setSelected(false);
							
						}
					}
				});
	}
}
