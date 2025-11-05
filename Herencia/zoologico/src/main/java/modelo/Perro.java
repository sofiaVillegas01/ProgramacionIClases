package modelo;

import javax.swing.*;

public class Perro extends Animal {

    public Perro(String nombre, String tipo, int id) {
        super(nombre, tipo, id);
    }

    @Override
    public void hacerSonido() {
        JOptionPane.showMessageDialog(null,"el perrito dice: guau");
    }
}

