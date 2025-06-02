module com.example.novakalkulacka {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.novakalkulacka to javafx.fxml;
    exports com.example.novakalkulacka;
}