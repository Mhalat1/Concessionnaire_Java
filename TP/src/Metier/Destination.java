package Metier;

import java.util.ArrayList;
import java.util.List;

public class Destination {
	private int ref;
	private int type;
	private List<String> arrets;
	private Transport transport;
	
	public Destination() {
		
	}
	
	public Destination(int ref, int type, Transport transport) {
		this.ref = ref;
		this.type = type;
		this.transport = transport;
		this.arrets = new ArrayList<String>();
	}
	
	public Destination(int ref, int type) {
		this.ref = ref;
		this.type = type;
		this.arrets = new ArrayList<String>();
	}
	
	public Transport getTransport() {
		return transport;
	}
	
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	
	public List<String> getArrets() {
		return arrets;
	}
	
	public void setArrets(List<String> arrets) {
		this.arrets = arrets;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getRef() {
		return ref;
	}
	
	public void setRef(int ref) {
		this.ref = ref;
	}
	
	
	
}
