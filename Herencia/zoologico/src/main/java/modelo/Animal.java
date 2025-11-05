package modelo;

public abstract class Animal {
private String nombre;
    public Animal(String nombre, String tipo, int id) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public abstract void hacerSonido();
}
