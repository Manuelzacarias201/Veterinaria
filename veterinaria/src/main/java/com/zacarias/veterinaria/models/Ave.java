package com.zacarias.veterinaria.models;

public class Ave extends Animal{
    private String colorPlumas;
    public Ave(String nombre, int edad,String colorPlumas) {
        super(nombre, edad);
        this.colorPlumas = colorPlumas;
    }
    public String imprimirAve(){
        StringBuilder ave = new StringBuilder();
        ave.append("----------Ave----------\n");
        ave.append("Nombre: ").append("-").append(nombre).append("-\n");
        ave.append("Edad: ").append("-").append(edad).append("-\n");
        ave.append("Color de plumas :").append("-").append(colorPlumas).append("-\n");

        return ave.toString();
    }
}
