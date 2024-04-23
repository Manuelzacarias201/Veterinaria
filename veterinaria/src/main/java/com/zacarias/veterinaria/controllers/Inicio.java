package com.zacarias.veterinaria.controllers;

import com.zacarias.veterinaria.App;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class Inicio {

    @FXML
    void onConsultaClick(MouseEvent event) {
        App.nuevaVentana(event,"especie","Ingresa la especie.");
    }
    @FXML
    void onVerConsultaClick(MouseEvent event) {
        App.nuevaVentana(event,"ver-registro","Registros.");
    }
}
