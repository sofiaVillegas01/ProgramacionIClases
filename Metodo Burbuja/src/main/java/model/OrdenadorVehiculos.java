package model;
import java.util.ArrayList;
public class OrdenadorVehiculos {
            public static void ordenarPorPlaca(ArrayList<Vehiculo> vehiculos) {
                int n = vehiculos.size();
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (vehiculos.get(j).getPlaca().compareTo(vehiculos.get(j + 1).getPlaca()) > 0) {
                            Vehiculo temp = vehiculos.get(j);
                            vehiculos.set(j, vehiculos.get(j + 1));
                            vehiculos.set(j + 1, temp);
                        }
                    }
                }
            }
        }

