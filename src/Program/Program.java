package Program;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import Metier.Bus;
import Metier.Peniche;
import Metier.Transport;
import Metier.Van;

public class Program {

		/*
		Bus bus = new Bus(12345, 20);
		Van van = new Van(12346, 5);
		Peniche peniche = new Peniche(4321, 6, true);
		
		List<Transport> lesTransports = new ArrayList<Transport>();
		
		lesTransports.add(peniche);
		lesTransports.add(van);
		lesTransports.add(bus);
		
		lesTransports.add(new Bus(1234, 25));
		/*
		lesTransports.remove(2);
		lesTransports.remove(peniche);
		
		for(Transport transport : lesTransports) {
			System.out.println(transport);
		}
		*/
		/*
		App app = new App();
		app.execution();
		*/
		
		// TODO Auto-generated method stub
		
		/*
		String BDD = "mysql";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url+"?characterEncoding=UTF8", user, passwd);
			System.out.println("Connecter");
			System.out.println(url);

			} catch (Exception e){
			e.printStackTrace();
			System.out.println("Erreur");
			System.exit(0);
		}
		*/
		static Connection conn;
		static Statement state;
		static ResultSet result;
		static ResultSetMetaData resultMeta;
		static Object[][] donn;
		static String[] champs;
		static Object[] val;
		static String tableBDD = "transports";
		
	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	   
            public void run() {
                // Votre fonction Run
                // Vos information de connexion à une base de données
                String BDD = "transports";
                String url = "jdbc:mysql://localhost:3306/" + BDD;
                String user = "root";
                String passwd = "";
                // L'essaie de connexion à votre base de donées
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(url+"?characterEncoding=UTF8", user, passwd);
                    System.out.println("Connecter");
                    
                    // Déclaration de la connexion avec la base de donnée
                    Statement state = conn.createStatement();
                    //L'objet ResultSet contient le résultat de la requête SQL
                    ResultSet result = state.executeQuery("SELECT * FROM transports");
                    //On récupère les MetaData
                    ResultSetMetaData resultMeta = result.getMetaData();

                    // Affiche d'un séparateur visuel (oui, c'est pas très propre, mais libre à vous de le modifié)
                    System.out.println("\n*************************************************************");
                    
                    // On affiche le nom des colonnes
                    for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                        System.out.print("  " + resultMeta.getColumnName(i).toUpperCase() + " ");
                    
                    // Un nouveau séparateur visuel
                    System.out.println("\n*************************************************************");

                    // On affiche les données ligne par ligne
                    while(result.next()){
                        for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                            System.out.print("      " + result.getObject(i).toString() + "      ");
                        System.out.println("\n-------------------------------------------------------------");
                    }

                    // On ferme tout les connexion à la base de données
                    result.close();
                    state.close();
                } catch (Exception e){
                    e.printStackTrace();
                    System.out.println("Erreur");
                    System.exit(0);
                }
                
            }});
	}

}
