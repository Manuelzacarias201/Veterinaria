package com.zacarias.veterinaria.models;

public class Reptil extends Animal{
    private String proteccion;
    public Reptil(String nombre, int edad, String proteccion) {
        super(nombre, edad);
        this.proteccion = proteccion;
    }
    private String imprimirReptil(){
        StringBuilder reptil = new StringBuilder();


        reptil.append("----------Mamifero----------\n");
        reptil.append("Nombre: ").append("-").append(nombre).append("-\n");
        reptil.append("Edad: ").append("-").append(edad).append("-\n");
        reptil.append("Proteccion: ").append("-").append(proteccion).append("-\n");

        return reptil.toString();
    }
}
