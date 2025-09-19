package model;
import java.util.ArrayList;
import java.util.List;

public class Veterinaria20 {
        private String nombre;
        private List<Cita> citas;

        public Veterinaria20(String nombre) {
            this.nombre = nombre;
            this.citas = new ArrayList<>();
        }

        public void registrarCita(Cita cita) {
            citas.add(cita);
            System.out.println("✅ Cita registrada exitosamente.");
        }


}
