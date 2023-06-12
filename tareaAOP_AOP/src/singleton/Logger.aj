package singleton;

public aspect Logger {
	public pointcut toRegister() : execution(Usuario Recepcion.tomarDatos());
	
	after() returning(Usuario user) : toRegister() {
		Recepcion.registrarPaciente(user);
	}
}
