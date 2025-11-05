package model;

public class Posgrado extends  Estudiante {
    protected String temaInvestigacion;
    protected TipoCurso tipoCurso;

    public Posgrado(String identificador, String nombre, String documentoidentidad, String programaAcademico, int semestreActual, String temaInvestigacion, TipoCurso tipoCurso) {
        super(identificador, nombre, documentoidentidad, programaAcademico, semestreActual);
        this.temaInvestigacion = temaInvestigacion;
        this.tipoCurso = tipoCurso;
    }

    public String getTemaInvestigacion() {
        return temaInvestigacion;
    }

    public void setTemaInvestigacion(String temaInvestigacion) {
        this.temaInvestigacion = temaInvestigacion;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
}