package com.zacarias.veterinaria.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta {

    private String tituloConsulta;
    private Animal animal;
    private String diagnostico;
    private LocalDateTime hora;
    private LocalDate fecha;

    public Consulta(String tituloConsulta, Animal animal, String diagnostico) {
        this.tituloConsulta = tituloConsulta;
        this.animal = animal;
        this.diagnostico = diagnostico;
        this.hora = LocalDateTime.now();
        this.fecha = LocalDate.now();
    }

    public String getTituloConsulta() {
        return tituloConsulta;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
