package com.objis.cameroun.savelifes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.objis.cameroun.savelifes.domaine.Demandeur;
import com.objis.cameroun.savelifes.domaine.Donneur;
import com.objis.cameroun.savelifes.service.EnregistrementServiceImp;

public class DaoImp implements IDao{ 
	
	//Recup�ration de le date actuelle 
	Date actuelle = new Date();
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String date = dateFormat.format(actuelle);
	String dc = date;
	
	/* (non-Javadoc)
	 * @author ngon joel
	 * Cette methode permet l'insertion d'un donneur dans la base de donn�es
	 */
	public void insererDonneur(Donneur donneur) {
		
		//Cr�ation d'un objet service
		EnregistrementServiceImp service = new EnregistrementServiceImp();		
		
		String login = service.userName(donneur);
		try {
			//R�cup�ration de la connexion
			Connection connection = ConnectionMYSQL.getInstance();
			
			//Cr�ation d'un objet  statement et preparation de la requete
			String query = "INSERT into donneurs (nom, prenom, sexe, age, groupSang, telephone, adresseMail, villeResidence, login, motDepasse, date)" + "VALUES(?, ?, ?, ?, ?, ?, ?,?,?,?,'"+dc+"')";
			
			PreparedStatement pstatement = connection.prepareStatement(query);
			
			pstatement.setString(1, donneur.getNomDonneur());
			pstatement.setString(2, donneur.getPrenomDonneur());
			pstatement.setString(3, donneur.getSexeDonneur());
			pstatement.setString(4, donneur.getAgeDonneur());
			pstatement.setString(5, donneur.getSangDonneur());
			pstatement.setString(6, donneur.getTelephone());
			pstatement.setString(7, donneur.getAdresseMail());
			pstatement.setString(8, donneur.getVilleResidence());
			pstatement.setString(9, login);
			pstatement.setString(10, donneur.getMotDePasse());
			
			pstatement.executeUpdate();
			
			System.out.println("Vos donn�es ont �t� enregistr�es avec succ�s.");
			
			}catch(SQLException e) {
				System.err.println(e);
			}
	}
		
}
