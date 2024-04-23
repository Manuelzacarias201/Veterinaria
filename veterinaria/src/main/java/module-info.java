module com.zacarias.veterinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zacarias.veterinaria.models to javafx.fxml;
    exports com.zacarias.veterinaria.models;

    opens com.zacarias.veterinaria.controllers to javafx.fxml;
    exports com.zacarias.veterinaria;

}