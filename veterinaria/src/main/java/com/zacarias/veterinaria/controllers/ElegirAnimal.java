package com.zacarias.veterinaria.controllers;

import com.zacarias.veterinaria.App;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class ElegirAnimal {

    @FXML
    void onAveClick(MouseEvent event) {
        App.nuevaVentana(event,"ConsultaAve","Hacer consulta para un ave...");
    }

    @FXML
    void onMamiferoClick(MouseEvent event) {
        App.nuevaVentana(event,"ConsultaMamifero","Hacer consulta para un mamifero...");

    }

    @FXML
    void onReptilClick(MouseEvent event) {
        App.nuevaVentana(event,"ConsultaReptil","Hacer consulta para un reptil...");

    }

    @FXML
    void onSalirClick(MouseEvent event) {
        App.nuevaVentana(event,"inicio","Veterinaria Zacarias");
    }

}
