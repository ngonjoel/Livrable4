package com.objis.cameroun.savelifes.service;

import com.objis.cameroun.savelifes.domaine.Demandeur;
import com.objis.cameroun.savelifes.domaine.Donneur;

/**
 * @author Ngon Joel
 *	@date 02/11/2018
 *	Cette interface contient toutes les signatures des m�thodes li�es � l'enregitrement des utilisateurs
 *	Ces m�thodes sont utilis�es dans la classe Enregistrement
 */
public interface IEnregistrementService {
	

	// Cette m�thode traite les informations d'enregistrement
	// et permet leur v�rification avant enregistrement
	public String affichDonneur(Donneur affiche);
	
	// Cette m�thode g�n�re le nom d'utilisateur du donneur
	public String userName(Donneur affiche);
	
	// Cette m�thode confirme l'ouverture du compte du donneur et affiche les parametres du compte
	public String confirmCreation(Donneur creation);
	/**
	// Cette m�thode traite les informations d'enregistrement du demandeur 
	// et permet leur v�rification par celui - ci
	public void affichDemandeur(Demandeur affiche);
	
	//Cette m�thode confirme l'ouverture du compte demandeur et affiche ses parametres de compte
	public void confirmCompte(Demandeur creation);
	*/
	//Cette methode permet l'insertion d'un donneur via dao
	public void insererDonneurImp(Donneur donneur);
			
	
}
