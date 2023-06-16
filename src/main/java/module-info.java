module com.example.brocodelesson9 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.brocodelesson9 to javafx.fxml;
    exports com.example.brocodelesson9;
}