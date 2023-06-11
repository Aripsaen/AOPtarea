package singleton;

//mi idea era hacer un adaptador de 
public class ExtranjeroAdapter implements Paciente{
	private Extranjero extranjero;
	
	public ExtranjeroAdapter(Extranjero extranjero) {
		this.extranjero = extranjero;
	}

    @Override

    public boolean seguroSocial() {

        return true;

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
