module com.example.gameprog {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
	requires java.desktop;
	
	opens com.example.gameprog to javafx.fxml;
    exports com.example.gameprog;
}