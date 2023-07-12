module com.example.kwabena {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kwabena to javafx.fxml;
    exports com.example.kwabena;
}