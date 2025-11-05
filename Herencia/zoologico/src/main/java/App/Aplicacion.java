package App;

import modelo.*;
import javax.swing.*;

public class Aplicacion {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico("uq", "armenia", "4560977");

        Gato gato1 = new Gato("lupe", "freishpudder", 7);
        Perro perro1 = new Perro("opoi", "koker", 6);
        Loro loro1 = new Loro("pepe", "cacatuas", 3);
        Rana rana1 = new Rana("opo", "venenosa", 4);
        Delfin delfin1 = new Delfin("nemo", "amazonico", 2);

        JOptionPane.showMessageDialog(null, zoo.registrarAnimal(gato1));
        JOptionPane.showMessageDialog(null, zoo.registrarAnimal(perro1));
        JOptionPane.showMessageDialog(null, zoo.registrarAnimal(loro1));
        JOptionPane.showMessageDialog(null, zoo.registrarAnimal(rana1));
        JOptionPane.showMessageDialog(null, zoo.registrarAnimal(gato1)); // prueba duplicado
        JOptionPane.showMessageDialog(null, zoo.registrarAnimal(delfin1));

        JOptionPane.showMessageDialog(null, "Animales haciendo sonidos:");
        zoo.hacerSonidoTodos();

        JOptionPane.showMessageDialog(null, "Eliminando un animal...");
        JOptionPane.showMessageDialog(null, zoo.eliminarAnimal(gato1));

        JOptionPane.showMessageDialog(null, "Animales después de eliminar:");
        zoo.hacerSonidoTodos();
    }
}
