module com.example.simpleconvertor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.simpleconvertor to javafx.fxml;
    exports com.example.simpleconvertor;
}