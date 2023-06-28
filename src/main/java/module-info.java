module de.neuefische.mucjava231javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    opens de.neuefische.mucjava231javafxdemo to javafx.fxml;

    exports de.neuefische.mucjava231javafxdemo;
    exports de.neuefische.mucjava231javafxdemo.basicHelloWorld;
    exports de.neuefische.mucjava231javafxdemo.basicHelloWorld.darunter;
}