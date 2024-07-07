module com.lalita.inventorymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires servlet.api;
    requires org.json;
    requires java.sql;
    requires javafx.base;

    opens com.lalita.inventorymanagementsystem to javafx.fxml;
    exports com.lalita.inventorymanagementsystem;

    opens com.lalita.inventorymanagementsystem.classes to javafx.base;
    exports com.lalita.inventorymanagementsystem.classes;
}