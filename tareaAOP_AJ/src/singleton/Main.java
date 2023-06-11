package singleton;

//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getlistUsers());   
        
        Recepcion.tomarDatos();
        System.out.println(singleton1.getlistUsers());
    }
}
