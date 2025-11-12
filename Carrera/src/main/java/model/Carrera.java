package model;

import java.util.ArrayList;
import java.util.List;

public record Carrera(String nombre, ArrayList<Estudiante> listaEstudiantes, ArrayList<Materia> listaMaterias, ArrayList<Profesor> listaProfesores){

    public Carrera(String nombre){
        this(nombre,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
    }

    public void registrarMateriaTeorica(String codigo, String nombre, int numerodehoraSemana, int cantidadCreditos, byte semestres) {
        Materia materia = new Teorica(  codigo, nombre,numerodehoraSemana, (byte)cantidadCreditos, semestres);
        listaMaterias.add(materia);
    }
    public void registrarPractica(String codigo, String nombre, int numerodehoraSemana, int horasPractica,int cantidadCreditos, int semestre, int numeroLaboratorios) {
        Practica materia = new Practica(codigo, nombre, numerodehoraSemana, horasPractica,(byte)cantidadCreditos, semestre, numeroLaboratorios);
        listaMaterias.add(materia);
    }
    public void registrarProfesorPlanta(String identificador, String nombre, String tituloAcademico,int aniosExperencia, boolean participaproyectos,TipoContrato tipoContrato) {
        ProfesorPlanta profesor = new ProfesorPlanta(identificador, nombre, tituloAcademico, aniosExperencia,participaproyectos,tipoContrato);
        listaProfesores.add(profesor);
    }
    public void registrarProfesorCatedra(String id, String nombre, String titulo, int experiencia, int horasContratadas, boolean trabajaEmpresa) {
        ProfesorCatedra profesor = new ProfesorCatedra(id, nombre, titulo, experiencia, horasContratadas, trabajaEmpresa);
        listaProfesores.add(profesor);
    }
    public void registrarEstudiantePregrado(String identificador, String nombre, String documento, String programa, int semestre, boolean tieneBeca, double promedio) {
        Pregrado estudiante = new Pregrado(identificador, nombre, documento, programa, semestre, tieneBeca, promedio);
        listaEstudiantes.add(estudiante);
    }
    public void registrarEstudiantePosgrado(String identificador, String nombre, String documentoidentidad, String programaAcademico, int semestreActual,String temaInvestigacion,TipoCurso tipoCurso) {
        Posgrado estudiante = new Posgrado(identificador, nombre, documentoidentidad, programaAcademico, semestreActual, temaInvestigacion,tipoCurso);
        listaEstudiantes.add(estudiante);
    }
    public List<Materia> consultarMateriasPorSemestre(int semestre) {
        List<Materia> materiasSemestre = new ArrayList<>();
        for (Materia m : listaMaterias) {
            if (m.getSemestres() == semestre) {
                materiasSemestre.add(m);
            }
        }
        return materiasSemestre;
    }
    public void asociarProfesorAMateria(String codigoMateria, String identificadorProfesor) {
        for (Materia m : listaMaterias) {
            if (m.getCodigo().equals(codigoMateria)) {
                for (Profesor p : listaProfesores) {
                    if (p.getIdentificador().equals(identificadorProfesor)) {
                        m.setProfesor(p);
                        return;
                    }
                }
            }
        }
    }
    public int calcularHorasSemanales(String codigoMateria) {
        for (Materia m : listaMaterias) {
            if (m.getCodigo().equals(codigoMateria)) {
                if (m instanceof Practica) {
                    Practica mp = (Practica) m;
                    return mp.getNumerodehoraSemana() + mp.getHorasPractica();
                } else {
                    return m.getNumerodehoraSemana();
                }
            }
        }
        return 0;
    }

 public List<Estudiante> listarEstudiantesPorMateria(String codigoMateria) {
        for (Materia m : listaMaterias) {
            if (m.getCodigo().equals(codigoMateria)) {
                return m.getListaEstudiantes();
            }
        }
        return new ArrayList<>();
    }
    public int calcularCreditosEstudiante(String idEstudiante) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getIdentificador().equals(idEstudiante)) {
                int totalCreditos = 0;
                for (Materia m : e.getListaMaterias()) {
                    totalCreditos += m.getCantidadCreditos();
                }
                return totalCreditos;
            }
        }
        return 0;
    }
    public void inscribirEstudianteEnMaterias(String idEstudiante, List<String> codigosMaterias) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getIdentificador().equals(idEstudiante)) {
                for (String codigo : codigosMaterias) {
                    for (Materia m : listaMaterias) {
                        if (m.getCodigo().equals(codigo)) {
                            e.getListaMaterias().add(m);
                            m.getListaEstudiantes().add(e);
                        }
                    }
                }
            }
        }
    }
}
