package singleton;

public class Extranjero extends Usuario {
	String pasaporte;
	String paisOrigen;
	
	public Extranjero(String pasaporte,String paisOrigen, String name, String lastName) {
		super(name, lastName);
		this.pasaporte = pasaporte;
		this.paisOrigen = paisOrigen;
	}
	
	public void visitar() {
		
	}
	

}
