package app;

import model.Cita;
import model.Mascota;
import model.Veterinaria;

import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static model.Veterinaria.buscarCita;

public class Aplicacion {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria("Animal uq", "Carrera 50 #10-20", "901234567-8");

        JOptionPane.showMessageDialog(null,
                "=== Bienvenido al sistema de gestión de mascotas ===\n" +
                        vet.mostrarDatos());

        Mascota perro = new Mascota(1, "Rocky", "Perro", "Pastor Alemán", 6, "Negro y café", 30.0);
        perro.agregarEnfermedad("Parvovirus");

        Mascota gato = new Mascota(2, "Luna", "Gato", "Angora", 2, "Gris", 3.8);
        gato.agregarEnfermedad("Conjuntivitis");

        Mascota loro = new Mascota(3, "Kiwi", "Ave", "Loro Amazónico", 4, "Verde", 1.5);

        JOptionPane.showMessageDialog(null, vet.registrarOModificarMascota(perro));
        JOptionPane.showMessageDialog(null, vet.registrarOModificarMascota(gato));
        JOptionPane.showMessageDialog(null, vet.registrarOModificarMascota(loro));

        // Mostrar mascotas
        StringBuilder mascotasTexto = new StringBuilder("## Mascotas registradas en veterinaria ##\n");
        for (Mascota m : vet.getListaMascotas()) {
            mascotasTexto.append(m).append("\n");
        }
        JOptionPane.showMessageDialog(null, mascotasTexto.toString());
        // MANEJO DE CITAS

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<Cita> listaCitas = new ArrayList<>();

        Cita c1 = new Cita("01", LocalDate.parse("2026-04-12", formatter), 200.0, "10:00",
                "Vacunación", "Aplicación de vacuna anual", "Pendiente", 20.0);

        Cita c2 = new Cita("02", LocalDate.parse("2026-05-05", formatter), 300.0, "11:30",
                "Consulta general", "Revisión de rutina", "Pendiente", 30.0);

        Cita c3 = new Cita("03", LocalDate.parse("2026-06-01", formatter), 150.0, "15:00",
                "Desparasitación", "Desparasitación interna", "Pendiente", 15.0);

        listaCitas.add(c1);
        listaCitas.add(c2);
        listaCitas.add(c3);

        // Mostrar citas iniciales
        StringBuilder citasTexto = new StringBuilder("LISTA INICIAL DE CITAS:\n");
        for (Cita c : listaCitas) {
            citasTexto.append(c).append("\n");
        }
        JOptionPane.showMessageDialog(null, citasTexto.toString());

        // Modificar cita "02"
        for (Cita c : listaCitas) {
            if (c.getCodigo().equals("02")) {
                c.setEstado("✅ Completada");
                c.setCosto(350.0);
            }
        }

        // Mostrar citas modificadas
        citasTexto = new StringBuilder("✏️ LISTA DE CITAS TRAS MODIFICAR:\n");
        for (Cita c : listaCitas) {
            citasTexto.append(c).append("\n");
        }
        JOptionPane.showMessageDialog(null, citasTexto.toString());

        // Eliminar cita "01"
        listaCitas.removeIf(c -> c.getCodigo().equals("001"));

        citasTexto = new StringBuilder("🗑️ LISTA DE CITAS TRAS ELIMINAR:\n");
        for (Cita c : listaCitas) {
            citasTexto.append(c).append("\n");
        }
        JOptionPane.showMessageDialog(null, citasTexto.toString());
        // BUSCAR UNA CITA (con JOptionPane)
        // ================================
        String codigoBuscado = JOptionPane.showInputDialog("Ingrese el código de la cita a buscar:");
        Cita citaBuscada = buscarCita(listaCitas, codigoBuscado);

        if (citaBuscada != null) {
            JOptionPane.showMessageDialog(null, "🔎 Cita encontrada:\n" + citaBuscada);
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ No se encontró la cita con el código " + codigoBuscado);
        }
    }
}
