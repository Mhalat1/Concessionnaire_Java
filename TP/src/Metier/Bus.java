package Metier;

public class Bus extends Terrestre{
	private int longueur;
	private int hauteur;
	
	public Bus(int ref, int nb) {
		super(ref, nb);
		this.longueur = 1500;
		this.hauteur = 300;
	}
	
	public Bus(int ref, int nb, int longueur, int hauteur) {
		super(ref, nb);
		this.longueur = longueur;
		this.hauteur = hauteur;
	}
	
	@Override public String toString() {
		return super.toString() + " et de longueur " + this.longueur + " et d'hauteur " + this.hauteur;
	}
}
