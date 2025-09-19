package model;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private String ubicacion;
    private String nit;
    private List<Mascota> listaMascotas;
    private List<Cita> listaCitas;

    public Veterinaria(String nombre, String ubicacion, String nit) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaMascotas = new ArrayList<>();
        this.listaCitas = new ArrayList<>();
    }

    /**
     * Registra una nueva mascota o modifica la información si ya existe
     * @param nuevaMascota mascota a registrar o modificar
     * @return mensaje de confirmación
     */
    public String registrarOModificarMascota(Mascota nuevaMascota) {
        for (Mascota m : listaMascotas) {
            if (m.getId() == nuevaMascota.getId()) {
                m.setNombre(nuevaMascota.getNombre());
                m.setEspecie(nuevaMascota.getEspecie());
                m.setRaza(nuevaMascota.getRaza());
                m.setEdad(nuevaMascota.getEdad());
                m.setColor(nuevaMascota.getColor());
                m.setPeso(nuevaMascota.getPeso());
                m.setListaEnfermedades(nuevaMascota.getListaEnfermedades());
                return "Mascota con ID " + nuevaMascota.getId() + " actualizada con éxito.";
            }
        }
        listaMascotas.add(nuevaMascota);
        return "Mascota con ID " + nuevaMascota.getId() + " registrada con éxito.";
    }

    /**
     * Busca una mascota en la veterinaria por su ID
     * @param id identificador único de la mascota
     * @return la mascota encontrada o null si no existe
     */
    public Mascota buscarMascota(int id) {
        for (Mascota m : listaMascotas) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    /**
     * Elimina una mascota de la veterinaria
     * @param id identificador único de la mascota
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminarMascota(int id) {
        Mascota mascota = buscarMascota(id);
        if (mascota != null) {
            listaMascotas.remove(mascota);
            return true;
        }
        return false;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public List<Cita> getListaCitas() {
        return listaCitas;
    }

    /**
     * Muestra las mascotas registradas en la veterinaria
     */
    public void mostrarMascotas() {
        System.out.println("\n## Mascotas registradas en " + nombre + " ##");
        if (listaMascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            for (Mascota m : listaMascotas) {
                System.out.println(m); // Se recomienda implementar toString() en Mascota
            }
        }
    }

    /**
     * Muestra la información de la veterinaria
     * @return string con los datos de la veterinaria
     */
    public String mostrarDatos() {
        return "Veterinaria: " + nombre + "\n" +
                "Dirección: " + ubicacion + "\n" +
                "NIT: " + nit + "\n";
    }

    /**
     * Registra una nueva cita en la veterinaria
     */
    public static Cita buscarCita(List<Cita> listaCitas, String codigo) {
        for (Cita c : listaCitas) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c; // Retorna la cita encontrada
            }
        }
        return null; // Si no la encuentra, retorna null
    }

}
