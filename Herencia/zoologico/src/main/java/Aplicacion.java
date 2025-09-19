import modelo.*;

import javax.swing.*;

public class Aplicacion {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico("uq", "armenia", "456677");

        Gato gato1 = new Gato("lupe", "freishpudder", 7);
        Perro perro1 = new Perro("opoi", "koker", 6);
        Loro loro1 = new Loro("pepe", "cacatuas", 3);
        Rana rana1 = new Rana("opo", "venenosa", 4);
        Delfin delfin1 = new Delfin("nemo", "amazonico", 2);

        System.out.println(zoo.registrarAnimal(gato1));
        System.out.println(zoo.registrarAnimal(perro1));
        System.out.println(zoo.registrarAnimal(loro1));
        System.out.println(zoo.registrarAnimal(rana1));
        System.out.println(zoo.registrarAnimal(gato1)); // prueba duplicado
        System.out.println(zoo.registrarAnimal(delfin1));

        System.out.println("\nAnimales haciendo sonidos:");
        zoo.hacerSonidoTodos();

        System.out.println("\nEliminando un animal...");
        System.out.println(zoo.eliminarAnimal(gato1));

        System.out.println("\nAnimales después de eliminar:");
        zoo.hacerSonidoTodos();
    }
}

