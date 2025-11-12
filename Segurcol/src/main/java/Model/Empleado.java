package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
        private String nombre;
        private String documento;
        private TipoTurno tipoTurno;
        private double salarioBase;
        private List<Equipo> equipos = new ArrayList<>();


    public Empleado(String nombre, String documento, TipoTurno tipoTurno, double salarioBase) {
        this.nombre = nombre;
        this.documento = documento;
        this.tipoTurno = tipoTurno;
        this.salarioBase = salarioBase;
        this.equipos = equipos;
    }

    public abstract double calcularSalarioTotal(int horasExtras);


        public void asignarEquipo(Equipo equipo) {
            equipos.add(equipo);
        }

        public void retirarEquipo(Equipo equipo) {
            equipos.remove(equipo);
        }

        public double calcularValorTotalEquipos() {
            return equipos.stream().mapToDouble(Equipo::getValorReposicion).sum();
        }

        public List<Equipo> getEquipos() {
            return equipos;
        }

        // Getters y setters...

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoTurno getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(TipoTurno tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
}

