package Metier;

public class Marin extends Transport{
	private String libelle;
	
	public Marin (int ref, int nb) {
		super(ref, nb, 2);
		this.libelle = "Marin";
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
