package com.objis.cameroun.savelifes.service;

import com.objis.cameroun.savelifes.domaine.Demandeur;
import com.objis.cameroun.savelifes.domaine.Donneur;

/**
 * @author Ngon Joel
 *	@date 02/11/2018
 *	Cette interface contient toutes les signatures des méthodes liées à l'enregitrement des utilisateurs
 *	Ces méthodes sont utilisées dans la classe Enregistrement
 */
public interface IEnregistrementService {
	

	// Cette méthode traite les informations d'enregistrement
	// et permet leur vérification avant enregistrement
	public String affichDonneur(Donneur affiche);
	
	// Cette méthode génère le nom d'utilisateur du donneur
	public String userName(Donneur affiche);
	
	// Cette méthode confirme l'ouverture du compte du donneur et affiche les parametres du compte
	public String confirmCreation(Donneur creation);
	/**
	// Cette méthode traite les informations d'enregistrement du demandeur 
	// et permet leur vérification par celui - ci
	public void affichDemandeur(Demandeur affiche);
	
	//Cette méthode confirme l'ouverture du compte demandeur et affiche ses parametres de compte
	public void confirmCompte(Demandeur creation);
	*/
	//Cette methode permet l'insertion d'un donneur via dao
	public void insererDonneurImp(Donneur donneur);
			
	
}
