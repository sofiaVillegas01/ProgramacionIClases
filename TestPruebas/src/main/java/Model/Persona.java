package Model;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        if (nombre == null || nombre.isEmpty() || edad <= 0) {
            throw new IllegalArgumentException("Datos inválidos para la persona");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}