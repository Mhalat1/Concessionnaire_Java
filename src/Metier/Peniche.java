package Metier;

public class Peniche extends Marin {
	// est ce qu'on manger dessus
	boolean estManger;
	
	public Peniche(int ref, int nb, boolean estManger) {
		//Tring b = "";
		super(ref, nb);
		this.estManger = estManger;
	}
	
	@Override public String toString() {
		return super.toString() + (this.estManger ? " les passagers peuvent manger dessus " 
				: " les passagers ne peuvent pas manger dessus");
	}
}
