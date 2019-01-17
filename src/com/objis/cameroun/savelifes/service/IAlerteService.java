package com.objis.cameroun.savelifes.service;

import com.objis.cameroun.savelifes.domaine.Demandeur;

/**
 * @author Ngon Joel
 * Cette interface contient les signatures des methodes utlis�es dans la classe Alerte
 * 
 */
public interface IAlerteService {
	
//  Cette m�thode traite les informations � envoyer aux eventuels donneurs
	public void affichAlerte(Demandeur client);
	
	// Cette m�thode permet la confirmation de l'envoi de notifications d'alertes
	public void confirmAlerte(Demandeur confirm);
}
