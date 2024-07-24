package Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import Metier.Destination;
import Metier.Transport;


public class App{

	// Permet de gérer les végicule et de séparer toutes la logique
	public GestionVehicule gestionVehicule;
	// Permet de gérer les destination et de séparer toutes la logique
	public GestionDestination gestionDestination;
	
	// a l'initialisation de l'app les 2 objet de gestion (vehicule et destination) sont directement exploitable.
	public App() {
		this.gestionVehicule = new GestionVehicule(); 
		this.gestionDestination = new GestionDestination(); 
	}
	
	
	public void execution() {
		boolean continuer = true;
		do {
			continuer = action(continuer);
		}
		while(continuer);
	}
	
	// gére la maniére de faire un choix dans le menu
	public static int choix() {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		int choix = 0;
        try {
			choix = Integer.parseInt(bufferRead.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return choix;
	}
	
	public boolean action(boolean sortir) {
		Menu();
		int choix = choix();
		switch(choix) {
			case 1:
				System.out.println("Gérer mes Transports");
				this.gestionVehicule.execution();
				break;
			case 2:
				System.out.println("Supprimer une voiture à la concession");
				this.gestionDestination.execution();
				break;
			case 3: 
				System.out.println("Lister les vahicules");
				this.listerVehicule();
				break;
			case 4:
				System.out.println("Sortir de la boucle");
				sortir = SortirProgram(sortir);
				break;
			case 5:
				System.out.println("Mise a disposition d'un véhicule pour une destination");
				miseDispo();
				break;
			
				
		}
		return sortir;
	}
	
	public static boolean SortirProgram(boolean sortir) {
		sortir = false;
		return sortir;
	}
	
	public void Menu() {
		System.out.println("1 - Gestion des vehicules");
		System.out.println("2 - Gestion des destinations");
		System.out.println("3 - Lister les véhicules");
		System.out.println("4 - Sortir");
	}
	
	// méthode satic car elle ne modifie l'instance en cours. et permet d'êtreappelé autre part sans instance de app
	// gérer les interactions avec l'utilisateur
	public static String demanderInfo() {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		String info = "";
		try {
			info = bufferRead.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return info;
	}
	
	public void listerVehicule() {
		for(int i =0; i<this.gestionVehicule.transports.size(); i++) {
			System.out.println(i + " - " + this.gestionVehicule.transports.get(i));
		}
	}
	
	// mise a dispo d'un véhicule. lister les destinations puis en selectionne une et enfin intéger le transport a la destination
	public void miseDispo() {
		for(int i =0; i<this.gestionDestination.destinations.size(); i++) {
			System.out.println(i+ " - " + this.gestionDestination.destinations.get(i));
		}
		String d = App.demanderInfo();
		Destination dest = this.gestionDestination.destinations.get(Integer.parseInt(d));
		for(int i =0; i<this.gestionVehicule.transports.size(); i++) {
			System.out.println(i+ " - " + this.gestionVehicule.transports.get(i));
		}
		String t = App.demanderInfo();
		Transport transport = this.gestionVehicule.transports.get(Integer.parseInt(t));
		dest.setTransport(transport);
		
	}
}
