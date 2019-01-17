package com.objis.cameroun.savelifes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMYSQL {

	//Informations d'accès à la base de données
		public static String url = "jdbc:mysql://localhost/savelifes";
		public static String user = "root";
		public static String motDePasse = "janvier";
		public static Connection connection;
		
		
		/**
		 * Méthode pour la connection
		 * @return
		 */
		public static Connection getInstance() {
			
			try {
				//Connection à la base de données
			connection =  DriverManager.getConnection(url, user, motDePasse);
				
				
			
			}catch(SQLException e) {
				System.err.println("Problême de connection");
			}
			return connection;
		}	
}
