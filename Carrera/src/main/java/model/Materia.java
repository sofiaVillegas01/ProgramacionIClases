package model;


import java.util.List;
import java.util.Scanner;

public abstract class Materia{
    protected String Codigo;
        protected String Nombre;
        protected int NumerodehoraSemana;
        protected int CantidadCreditos;
        protected byte Semestres;
        protected Profesor profesor;
        private List<Estudiante>listaEstudiantes;


    public Materia(String codigo, String nombre, int numerodehoraSemana, int cantidadCreditos, byte semestres) {
        if(codigo==null||codigo.isBlank()||nombre==null ||nombre.isEmpty()){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,tienes gafas? lea otra vez");
        }
        this.Codigo=codigo;
        this.Nombre = nombre;
        this.NumerodehoraSemana = numerodehoraSemana;
        this.CantidadCreditos = cantidadCreditos;
        this.Semestres = semestres;
        this.profesor = profesor;
        this.listaEstudiantes = listaEstudiantes;
    }


    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNumerodehoraSemana() {
        return NumerodehoraSemana;
    }

    public void setNumerodehoraSemana(int numerodehoraSemana) {
        NumerodehoraSemana = numerodehoraSemana;
    }

    public int getCantidadCreditos() {
        return CantidadCreditos;
    }

    public void setCantidadCreditos(int cantidadCreditos) {
        CantidadCreditos = cantidadCreditos;
    }

    public byte getSemestres() {
        return Semestres;
    }

    public void setSemestres(byte semestres) {
        Semestres = semestres;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    public static byte ingresarByte(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextByte();
    }
}

