package com.zacarias.veterinaria.controllers;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import com.zacarias.veterinaria.App;
import com.zacarias.veterinaria.models.Consulta;
import com.zacarias.veterinaria.models.RegistroConsultas;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class VerConsultas {

    @FXML
    private ListView<String> lista;

    @FXML
    void onSalirClick(MouseEvent event) {
        App.nuevaVentana(event,"inicio","Veterinaria Zacarias");
    }

    @FXML
    void initialize() {
        RegistroConsultas consultas = App.getConsultas();
        HashMap<String, Consulta> consultaHashMap = consultas.getConsultas();
        lista.getItems().clear();

        for (Consulta consulta : consultaHashMap.values()) {
            lista.getItems().add(consultas.imprimirConsulta(consulta));
        }
    }

}
