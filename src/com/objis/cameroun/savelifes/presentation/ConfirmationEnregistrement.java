package com.objis.cameroun.savelifes.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.savelifes.domaine.Donneur;
import com.objis.cameroun.savelifes.service.EnregistrementServiceImp;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfirmationEnregistrement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmationEnregistrement frame = new ConfirmationEnregistrement();
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
	public ConfirmationEnregistrement(Donneur donneur) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 232, 170));
		panel.setLayout(null);
		panel.setBounds(10, 11, 553, 256);
		contentPane.add(panel);
		
		JLabel label = new JLabel("    =====Confirmation=====");
		label.setForeground(new Color(0, 0, 205));
		label.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		label.setBounds(114, 11, 315, 30);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(44, 11, 478, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(44, 39, 478, 2);
		panel.add(separator_1);
		
		JLabel label_1 = new JLabel("One register - One life save");
		label_1.setForeground(new Color(25, 25, 112));
		label_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		label_1.setBounds(197, 235, 189, 19);
		panel.add(label_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 235, 519, 2);
		panel.add(separator_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(null);
		panel_1.setBounds(10, 44, 554, 137);
		panel.add(panel_1);
		
		JLabel lblVotreCompteA = new JLabel("Votre compte a \u00E9t\u00E9 cr\u00E9\u00E9 avec succ\u00E8s !!!");
		lblVotreCompteA.setHorizontalAlignment(SwingConstants.CENTER);
		lblVotreCompteA.setBounds(71, 11, 398, 14);
		panel_1.add(lblVotreCompteA);
		
		JTextArea confirmationTextArea = new JTextArea();
		
		//Appel de la classe "EnregistrerServiceImp
		EnregistrementServiceImp confirm = new EnregistrementServiceImp();
		confirmationTextArea.setText(confirm.confirmCreation(donneur));
		
		confirmationTextArea.setEditable(false);
		confirmationTextArea.setBounds(86, 36, 373, 44);
		panel_1.add(confirmationTextArea);
		
		JTextArea txtrvousPouvezDs = new JTextArea();
		txtrvousPouvezDs.setBackground(new Color(240, 230, 140));
		txtrvousPouvezDs.setForeground(new Color(25, 25, 112));
		txtrvousPouvezDs.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtrvousPouvezDs.setText("  Vous pouvez d\u00E8s maintenant recevoir des notifications d'alertes de personnes ayant besoin d'un don de sang \r\n              \t  Bien vouloir les contacter par le num\u00E9ro qui s'affichera au bas de la notification");
		txtrvousPouvezDs.setBounds(10, 89, 534, 38);
		panel_1.add(txtrvousPouvezDs);
		
		JLabel label_2 = new JLabel("___Joelvic___");
		label_2.setForeground(new Color(25, 25, 112));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_2.setBounds(476, 238, 88, 14);
		panel.add(label_2);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(421, 192, 89, 23);
		panel.add(btnQuitter);
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FicheEnvoi frame = new FicheEnvoi();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				
				fermer();
			}
		});
		btnSuivant.setIcon(new ImageIcon("C:\\Dossier PersonnelEclipse\\WorkSpacedls\\SaveLifes\\icons\\Globe_16x16.png"));
		btnSuivant.setBounds(61, 192, 99, 23);
		panel.add(btnSuivant);
		
		JTextArea txtrCliquerSursuivant = new JTextArea();
		txtrCliquerSursuivant.setForeground(new Color(25, 25, 112));
		txtrCliquerSursuivant.setBackground(new Color(238, 232, 170));
		txtrCliquerSursuivant.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtrCliquerSursuivant.setText("Cliquer sur \"Suivant\" pour chercher des donneurs\r\n              Cliquer sur \"Quitter\" pour sortir");
		txtrCliquerSursuivant.setBounds(170, 192, 241, 32);
		panel.add(txtrCliquerSursuivant);
	}

}
