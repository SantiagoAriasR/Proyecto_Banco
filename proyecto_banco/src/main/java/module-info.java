module co.edu.uniquindio.proyecto_banco {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.proyecto_banco to javafx.fxml;
    exports co.edu.uniquindio.proyecto_banco;
}