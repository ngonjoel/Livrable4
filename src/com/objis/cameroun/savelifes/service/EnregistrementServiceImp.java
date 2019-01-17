package com.objis.cameroun.savelifes.service;

import com.objis.cameroun.savelifes.dao.DaoImp;
import com.objis.cameroun.savelifes.dao.IDao;
import com.objis.cameroun.savelifes.domaine.Demandeur;
import com.objis.cameroun.savelifes.domaine.Donneur;

/**
 * @author Ngon Joel
 * @date 21/09/2018
 * Cette classe contient toutes les m�thodes li�es � l'enregitrement des utilisateurs
 *
 */

public class EnregistrementServiceImp implements IEnregistrementService{
	
	private IDao dao = new DaoImp();
	
	
	/**
	 * Cette m�thode traite les informations d'enregistrement 
	 * et permet leur v�rification avant enregistrement
	 * @param affiche
	 * @return 
	 */
	public String affichDonneur(Donneur affiche){
		return
				"Les informations que vous venez d'entrer sont les suivantes:  \n" +
				" \n" +
				"NOM:   " + affiche.getNomDonneur() +  " \n" +
				"PRENOM:   " + affiche.getPrenomDonneur() + " \n" +
				"SEXE:   " + affiche.getSexeDonneur() + " \n" +
				"AGE:   "	 + affiche.getAgeDonneur() + " ans  \n" +
				"GROUPE SANGUIN:   " + affiche.getSangDonneur() + " \n" +
				"NUMERO DE TELEPHONE:   " + affiche.getTelephone() + " \n" +						
				"ADRESSE MAIL:   " + affiche.getAdresseMail() + " \n" +
				"VILLE DE RESIDENCE:   " + affiche.getVilleResidence() ;
				
	}
	
	
	/**
	 * Cette m�thode g�n�re le nom d'utilisateur 
	 * du donneur
	 * @param affiche
	 * @return user
	 */ 
	public String userName(Donneur affiche){
		String prefixe = "don.";
		String surfixe = "@save";
		
		String user = prefixe + affiche.getNomDonneur().substring(0,3).toLowerCase() + surfixe;
		return user;
	}
	
	/**
	 * Cette m�thode permet de fournir les param�tres du donneur � la m�thode indererDonneur de la classe DaoImp
	 * @param donneur
	 */
	public void insererDonneurImp(Donneur donneur) {
		
		dao.insererDonneur(donneur);
	}
	
	/**
	 * Cette m�thode confirme l'ouverture du compte du donneur 
	 * et affiche les parametres du compte
	 * @param creation
	 * @param demande
	 */
	public String confirmCreation(Donneur creation){
		
		String compte = userName(creation);
		
		
				return "VOTRE NOM D'UTILISATEUR EST: \n" +
				"USERNAME: " + compte ;
				
	}
	
	
	
}
