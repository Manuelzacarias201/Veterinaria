package com.zacarias.veterinaria.controllers;

import com.zacarias.veterinaria.App;
import com.zacarias.veterinaria.models.Ave;
import com.zacarias.veterinaria.models.Consulta;
import com.zacarias.veterinaria.models.Mamifero;
import com.zacarias.veterinaria.models.RegistroConsultas;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.HashMap;

public class ConsultaMamifero {

    @FXML
    private TextField diagnostico;

    @FXML
    private TextField edadA;

    @FXML
    private TextField elimConsulta;

    @FXML
    private ListView<String> lista;

    @FXML
    private TextField nombreA;

    @FXML
    private TextField razaA;

    @FXML
    private TextField titulo;

    @FXML
    void actualizarClick() {
        RegistroConsultas consultas = App.getConsultas();
        String nameA = nombreA.getText();
        int yearA = Integer.parseInt(edadA.getText());
        String raza = razaA.getText();

        Ave ave = new Ave(nameA,yearA,raza);

        String tituloConsulta = titulo.getText();
        String diag = diagnostico.getText();

        Consulta consulta = new Consulta(tituloConsulta,ave,diag);
        consultas.actualizar(tituloConsulta,consulta);
    }

    @FXML
    void agregarClick() {
        RegistroConsultas consultas = App.getConsultas();
        String nameA = nombreA.getText();
        int yearA = Integer.parseInt(edadA.getText());
        String raza = razaA.getText();

        Mamifero mamifero = new Mamifero(nameA,yearA,raza);

        String tituloConsulta = titulo.getText();
        String diag = diagnostico.getText();

        Consulta consulta = new Consulta(tituloConsulta,mamifero,diag);
        consultas.agregar(consulta);

        lista.getItems().add(consultas.imprimirConsulta(consulta));
    }

    @FXML
    void eliminarClick() {
        RegistroConsultas consultas = App.getConsultas();
        String elim = elimConsulta.getText();
        consultas.eliminar(elim);
    }

    @FXML
    void salirClick(MouseEvent event) {
        App.nuevaVentana(event,"Inicio","Veterinaria Zacarias");
    }
    @FXML
    void initialize(){
        RegistroConsultas consultas = App.getConsultas();
        HashMap<String, Consulta> consultaHashMap = consultas.getConsultas();
        lista.getItems().clear();

        for (Consulta consulta : consultaHashMap.values()) {
            if (consulta.getAnimal() instanceof Mamifero){
                lista.getItems().add(consultas.imprimirConsulta(consulta));
            }
        }
    }

}
