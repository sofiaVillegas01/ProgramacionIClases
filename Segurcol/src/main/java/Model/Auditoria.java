package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Auditoria {
    private List<RegistroNovedad> novedades = new ArrayList<>();

    public void registrarNovedad(RegistroNovedad novedad) {
        novedades.add(novedad);
    }

    public List<RegistroNovedad> obtenerNovedades(LocalDateTime desde, LocalDateTime hasta) {
        return novedades.stream()
                .filter(n -> !n.fechaHora().isBefore(desde) && !n.fechaHora().isAfter(hasta))
                .toList();
    }

}
