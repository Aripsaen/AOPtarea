package singleton;

public class Ciudadano extends Usuario implements Paciente{
	String cedulaEc;
	Boolean seguroSocial;
	
	public Ciudadano(String cedulaEc, Boolean seguroSocial, String name,String lastName) {
		super(name, lastName);
		this.cedulaEc = cedulaEc;
		this.seguroSocial = seguroSocial;
		
	}
	
	public void atencionMedica() {
		
	}

	  @Override

	    public boolean seguroSocial() {

	        return seguroSocial;

	    }

	    @Override

	    public void obtenerInformacion() {

	        // StringBuilder se construye

	        // con un toString

	    }

	    @Override

	    public void accederHistorialMedico(){

	    }

}
