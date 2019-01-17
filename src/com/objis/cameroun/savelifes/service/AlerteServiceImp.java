package com.objis.cameroun.savelifes.service;

import com.objis.cameroun.savelifes.domaine.Demandeur;

/**

 * La classe AlerteServiceImp contient toutes les méthodes liées 
 * à l'envoi des alertes aux donneurs
 * @author Ngon Joel 
 * @date 21/09/2018
 */
public class AlerteServiceImp implements IAlerteService{


	/**
	 * Cette méthode traite les informations à envoyer 
	 * aux eventuels donneurs
	 * @param client
	 */
	public void affichAlerte(Demandeur client){
		System.out.println(" \n" +
				"Une Alerte va être envoyée à des donneurs de groupe sanguin " + client.getBloodDesire() + " \n" +
				"Le patient ayant besoin de donneurs se trouve interné à l'hôpital " + client.getHopital() + " \n" +
				"Ledit hôpital se trouve dans la ville de " + client.getVilleHopital() + " \n" +
				" \n" +
				"Veuillez vérifier ces informations et choisir une action  \n" +
				"R = Rectifier       A = Annuler Et Sortir       S = Suivant"); 
	}
	
	/**
	 * Cette méthode permet la confirmation de l'envoi de notifications d'alertes 
	 * @param confirm
	 */
	public void confirmAlerte(Demandeur confirm){
		System.out.println("Une alerte a été envoyée à de différents donneurs  de groupes sanguin " + confirm.getBloodDesire() + " présents à " + confirm.getVilleHopital() + " et ses environs \n" +
				"AUREVOIR  \n" +
				"===ONE REGISTER - ONE LIFE SAVE===");
	}
}
