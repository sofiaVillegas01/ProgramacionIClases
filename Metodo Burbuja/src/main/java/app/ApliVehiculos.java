package app;

import model.OrdenadorVehiculos;
import model.Vehiculo;

import javax.swing.*;
import java.util.ArrayList;

public class ApliVehiculos {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new Vehiculo("XYZ789", "Honda", 2018));
        listaVehiculos.add(new Vehiculo("ABC123", "Toyota", 2015));
        listaVehiculos.add(new Vehiculo("LMN456", "Ford", 2012));
        listaVehiculos.add(new Vehiculo("DEF321", "Chevrolet", 2020));

        StringBuilder antesOrden = new StringBuilder("Antes de ordenar:\n");
        for (Vehiculo v : listaVehiculos) {
            antesOrden.append(v).append("\n");
        }
        JOptionPane.showMessageDialog(null, antesOrden.toString());

        OrdenadorVehiculos.ordenarPorPlaca(listaVehiculos);

        StringBuilder despuesOrden = new StringBuilder("✅ Después de ordenar por placa:\n");
        for (Vehiculo v : listaVehiculos) {
            despuesOrden.append(v).append("\n");
        }
        JOptionPane.showMessageDialog(null, despuesOrden.toString());
    }
}