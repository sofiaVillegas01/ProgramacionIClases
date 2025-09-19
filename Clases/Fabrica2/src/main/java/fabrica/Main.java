package fabrica;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Fabrica fabrica = new Fabrica("Perros","8100","6555","Armenia");
        Automovil automovil1=new Automovil("mazda","2026","4321","4","1·500", TipoCarroceria.COUPE);
        Venta venta=new Venta("56788", LocalDate.of(2010,8,24),automovil1);
        Empleado empleado=new Empleado("luis david","lopez","1234567","quindio","jefe",3380);
        JOptionPane.showMessageDialog(null,fabrica);
        JOptionPane.showMessageDialog(null,automovil1);
        JOptionPane.showMessageDialog(null,venta);
        JOptionPane.showMessageDialog(null,empleado);
    }
}