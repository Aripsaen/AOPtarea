package singleton;

public class Ciudadano extends Usuario {
	String cedulaEc;
	Boolean seguroSocial;
	
	public Ciudadano(String cedulaEc, Boolean seguroSocial, String user, String pass, String name,String lastName) {
		super(user, pass, name, lastName);
		this.cedulaEc = cedulaEc;
		this.seguroSocial = seguroSocial;
		
	}
	
	public void atencionMedica() {
		
	}

}
