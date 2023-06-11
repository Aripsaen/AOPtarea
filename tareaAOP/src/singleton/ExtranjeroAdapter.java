package singleton;

//Realizar un adaptador para que un extranjero pueda ser tratado como un paciente en un 
//seguro social
// se aprobaran todas las credenciales para que el extranjero pueda revisar atencion medica
public class ExtranjeroAdapter implements Paciente {
	
	private Extranjero extranjero;
	public ExtranjeroAdapter(Extranjero e){
		extranjero = e;
	}
	
	@Override
	public boolean seguroSocial() {
		return true;
	}
	
	@Override
	public void obtenerInformacion() {
		
		// StringBuilder de la informacion del extranjero
		// StringBuilder se construye
		// con un toString
	}
	@Override
	public void accederHistorialMedico(){
		
	}
}
