package com.objis.cameroun.savelifes.domaine;

/**
 * La classe Donneur contient toutes les propriétés utilisées
 * pour la gestion de l'utilisateur (demandeur) recherchant des donneur de sang
 * @author Ngon Joel
 * @date 21/09/2018
 */
public class Demandeur {

	//Déclaration des variables	
			String nomDemandeur;
			String prenomDemandeur;
			String sexeDemandeur;
			String ageDemandeur;
			String sangDemandeur;
			String bloodDesire;
			String telephoneDemandeur;
			String mailDemandeur;
			String villeDemandeur;
			String hopital;
			String villeHopital;


			/**
			 * Constructeur de la classe Demandeur avec paramètres
			 * @param nomDemandeut
			 * @param prenomDemandeur
			 * @param sexeDemandeur
			 * @param ageDemandeur
			 * @param sangDemandeur
			 * @param bloodDesire
			 * @param telephoneDemandeur
			 * @param mailDemandeur
			 * @param villeDemandeur
			 * @param hopital
			 * @param villeHopital
			 */
			public Demandeur(String nomDemandeut, String prenomDemandeur,
					String sexeDemandeur, String ageDemandeur, String sangDemandeur,
					String bloodDesire, String telephoneDemandeur, String mailDemandeur,
					String villeDemandeur, String hopital, String villeHopital) {
				super();
				this.nomDemandeur = nomDemandeut;
				this.prenomDemandeur = prenomDemandeur;
				this.sexeDemandeur = sexeDemandeur;
				this.ageDemandeur = ageDemandeur;
				this.sangDemandeur = sangDemandeur;
				this.bloodDesire = bloodDesire;
				this.telephoneDemandeur = telephoneDemandeur;
				this.mailDemandeur = mailDemandeur;
				this.villeDemandeur = villeDemandeur;
				this.hopital = hopital;
				this.villeHopital = villeHopital;
			}


			/**
			 * Retourne le nom du demandeur
			 * @return nomDemandeur
			 */
			public String getNomDemandeur() {
				return nomDemandeur;
			}


			/**
			 * Définit le nom du demandeur
			 * @param nomDemandeut
			 */
			public void setNomDemandeur(String nomDemandeut) {
				this.nomDemandeur = nomDemandeut;
			}


			/**
			 * Retourne le prénom du demandeur
			 * @return prenomDemandeur
			 */
			public String getPrenomDemandeur() {
				return prenomDemandeur;
			}


			/**
			 * Définit le prénom du demandeur
			 * @param prenomDemandeur
			 */
			public void setPrenomDemandeur(String prenomDemandeur) {
				this.prenomDemandeur = prenomDemandeur;
			}


			/**
			 * Retourne le sexe du demandeur
			 * @return sexeDemandeur
			 */
			public String getSexeDemandeur() {
				return sexeDemandeur;
			}


			/**
			 * Définit le sexe du demandeur
			 * @param sexeDemandeur
			 */
			public void setSexeDemandeur(String sexeDemandeur) {
				this.sexeDemandeur = sexeDemandeur;
			}


			/**
			 * Retourne l'âge du demandeur
			 * @return ageDemandeur
			 */
			public String getAgeDemandeur() {
				return ageDemandeur;
			}


			/**
			 * Définit l'âge du demandeur
			 * @param ageDemandeur
			 */
			public void setAgeDemandeur(String ageDemandeur) {
				this.ageDemandeur = ageDemandeur;
			}


			/**
			 * Retourne le groupe sanguin du demandeur
			 * @return sangDemandeur
			 */
			public String getSangDemandeur() {
				return sangDemandeur;
			}


			/**
			 * Définit le groupe sanguin du demandeur
			 * @param sangDemandeur
			 */
			public void setSangDemandeur(String sangDemandeur) {
				this.sangDemandeur = sangDemandeur;
			}


			/**
			 * Retourne le groupe sanguin recherché
			 * @return bloodDesire
			 */
			public String getBloodDesire() {
				return bloodDesire;
			}


			/**
			 * Définit le groupe sanguin recherché
			 * @param bloodDesire
			 */
			public void setBloodDesire(String bloodDesire) {
				this.bloodDesire = bloodDesire;
			}


			/**
			 * Retourne le numéro de téléphone du demandeur
			 * @return telephoneDemandeur
			 */
			public String getTelephoneDemandeur() {
				return telephoneDemandeur;
			}


			/**
			 * Définit le numéro de téléphone du demandeur
			 * @param telephoneDemandeur
			 */
			public void setTelephoneDemandeur(String telephoneDemandeur) {
				this.telephoneDemandeur = telephoneDemandeur;
			}

			 
			/**
			 * Retourne l'adresse mail du demandeur
			 * @return mailDemandeur
			 */
			public String getMailDemandeur() {
				return mailDemandeur;
			}


			/**
			 * Définit l'adresse mail du demandeur 
			 * @param mailDemandeur
			 */
			public void setMailDemandeur(String mailDemandeur) {
				this.mailDemandeur = mailDemandeur;
			}


			/**
			 * Retourne la ville de résidence du demandeur
			 * @return villeDemandeur
			 */
			public String getVilleDemandeur() {
				return villeDemandeur;
			}


			/**
			 * Définit la ville de résidence du demandeur
			 * @param villeDemandeur
			 */
			public void setVilleDemandeur(String villeDemandeur) {
				this.villeDemandeur = villeDemandeur;
			}


			/**
			 * Retourne le lieu d'hospitalisation du malade
			 * @return hopital
			 */
			public String getHopital() {
				return hopital;
			}


			/**
			 * Définit le lieu d'hospitalisation du malade
			 * @param hopital
			 */
			public void setHopital(String hopital) {
				this.hopital = hopital;
			}


			/**
			 * Retourne le nom de la ville où se trouve l'hopital
			 * @return
			 */
			public String getVilleHopital() {
				return villeHopital;
			}


			/**
			 * Définit le nom de la ville où se trouve l'hôpital
			 * @param villeHopital
			 */
			public void setVilleHopital(String villeHopital) {
				this.villeHopital = villeHopital;
			}
}
