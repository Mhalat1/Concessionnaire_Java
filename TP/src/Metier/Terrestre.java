package Metier;

public class Terrestre extends Transport{
	private String libelle;
	
	public Terrestre(int ref, int nb) {
		//Tring b = "";
		super(ref, nb, 1);
		this.setLibelle("Terrestre");
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@Override public String toString() {
		return super.toString() + " est de type " + this.libelle;
	}
}
