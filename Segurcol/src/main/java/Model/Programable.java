package Model;

import java.time.LocalDate;
import java.util.List;

public interface Programable {
        void programar(LocalDate fecha, String descripcion);
        List<AgendaItem> obtenerAgenda(LocalDate desde, LocalDate hasta);
    }


