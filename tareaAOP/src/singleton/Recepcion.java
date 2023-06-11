package singleton;

public class Recepcion {
	public void RegistrarCita(Usuario user) {
		if( user instanceof Extranjero){
			Extranjero extranjero = (Extranjero) user;
			ExtranjeroAdapter extranjeroPaciente = new ExtranjeroAdapter(extranjero);
			Logger.registrarTXT(extranjeroPaciente);
		}
		if(user instanceof Ciudadano) {
			Logger.registrarTXT((Ciudadano) user);
		}
	}

}
