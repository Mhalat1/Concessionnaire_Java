package Program;

import java.util.ArrayList;
import java.util.List;

import Metier.Bus;
import Metier.Peniche;
import Metier.Transport;
import Metier.Van;

 public class GestionVehicule{	
	 
	 public List<Transport> transports;
	public GestionVehicule() {
		this.transports = new ArrayList<Transport>();
	}
	
	 // menu de la gestion des vehicules
	public static void creerTransport(){
		System.out.println("1 - Créer un BUS");
		System.out.println("2 - Créer un VAN");
		System.out.println("3 - Créer une PENICHE");
		
		System.out.println("4 - Supprimer un transport");

		System.out.println("7 - Sortir");
	}
	
	// création de la peniche avec l'utilisation de la méthode demander info de app
	public Peniche creerPeniche() {
		String ref = App.demanderInfo();
		String nb = App.demanderInfo();
		System.out.println("est ce qu'il est possible de manger sur la peniche ? oui ou non");
		String manger = App.demanderInfo();
		boolean estManger = (manger.equals(manger)) ? true : false;
		return new Peniche(Integer.parseInt(ref), Integer.parseInt(nb), estManger);
	}
	
	public Bus ajouterBus() {
		System.out.println("ajouter Bus");
		String ref = App.demanderInfo();
		String nb = App.demanderInfo();
		String lon = App.demanderInfo();
		String haut = App.demanderInfo();
		return new Bus(Integer.parseInt(ref), 
				Integer.parseInt(nb), 
				Integer.parseInt(lon), 
				Integer.parseInt(haut)
				);
	}
	
	public Van ajouterVan() {
		System.out.println("Ajouter Van");
		String ref = App.demanderInfo();
		String nb = App.demanderInfo();
		
		return new Van(Integer.parseInt(ref), 
				Integer.parseInt(nb)
				);
	}
	
	public void execution() {
		boolean continuer = true;
		do {
			continuer = action(continuer);
		}
		while(continuer);
	}
	
	public void supprimer() {
		System.out.println("Supprimer Bus");
		for(int i =0; i<this.transports.size(); i++) {
			System.out.println(i + " - " + this.transports.get(i));
		}
		String demande = App.demanderInfo();
		this.transports.remove(this.transports.get(Integer.parseInt(demande)));
	}
	
	public static void supprimerVan() {
		System.out.println("Supprimer Van");
	}

	public static void supprimerPeniche() {
		System.out.println("Supprimer Peniche");
	}
	
	public boolean action(boolean sortir) {
		creerTransport();
		int choix = App.choix();
		switch(choix) {
			case 1:
				this.transports.add(ajouterBus());
				break;
			case 2:
				this.transports.add(ajouterVan());
				break;
			case 3:
				this.transports.add(creerPeniche());
				break;
			case 4:
				supprimer();
				break;
			case 7:
				System.out.println("Sortir de la boucle");
				sortir = SortirProgram(sortir);
				break;
		}
		return sortir;
	}
	
	public static boolean SortirProgram(boolean sortir) {
		sortir = false;
		return sortir;
	}
}
