package com.zacarias.veterinaria.models;

public class Mamifero extends Animal{
    private String raza;
    public Mamifero(String nombre, int edad,String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public String imprimirMamifero(){
        StringBuilder mamifero = new StringBuilder();

        mamifero.append("----------Mamifero----------\n");
        mamifero.append("Nombre: ").append("-").append(nombre).append("-\n");
        mamifero.append("Edad: ").append("-").append(edad).append("-\n");
        mamifero.append("Raza: ").append("-").append(raza).append("-\n");

        return mamifero.toString();
    }
}
