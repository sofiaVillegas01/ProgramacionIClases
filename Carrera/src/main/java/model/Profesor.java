package model;
public abstract class Profesor {

    protected String identificador;
    protected String nombre;
    protected String tituloAcademico;
    protected int aniosExperencia;

    public Profesor(String identificador, String nombre, String tituloAcademico, int aniosExperencia) {
        if(identificador==null ||identificador.isEmpty() || nombre==null ||nombre.isEmpty()||tituloAcademico==null || tituloAcademico.isEmpty()){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,GROSERO");
        }
        this.identificador = identificador;
        this.nombre = nombre;
        this.tituloAcademico = tituloAcademico;
        this.aniosExperencia = aniosExperencia;
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

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public int getAniosExperencia() {
        return aniosExperencia;
    }

    public void setAniosExperencia(int aniosExperencia) {
        this.aniosExperencia = aniosExperencia;
    }
}