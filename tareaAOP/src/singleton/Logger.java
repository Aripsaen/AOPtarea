package singleton;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Logger {
	public static void registrarTXT(Paciente c) {
		
			try(BufferedWriter bf = new BufferedWriter(new FileWriter("RegistroClientes.txt")) ) {
				bf.write(c.toString());
			}catch(IOException e) {
				e.printStackTrace();
			}
	}

}
