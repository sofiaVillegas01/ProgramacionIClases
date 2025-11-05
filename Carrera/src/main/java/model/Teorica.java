package model;
import java.util.List;
public class Teorica extends Materia{
    public Teorica(String codigo, String nombre, int numerodehoraSemana, int cantidadCreditos, byte semestres) {
        super(codigo, nombre, numerodehoraSemana, cantidadCreditos, semestres);
        if(codigo==null ||codigo.isEmpty() ||nombre==null ||nombre.isEmpty()){
            throw new IllegalArgumentException("Datos invalidos,sea correct@");
        }
    }
}
