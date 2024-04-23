package com.zacarias.veterinaria.models;


import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class RegistroConsultas {
    private HashMap <String, Consulta> consultas = new HashMap<>();
    public HashMap<String, Consulta> getConsultas() {
        return consultas;
    }
    public void agregar(Consulta consulta){
        consultas.put(consulta.getTituloConsulta(),consulta);
    }
    public void actualizar(String titulo,Consulta consulta){
        consultas.put(titulo, consulta);
    }
    public void eliminar(String titulo){
        consultas.remove(titulo);
    }
    public String imprimirConsulta(Consulta consulta){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("----------Consulta----------\n");
        stringBuilder.append("Titulo: ").append("-").append(consulta.getTituloConsulta()).append("-\n");
        if (consulta.getAnimal() instanceof Reptil){
            stringBuilder.append("Animal(Reptil): ").append(consulta.getAnimal().getNombre()).append("\n");
        } else if (consulta.getAnimal() instanceof Ave) {
            stringBuilder.append("Animal(Ave): ").append(consulta.getAnimal().getNombre()).append("\n");
        } else if (consulta.getAnimal() instanceof Mamifero) {
            stringBuilder.append("Animal(Mamifero): ").append(consulta.getAnimal().getNombre()).append("\n");
        }
        stringBuilder.append("Diagnostico: ").append(consulta.getDiagnostico()).append("\n");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        stringBuilder.append("Fecha consulta: ").append("-").append(dtf.format(consulta.getFecha())).append("-\n");
        DateTimeFormatter dtfAux = DateTimeFormatter.ofPattern("HH:mm");
        stringBuilder.append("Fecha consulta: ").append("-").append(dtfAux.format(consulta.getHora())).append("-\n");

        return stringBuilder.toString();
    }
}
