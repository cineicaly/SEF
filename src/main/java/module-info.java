module com.example.healthinspector {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.healthinspector to javafx.fxml;
    exports com.example.healthinspector;
}