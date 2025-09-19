package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cita {

    private String codigo;
    private LocalDate fecha;
    private Double costo;
    private String hora;
    private String motivo;
    private String observaciones;
    private String estado;
    private Double duracion;

    public Cita(String codigo, LocalDate fecha, Double costo, String hora, String motivo,
                String observaciones, String estado, Double duracion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.costo = costo;
        this.hora = hora;
        this.motivo = motivo;
        this.observaciones = observaciones;
        this.estado = estado;
        this.duracion = duracion;
    }

    // ---------- GETTERS Y SETTERS ----------
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public Double getCosto() { return costo; }
    public void setCosto(Double costo) { this.costo = costo; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Double getDuracion() { return duracion; }
    public void setDuracion(Double duracion) { this.duracion = duracion; }

    // ---------- toString bonito ----------
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "\n CITA " + codigo +
                "\n   Fecha: " + fecha.format(formatter) +
                "\n   Hora: " + hora +
                "\n   Motivo: " + motivo +
                "\n   Observaciones: " + observaciones +
                "\n   Estado: " + estado +
                "\n   Duración: " + duracion + " min" +
                "\n   Costo: $" + costo + "\n";}

}