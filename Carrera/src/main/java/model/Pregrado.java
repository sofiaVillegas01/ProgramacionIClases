package model;
import java.util.List;

public class Pregrado extends Estudiante{

    protected boolean beca;
    protected double promedioAcumulado;

    public Pregrado(String identificador, String nombre, String documentoidentidad, String programaAcademico, int semestreActual, boolean beca, double promedioAcumulado) {
        super(identificador, nombre, documentoidentidad, programaAcademico, semestreActual);
        this.beca = beca;
        this.promedioAcumulado = promedioAcumulado;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }
}