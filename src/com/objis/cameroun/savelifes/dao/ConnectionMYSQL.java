package com.objis.cameroun.savelifes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMYSQL {

	//Informations d'acc�s � la base de donn�es
		public static String url = "jdbc:mysql://localhost/savelifes";
		public static String user = "root";
		public static String motDePasse = "janvier";
		public static Connection connection;
		
		
		/**
		 * M�thode pour la connection
		 * @return
		 */
		public static Connection getInstance() {
			
			try {
				//Connection � la base de donn�es
			connection =  DriverManager.getConnection(url, user, motDePasse);
				
				
			
			}catch(SQLException e) {
				System.err.println("Probl�me de connection");
			}
			return connection;
		}	
}
