package app;

import model.*;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa("LUJOSHOP", "1···3··2", "Calle 67 #32-99");


        do {
            new JOptionPane("\n===== MENÚ EMPRESA =====");
            new JOptionPane("A. Registrar cliente");
            new JOptionPane("B. Registrar producto");
            new JOptionPane("C. Registrar factura");
            new JOptionPane("D. Buscar cliente");
            new JOptionPane("E. Actualizar cliente");
            new JOptionPane("F. Eliminar cliente");
            new JOptionPane("G. Mostrar todas las facturas");
            new JOptionPane("H. Salir");
            new JOptionPane("Seleccione una letra: ");
            opcion = sc.nextLine();
            sc.nextLine();
while{

            }

}
        }
    }