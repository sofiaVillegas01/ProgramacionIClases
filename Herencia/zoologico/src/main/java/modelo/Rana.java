package modelo;

import javax.swing.*;

public class Rana extends Animal {

    public Rana(String nombre, String tipo, int id) {
        super(nombre, tipo, id);
    }

    @Override
    public void hacerSonido() {
        JOptionPane.showMessageDialog(null,"la ranita dice: ruanakkkk");
    }
}
