module com.example.stickhero {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.management;
    requires junit;
    requires javafx.media;


    opens com.example.stickhero to javafx.fxml;
    exports com.example.stickhero;
}