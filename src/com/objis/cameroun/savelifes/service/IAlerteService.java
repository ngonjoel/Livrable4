package com.objis.cameroun.savelifes.service;

import com.objis.cameroun.savelifes.domaine.Demandeur;

/**
 * @author Ngon Joel
 * Cette interface contient les signatures des methodes utlisées dans la classe Alerte
 * 
 */
public interface IAlerteService {
	
//  Cette méthode traite les informations à envoyer aux eventuels donneurs
	public void affichAlerte(Demandeur client);
	
	// Cette méthode permet la confirmation de l'envoi de notifications d'alertes
	public void confirmAlerte(Demandeur confirm);
}
