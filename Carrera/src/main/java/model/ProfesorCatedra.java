package model;

public class ProfesorCatedra extends Profesor {
 private int numeroHorasContratadas;
private boolean TrabajanEmpresaExterna;

    public ProfesorCatedra(String identificador, String nombre, String tituloAcademico, int aniosExperencia, int numeroHorasContratadas, boolean trabajanEmpresaExterna) {
        super(identificador, nombre, tituloAcademico, aniosExperencia);
        if(identificador==null ||identificador.isEmpty() ||nombre==null ||nombre.isEmpty()||tituloAcademico==null || tituloAcademico.isEmpty()){
            throw new IllegalArgumentException("Datos invalidos,info mal");
        }
        this.numeroHorasContratadas = numeroHorasContratadas;
        TrabajanEmpresaExterna = trabajanEmpresaExterna;
    }

    public int getNumeroHorasContratadas() {
        return numeroHorasContratadas;
    }

    public void setNumeroHorasContratadas(int numeroHorasContratadas) {
        this.numeroHorasContratadas = numeroHorasContratadas;
    }

    public boolean isTrabajanEmpresaExterna() {
        return TrabajanEmpresaExterna;
    }

    public void setTrabajanEmpresaExterna(boolean trabajanEmpresaExterna) {
        TrabajanEmpresaExterna = trabajanEmpresaExterna;
    }

    @Override
    public String toString() {
        return "ProfesorCatedra{" +
                "numeroHorasContratadas=" + numeroHorasContratadas +
                ", TrabajanEmpresaExterna=" + TrabajanEmpresaExterna +
                ", identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tituloAcademico='" + tituloAcademico + '\'' +
                ", aniosExperencia=" + aniosExperencia +
                '}';
    }
}