module com.example.project11_ui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project11_ui to javafx.fxml;
    exports com.example.project11_ui;
}