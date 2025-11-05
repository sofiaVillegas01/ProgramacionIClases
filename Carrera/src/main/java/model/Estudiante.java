package model;

import java.util.List;
import java.util.Scanner;

public abstract class Estudiante {

    protected String identificador;
    protected String nombre;
    protected String documentoidentidad;
    protected String ProgramaAcademico;
    protected int semestreActual;
    protected List<Materia>listaMaterias;

    public Estudiante(String identificador, String nombre, String documentoidentidad, String programaAcademico, int semestreActual) {
        if(identificador==null||identificador.isEmpty()||nombre==null ||nombre.isEmpty()||documentoidentidad==null || documentoidentidad.isEmpty()||programaAcademico==null || programaAcademico.isEmpty()||semestreActual==0){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,GROSERO");
        }
        this.identificador=identificador;
        this.nombre = nombre;
        this.documentoidentidad = documentoidentidad;
        ProgramaAcademico = programaAcademico;
        this.semestreActual = semestreActual;
        this.listaMaterias = listaMaterias;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoidentidad() {
        return documentoidentidad;
    }

    public void setDocumentoidentidad(String documentoidentidad) {
        this.documentoidentidad = documentoidentidad;
    }

    public String getProgramaAcademico() {
        return ProgramaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        ProgramaAcademico = programaAcademico;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }


    public static String ingresarTexto(String mensaje){
        Scanner scanner = new Scanner (System.in);
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner (System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }


}