package singleton;

import java.util.Scanner;

public class Recepcion {
	public static Usuario tomarDatos() {
		Usuario u;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String name = sc.nextLine();
		System.out.println("Ingrese su apellido: ");
		String lastName = sc.nextLine();
		System.out.println("Ingrese su país de origen: ");
		String pais = sc.nextLine();
		if(pais.equals("Ecuador")) {
			System.out.println("Ingrese su cédula:  ");
			String cedula = sc.nextLine();
			System.out.println("Tiene seguro social? (S/N) ");
			String resp = sc.nextLine();
			boolean ss;
			if(resp.equals("S ")) {
				ss = true;
			}else {
				ss = false;
			}
			u = new Ciudadano(cedula, ss, name, lastName);
		}else {
			System.out.println("Número de pasaporte:  ");
			String passport = sc.nextLine();
			u = new Extranjero(passport, pais, name, lastName);
		}
		
		return u;
	}
	
	public static void registrarPaciente(Usuario u) {
		Singleton singleton = Singleton.getInstance();
		if(u instanceof Extranjero) {
			Extranjero ex = (Extranjero) u;
			singleton.addObject(new ExtranjeroAdapter(ex));
		}else {
			Ciudadano cd = (Ciudadano) u;
			singleton.addObject(cd);
		}	
	}
	
	public static void agendarCita(Paciente p) {
		
	}
	
}
