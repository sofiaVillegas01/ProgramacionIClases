package model;

public class ProfesorPlanta extends Profesor {
    private boolean participanProyectos=false;
    private TipoContrato tipoContrato;

    public ProfesorPlanta(String identificador, String nombre, String tituloAcademico, int aniosExperencia, boolean participanProyectos, TipoContrato tipoContrato) {
        super(identificador, nombre, tituloAcademico, aniosExperencia);
        if(identificador==null ||identificador.isEmpty() || nombre==null ||nombre.isEmpty()||tituloAcademico==null || tituloAcademico.isEmpty()){
            throw new IllegalArgumentException("Datos invalidos,sea correct@,ponga la informacion bien");
        }
        this.participanProyectos = participanProyectos;
        this.tipoContrato = tipoContrato;
    }

    public boolean isParticipanProyectos() {
        return participanProyectos;
    }

    public void setParticipanProyectos(boolean participanProyectos) {
        this.participanProyectos = participanProyectos;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
