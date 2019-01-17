package com.objis.cameroun.savelifes.domaine;

/**
 * La classe Donneur contient toutes les propriétés utilisées
 * pour la gestion de l'utilisateur donneur de sang
 * @author Ngon Joel
 * @date 21/09/2018
 */
public class Donneur {

	//Déclaration des variables
	String nomDonneur;
	String prenomDonneur;
	String sexeDonneur;
	String ageDonneur;
	String sangDonneur;
	String telephone;
	String adresseMail;
	String villeResidence;
	String motDePasse;
	String login;
	
	public Donneur() {
		super();
	}


	/**
	 * Constructeur de la classe Donneur avec paramètres
	 * @param nomDonneur
	 * @param prenomDonneur
	 * @param sexeDonneur
	 * @param ageDonneur
	 * @param sangDonneur
	 * @param telephone
	 * @param adresseMail
	 * @param villeResidence
	 */
	public Donneur(String nomDonneur, String prenomDonneur, String sexeDonneur,
			String ageDonneur, String sangDonneur, String telephone,
			String adresseMail, String villeResidence, String motDePasse) {
		super();
		this.nomDonneur = nomDonneur;
		this.prenomDonneur = prenomDonneur;
		this.sexeDonneur = sexeDonneur;
		this.ageDonneur = ageDonneur;
		this.sangDonneur = sangDonneur;
		this.telephone = telephone;
		this.adresseMail = adresseMail;
		this.villeResidence = villeResidence;
		this.motDePasse = motDePasse;
	}

	
	/**
	 * Constructeur pour exploitation du motDePasse et du login dans la bd
	 * @param motDePasse
	 * @param login
	 */
	public Donneur(String motDePasse, String login) {
		super();
		this.motDePasse = motDePasse;
		this.login = login;
	}


	/**
	 * Retourne le nom du donneur
	 * @return nomDonneur
	 */
	public String getNomDonneur() {
		return nomDonneur;
	}

	
	/**
	 * Définit le nom du donneur
	 * @param nomDonneur
	 */
	public void setNomDonneur(String nomDonneur) {
		this.nomDonneur = nomDonneur;
	}

	
	/**
	 * Retourne le prénom du donneur
	 * @return prenomDonneur
	 */
	public String getPrenomDonneur() {
		return prenomDonneur;
	}

	
	/**
	 * Définit le prénom du donneur
	 * @param prenomDonneur
	 */
	public void setPrenomDonneur(String prenomDonneur) {
		this.prenomDonneur = prenomDonneur;
	}

	
	/**
	 * Retourne le sexe du donneur
	 * @return sexeDonneur
	 */
	public String getSexeDonneur() {
		return sexeDonneur;
	}

	
	/**
	 * Définit le sexe du donneur
	 * @param sexeDonneur
	 */
	public void setSexeDonneur(String sexeDonneur) {
		this.sexeDonneur = sexeDonneur;
	}

	
	/**
	 * Retourne l'âge du donneur
	 * @return ageDonneur
	 */
	public String getAgeDonneur() {
		return ageDonneur;
	}

	
	/**
	 * Définit l'âge du donneur
	 * @param ageDonneur
	 */
	public void setAgeDonneur(String ageDonneur) {
		this.ageDonneur = ageDonneur;
	}

	
	/**
	 * Retourne le groupe sanguin du donneur
	 * @return
	 */
	public String getSangDonneur() {
		return sangDonneur;
	}

	
	/**
	 * Définit le groupe sanguin du donneur
	 * @param sangDonneur
	 */
	public void setSangDonneur(String sangDonneur) {
		this.sangDonneur = sangDonneur;
	}
	
	
	/**
	 * Retourne le numéro de téléphone du donneur
	 * @return telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	
	/**
	 * Définit le numéro de téléphone du donneur
	 * @param telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	/**
	 * Retourne l'adresse mail du donneur
	 * @return adresseMail
	 */
	public String getAdresseMail() {
		return adresseMail;
	}

	
	/**
	 * Définit l'adresse mail du donneur
	 * @param adresseMail
	 */
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	
	/**
	 * Retourne la ville de résidence du donneur
	 * @return villeResidence
	 */
	public String getVilleResidence() {
		return villeResidence;
	}

	
	/**
	 * Définit la la ville de résidence du donneur
	 * @param villeResidence
	 */
	public void setVilleResidence(String villeResidence) {
		this.villeResidence = villeResidence;
}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}
	
	
	
}
