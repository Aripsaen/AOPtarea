package singleton;

import java.util.ArrayList;



public class Singleton {
    private static Singleton instance;
    private ArrayList<Usuario> listUsers;
    

    private Singleton() {
        // Constructor privado para evitar instanciaciones directas
        listUsers = new ArrayList<Usuario>();
        Usuario ciudadano1 = new Ciudadano("0953360625", false, "Aripsaen", "aripsaen2233","Ariana","Palacios");
        Usuario ciudadano2 = new Ciudadano("0993647887", true, "Diegofr", "Dieguihno","Diego","Flores");
        Usuario extranjero1 = new Extranjero("A2022457","Kyrgyzstan", "AlexxX", "alex2099", "Alex", "Vizuete");
        Usuario extranjero2 = new Extranjero("A8876392","Colombia","Piero247","22334433","Piero","Pazmino");
        listUsers.add(ciudadano1);
        listUsers.add(ciudadano2);
        listUsers.add(extranjero1);
        listUsers.add(extranjero2);
        
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public ArrayList<Usuario> getlistUsers() {
        return listUsers;
    }
    
    //metodo si se quisiera agregar mas usuarios, creo que esto no esta prohibido
    //ya que no se podria borrar el ArrayList, solo agregar mas cosillas
    
    /*
    public void addObject(Usuario object) {
    	listUsers.add(object);
    }
    */

    
}
