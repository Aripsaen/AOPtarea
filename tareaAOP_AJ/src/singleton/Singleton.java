package singleton;

import java.util.ArrayList;



public class Singleton {
    private static Singleton instance;
    private ArrayList<Paciente> listUsers;
    

    private Singleton() {
        // Constructor privado para evitar instanciaciones directas
        listUsers = new ArrayList<Paciente>();
        Paciente ciudadano1 = new Ciudadano("0953360625", false,"Ariana","Palacios");
        Paciente ciudadano2 = new Ciudadano("0993647887", true, "Diego","Flores");
        
        listUsers.add(ciudadano1);
        listUsers.add(ciudadano2);
        
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            
        }
        return instance;
    }

    public ArrayList<Paciente> getlistUsers() {
        return listUsers;
    }
    
    //metodo si se quisiera agregar mas usuarios, creo que esto no esta prohibido
    //ya que no se podria borrar el ArrayList, solo agregar mas cosillas
    
    
    public void addObject(Paciente paciente) {
    	listUsers.add(paciente);
    }
    

    
}
