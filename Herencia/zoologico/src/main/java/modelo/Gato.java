package modelo;

import org.w3c.dom.ls.LSOutput;
import javax.swing.*;

public class Gato extends Animal {
    public Gato(String nombre, String tipo, int id){
        super(nombre,tipo,id);
    }
    //poli

    @Override
    public void hacerSonido() {
        JOptionPane.showMessageDialog(null,"el gatito dice: miau");
    }
}



