package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private String nit;
    private ArrayList<Animal>listaAnimales;

    public Zoologico(String nombre, String ubicacion, String nit) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaAnimales =new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }


    //CRUD//
    public String registrarAnimal(Animal animal){
        String resultado="";
        if(buscarAnimal(animal.getNombre())==null){
            listaAnimales.add(animal);
            resultado="este animal quedo registrado";
        }else{resultado="ya existe";
        }return resultado;
    }
    public Animal buscarAnimal(String nombre){
    for (Animal animal:listaAnimales){
        if(animal.getNombre().equals(nombre)){
            return animal;
        }
    }
    return null;
    }
    public String eliminarAnimal(Animal animal){
        String resultado=null;
        if(buscarAnimal(animal.getNombre())!=null){
            listaAnimales.remove(animal);
            resultado="se elimino correctamente la mascota";
        }else {resultado="no existe";
        }return resultado;
    }
    public void actualizarAnimal(String nombre){

        Scanner scanner = new Scanner(System.in);
        Animal animal = null;
        animal = buscarAnimal(nombre);

        System.out.println("Dame el nuevo nombre");
        String nuevoNombre = scanner.nextLine();
        System.out.println("Dame el nuevo tipo");
        String nuevoTipo = scanner.nextLine();
        System.out.println("Dame el nuevo id");
        int nuevoId = scanner.nextInt();
        animal.setNombre(nuevoNombre);
    }
    public void hacerSonidoTodos(){
        for (Animal animal:listaAnimales){
            animal.hacerSonido();//poliformismo
        }




    }
}
