package com.objis.cameroun.savelifes.presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.savelifes.domaine.Donneur;
import com.objis.cameroun.savelifes.service.EnregistrementServiceImp;
import com.objis.cameroun.savelifes.service.IEnregistrementService;

/**
 * @author Ngon Joel
 * Cette méthode permet la vérification des données entrées pour l'enregistrement
 * Il y a donc possibilité de les modifier en cas d'erreur
 *
 */
public class VerifierEnregistement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerifierEnregistement frame = new VerifierEnregistement();
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
	public VerifierEnregistement(Donneur donneur) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(10, 11, 405, 538);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("One register - One life save");
		label_1.setForeground(new Color(25, 25, 112));
		label_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		label_1.setBounds(126, 519, 189, 19);
		panel.add(label_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 11, 370, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 42, 370, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 519, 370, 2);
		panel.add(separator_2);
		
		JLabel lblenregistrement = new JLabel("  =====Enregistrement=====");
		lblenregistrement.setForeground(new Color(0, 0, 205));
		lblenregistrement.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		lblenregistrement.setBounds(38, 11, 340, 33);
		panel.add(lblenregistrement);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setBounds(22, 42, 362, 474);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setBounds(185, 5, 0, 0);
		panel_1.add(label);
		
		JTextArea txtrLesInformationsQue = new JTextArea();
		txtrLesInformationsQue.setText(" Les informations que vous venez d'entrer sont les suivantes:\r\n         Pour les modifier cliquez sur le bouton \"Modifier\"\r\n         Sinon pour les enregistrer cliquez sur  \"Enregistrer\"");
		txtrLesInformationsQue.setForeground(new Color(72, 61, 139));
		txtrLesInformationsQue.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtrLesInformationsQue.setEditable(false);
		txtrLesInformationsQue.setBackground(new Color(240, 230, 140));
		txtrLesInformationsQue.setBounds(30, 11, 305, 55);
		panel_1.add(txtrLesInformationsQue);
		
		JTextArea enregistrerTextArea = new JTextArea();
		enregistrerTextArea.setEditable(false);
		enregistrerTextArea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		EnregistrementServiceImp enregistrement = new EnregistrementServiceImp();
		enregistrerTextArea.setText(enregistrement.affichDonneur(donneur)); 
		enregistrerTextArea.setBackground(new Color(240, 230, 140));
		enregistrerTextArea.setBounds(10, 65, 342, 359);
		panel_1.add(enregistrerTextArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(112, 424, 240, 39);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton modifierButton = new JButton("Modifier");
		modifierButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enregistrement frame = new Enregistrement();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				fermer();
			}
		});
		modifierButton.setBounds(10, 11, 89, 23);
		panel_2.add(modifierButton);
		
		//Gestion du bouton "Enregistrer"
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				IEnregistrementService register = new EnregistrementServiceImp();
				
				//Appel de la méthode qui permet l'insertion du donneur dans la bd
				register.insererDonneurImp(donneur);
				
				ConfirmationEnregistrement frame = new ConfirmationEnregistrement(donneur);
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				fermer();
				
			}
		});
		btnEnregistrer.setBounds(125, 11, 105, 23);
		panel_2.add(btnEnregistrer);
	}
}
