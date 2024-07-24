package Program;

import java.util.ArrayList;
import java.util.List;

import Metier.Bus;
import Metier.Destination;
import Metier.Transport;

public class GestionDestination {
	
	// mes destinations
	public List<Destination> destinations;
	
	// init de ma liste de destination
	public GestionDestination() {
		this.destinations = new ArrayList<Destination>();
	}
	
	// menu dema gestion de destination
	public static void creerTransport(){
		System.out.println("1 - Lister les destination");
		System.out.println("2 - Ajouter une destination ");
		System.out.println("3 - Ajouter un arret ");
		System.out.println("4 - Mise a disposition d'un véhicule");

		System.out.println("7 - Sortir");
	}
	
	// Lister mes destinations
	public void listerDest() {
		for(int i =0; i<this.destinations.size(); i++) {
			System.out.println(i + " - " + this.destinations.get(i));
		}
	}
	
	public Destination ajouterDest() {
		System.out.println("Ajouter une destination");
		String ref = App.demanderInfo();
		String type = App.demanderInfo();
		System.out.println("1 - terrestre");
		System.out.println("2 - Marin");
		return new Destination(Integer.parseInt(ref), 
				Integer.parseInt(type)
				);
	}
	
	// méthode que l'on pourrait sortir et intégrer a une classe static
	public void execution() {
		boolean continuer = true;
		do {
			continuer = action(continuer);
		}
		while(continuer);
	}
	
	// ajouter arret 
	// selectionne la destination puis j ajoute un arret dans sa liste
	public void ajouterArret() {
		for(int i =0; i<this.destinations.size(); i++) {
			System.out.println(i+ " - " + this.destinations.get(i));
		}
		String demande = App.demanderInfo();
		Destination dest = this.destinations.get(Integer.parseInt(demande));
		String arret = App.demanderInfo();
		dest.getArrets().add(arret);
	}
	
	
	public boolean action(boolean sortir) {
		creerTransport();
		int choix = App.choix();
		switch(choix) {
			case 1:
				this.destinations.add(ajouterDest());
				break;
			case 2:
				ajouterArret();
				break;
			case 3:
				listerDest();
				break;
			case 4:
				break;
			case 7:
				System.out.println("Sortir de la boucle");
				sortir = SortirProgram(sortir);
				break;
		}
		return sortir;
	}
	
	// méthode que l'on pourrait faire sortir et intégrer à une classe static
	public static boolean SortirProgram(boolean sortir) {
		sortir = false;
		return sortir;
	}
}
