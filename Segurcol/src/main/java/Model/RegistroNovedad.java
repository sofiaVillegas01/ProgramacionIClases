package Model;

import java.time.LocalDateTime;

public record RegistroNovedad(LocalDateTime fechaHora, String tipo, String descripcion) {
}
