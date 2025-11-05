package app;

import model.Carrera;
import model.TipoContrato;
import model.TipoCurso;

import javax.swing.*;
import java.util.ArrayList;
public class Aplicacion {

public static void main(String[] args) {
                Carrera carrera = new Carrera("Multinacional");

                // Materias
                carrera.registrarMateriaTeorica("76", "Inglés", 32, 4, (byte) 2);
                JOptionPane.showMessageDialog(null, "Materia Teórica registrada:\nCódigo: 76\nNombre: Inglés\nHoras/Semana: 32\nCréditos: 4\nSemestre: 2");

                carrera.registrarMateriaPractica("56", "Ciencias", 20, 3, 2, 3, 2);
                JOptionPane.showMessageDialog(null, "Materia Práctica registrada:\nCódigo: 56\nNombre: Ciencias\nHoras/Semana: 20\nHoras Práctica: 3\nCréditos: 2\nSemestre: 3\nLaboratorios: 2");

                // Profesores
                carrera.registrarProfesorPlanta("29", "Liliana", "Profesora de Matemáticas", 20, true, TipoContrato.COMPLETO);
                JOptionPane.showMessageDialog(null, "Profesor de Planta registrado:\nID: 29\nNombre: Liliana\nTítulo: Profesora de Matemáticas\nExperiencia: 20 años\nParticipa en proyectos: Sí\nContrato: COMPLETO");

                carrera.registrarProfesorCatedra("34", "Mario", "Científico", 16, 30, true);
                JOptionPane.showMessageDialog(null, "Profesor de Cátedra registrado:\nID: 34\nNombre: Mario\nTítulo: Científico\nExperiencia: 16 años\nHoras contratadas: 30\nTrabaja en empresa: Sí");

                // Estudiantes
                carrera.registrarEstudiantePregrado("321", "Mari", "3456785", "Profe de Inglés", 8, true, 4.5);
                JOptionPane.showMessageDialog(null, "Estudiante de Pregrado registrado:\nID: 321\nNombre: Mari\nDocumento: 3456785\nPrograma: Profe de Inglés\nSemestre: 8\nBeca: Sí\nPromedio: 4.5");

                carrera.registrarEstudiantePosgrado("154", "Mateo", "109856748", "Ing. Sistemas", 2, "Política", TipoCurso.MAESTRIA);
                JOptionPane.showMessageDialog(null, "Estudiante de Posgrado registrado:\nID: 154\nNombre: Mateo\nDocumento: 109856748\nPrograma: Ing. Sistemas\nSemestre: 2\nInvestigación: Política\nCurso: MAESTRÍA");

                // Consultas
                JOptionPane.showMessageDialog(null, "Materias del semestre 3:\n" + carrera.consultarMateriasPorSemestre(3));

                carrera.asociarProfesorAMateria("76", "29");
                JOptionPane.showMessageDialog(null, "Profesor con ID 29 asociado a la materia con código 76");

                int horas = carrera.calcularHorasSemanales("56");
                JOptionPane.showMessageDialog(null, "Horas semanales de la materia 56: " + horas);

                int creditos = carrera.calcularCreditosEstudiante("321");
                JOptionPane.showMessageDialog(null, "Total de créditos del estudiante 321: " + creditos);

                JOptionPane.showMessageDialog(null, "Estudiantes en la materia 56:\n" + carrera.listarEstudiantesPorMateria("56"));

                ArrayList<String> codigosMaterias = new ArrayList<>();
                codigosMaterias.add("76");
                codigosMaterias.add("56");
                carrera.inscribirEstudianteEnMaterias("321", codigosMaterias);
                JOptionPane.showMessageDialog(null, "Estudiante 321 inscrito en materias: " + codigosMaterias);

                JOptionPane.showMessageDialog(null, "✅ Todos los datos fueron registrados correctamente.");
            }
}
