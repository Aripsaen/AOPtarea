package singleton;

public interface Paciente {
	/*El concepto de seguro social puede variar según el país y su sistema de seguridad social.En 
	muchos países, el seguro social es un programa gubernamental que proporciona beneficios y servicios 
	a los ciudadanos y residentes legales. Estos beneficios pueden incluir atención médica, pensiones, subsidios por discapacidad, entre otros.
	*/
	
	boolean seguroSocial();
	void obtenerInformacion();
	void accederHistorialMedico();
}
