package modelo;
import  javax.swing.*;
import org.w3c.dom.ls.LSOutput;
public class Loro extends Animal {
    public Loro(String nombre, String tipo, int id) {
        super(nombre,tipo,id);

    }

    @Override
    public void hacerSonido(){
        System.out.println("el lorito dice: quiere almendras");
    }
}
