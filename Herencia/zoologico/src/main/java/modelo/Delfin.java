package modelo;
import org.w3c.dom.ls.LSOutput;
import  javax.swing.*;
public class Delfin extends Animal {

        public Delfin(String nombre, String tipo, int id) {
            super(nombre, tipo, id);

        }

        @Override
        public void hacerSonido(){
            JOptionPane.showMessageDialog(null,"el delfincito dice: mmmm");
        }
    }