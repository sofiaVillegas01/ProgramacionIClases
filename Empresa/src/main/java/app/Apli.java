package app;

import model.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;

public class Apli {
        public static void main(String[] args) {
            // Crear clientes
            ClienteFrecuente cliente1 = new ClienteFrecuente("Ana Pérez", "123456789", "Calle 10 #5-20", 120);
            ClienteCorporativo cliente2 = new ClienteCorporativo("Empresa XYZ", "900123456", "Av. Principal 45", "890123456-7", 10.0);

            // Crear productos
            Producto leche = new ProductoAlimenticio("A001", "Leche Entera", 3500, LocalDate.of(2025, 12, 31));
            Producto arroz = new ProductoAlimenticio("A002", "Arroz Blanco", 2800, LocalDate.of(2026, 1, 15));
            Producto nevera = new ProductoElectronico("E001", "Nevera LG", 1800000, 24);
            Producto licuadora = new ProductoElectronico("E002", "Licuadora Oster", 250000, 12);

            // Crear factura para cliente frecuente
            Factura factura1 = new Factura(1, new Date(), cliente1);
            factura1.agregarDetalle(leche, 2);
            factura1.agregarDetalle(arroz, 3);
            factura1.agregarDetalle(licuadora, 1);

            // Crear factura para cliente corporativo
            Factura factura2 = new Factura(2, new Date(), cliente2);
            factura2.agregarDetalle(nevera, 1);
            factura2.agregarDetalle(arroz, 10);

            // Mostrar facturas con JOptionPane
            JOptionPane.showMessageDialog(null, "=== FACTURA CLIENTE FRECUENTE ===\n" + factura1.generarResumen());
            JOptionPane.showMessageDialog(null, "=== FACTURA CLIENTE CORPORATIVO ===\n" + factura2.generarResumen());
        }

}

