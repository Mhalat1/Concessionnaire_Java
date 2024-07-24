package Metier;

public abstract class Transport {
	private int ref;
	private int nbPassager;
	private int type;
	
	public Transport(int type) {
		this.type = type;
	}
	
	public Transport(int ref, int nb, int type) {
		this.type = type;
		this.ref = ref;
		this.nbPassager = nb;
	}
	
	public Transport(int ref, int nb) {
		this.ref = ref;
		this.nbPassager = nb;
	}
	
	@Override public String toString() {
		return "Transport " + this.ref + " acceptant " + this.nbPassager;
	}
}
