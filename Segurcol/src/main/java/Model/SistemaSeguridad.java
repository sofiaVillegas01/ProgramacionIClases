package Model;

import java.util.ArrayList;
import java.util.List;

public class SistemaSeguridad {
        private List<Empleado> empleados = new ArrayList<>();
        private List<Servicio> servicios = new ArrayList<>();

        public void registrarEmpleado(Empleado e) {
            empleados.add(e);
        }

        public List<Empleado> listarPorTipo(Class<?> tipo) {
            return empleados.stream()
                    .filter(e -> tipo.isInstance(e))
                    .toList();
        }

        public void registrarServicio(Servicio s) {
            servicios.add(s);
        }

        public double calcularCostoTotalServicios() {
            return servicios.stream()
                    .mapToDouble(Servicio::calcularCostoMensual)
                    .sum();
        }

        public double calcularGastoTotalEmpresa() {
            double nomina = empleados.stream()
                    .mapToDouble(e -> e.calcularSalarioTotal(0)) // suponiendo 0 horas extra
                    .sum();
            double recursos = empleados.stream()
                    .mapToDouble(Empleado::calcularValorTotalEquipos)
                    .sum();
            return nomina + recursos;
        }
    }
