module de.neuefische.mucjava231javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    opens de.neuefische.mucjava231javafxdemo to javafx.fxml;
    opens de.neuefische.mucjava231javafxdemo.basicHelloWorld to javafx.fxml;

    exports de.neuefische.mucjava231javafxdemo;
    exports de.neuefische.mucjava231javafxdemo.basicHelloWorld;
    exports de.neuefische.mucjava231javafxdemo.basicHelloWorld.darunter;

    opens de.neuefische.mucjava231javafxdemo.updateLabelOnTextChange to javafx.fxml;
    exports de.neuefische.mucjava231javafxdemo.updateLabelOnTextChange;

    opens de.neuefische.mucjava231javafxdemo.keyPressEvent to javafx.fxml;
    exports de.neuefische.mucjava231javafxdemo.keyPressEvent;

    opens de.neuefische.mucjava231javafxdemo.movableimage to javafx.fxml;
    exports de.neuefische.mucjava231javafxdemo.movableimage;

    opens de.neuefische.mucjava231javafxdemo.switchscenes to javafx.fxml;
    exports de.neuefische.mucjava231javafxdemo.switchscenes;
}