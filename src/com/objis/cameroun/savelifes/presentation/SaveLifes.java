package com.objis.cameroun.savelifes.presentation;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.objis.cameroun.savelifes.domaine.Donneur;
import com.objis.cameroun.savelifes.service.EnregistrementServiceImp;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaveLifes {

	private JFrame frame;
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaveLifes window = new SaveLifes();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void fermer() {
		frame.dispose();
	}
	/**
	 * Create the application.
	 */
	public SaveLifes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Dossier PersonnelEclipse\\WorkSpacedls\\SaveLifes\\icon\\Globe_24x24.png"));
		frame.setBackground(new Color(222, 184, 135));
		frame.getContentPane().setBackground(new Color(240, 230, 140));
		frame.setResizable(false);
		frame.setBounds(100, 100, 583, 303);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 232, 170));
		panel.setLayout(null);
		panel.setBounds(10, 11, 553, 256);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("    =====SaveLifes=====");
		label.setForeground(new Color(0, 0, 205));
		label.setFont(new Font("Tempus Sans ITC", Font.BOLD, 24));
		label.setBounds(133, 11, 276, 30);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 11, 498, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 39, 498, 2);
		panel.add(separator_1);
		
		JLabel label_1 = new JLabel("One register - One life save");
		label_1.setForeground(new Color(25, 25, 112));
		label_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		label_1.setBounds(196, 226, 189, 19);
		panel.add(label_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 225, 498, 2);
		panel.add(separator_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 230, 140));
		panel_1.setLayout(null);
		panel_1.setBounds(45, 44, 454, 105);
		panel.add(panel_1);
		
		JLabel label_2 = new JLabel("USERNAME : ");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setIcon(new ImageIcon("C:\\Dossier PersonnelEclipse\\WorkSpacedls\\SaveLifes\\icons\\User_16x16.png"));
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_2.setBounds(10, 11, 110, 14);
		panel_1.add(label_2);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setIcon(new ImageIcon("C:\\Dossier PersonnelEclipse\\WorkSpacedls\\SaveLifes\\icons\\Key_16x16.png"));
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblPassword.setBounds(22, 49, 91, 14);
		panel_1.add(lblPassword);
		
		usernameTextField = new JTextField();
		usernameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		usernameTextField.setColumns(10);
		usernameTextField.setBounds(127, 8, 172, 20);
		panel_1.add(usernameTextField);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(127, 46, 172, 20);
		panel_1.add(passwordField);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("En vous enregistrant vous\r\npouvez sauver une vie !\r\nEn faisant un don de sang \r\nvous sauvez une vie!");
		textArea.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 12));
		textArea.setBackground(new Color(240, 230, 140));
		textArea.setBounds(309, 8, 135, 68);
		panel_1.add(textArea);
		
		JButton btnConnexion = new JButton("Connecter");
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			if(passwordField.getText().equals("janvier" ) && usernameTextField.getText().equals("elko"))
			{
				FicheEnvoi frame = new FicheEnvoi();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				
								fermer();
			}
			else {		
					JOptionPane.showMessageDialog(null, " Mot de passe ou username eronné");
			}
				
					

				
			}
		});
		btnConnexion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConnexion.setIcon(new ImageIcon("C:\\Dossier PersonnelEclipse\\WorkSpacedls\\SaveLifes\\icons\\Globe_16x16.png"));
		btnConnexion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConnexion.setHorizontalAlignment(SwingConstants.RIGHT);
		btnConnexion.setBounds(new Rectangle(30, 30, 30, 30));
		btnConnexion.setBounds(189, 77, 110, 23);
		panel_1.add(btnConnexion);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\MyWorkspace\\SaveLifeAp\\icon\\Globe_24x24.png"));
		lblNewLabel.setBounds(164, 77, 26, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblIfYouAre = new JLabel("    If you are not already register, create your acount now by clicking on the button bellow");
		lblIfYouAre.setForeground(new Color(25, 25, 112));
		lblIfYouAre.setBackground(new Color(238, 232, 170));
		lblIfYouAre.setBounds(24, 160, 498, 30);
		panel.add(lblIfYouAre);
		
		JButton button_1 = new JButton("Create");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enregistrement frame = new Enregistrement();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				fermer();
			}
		});
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setBounds(433, 191, 89, 23);
		panel.add(button_1);
		
		JLabel label_3 = new JLabel("___Joelvic___");
		label_3.setForeground(new Color(25, 25, 112));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_3.setBounds(465, 238, 88, 14);
		panel.add(label_3);
	}

}
