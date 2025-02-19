module org.example.csc311module02_part3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311module02_part3 to javafx.fxml;
    exports org.example.csc311module02_part3;
}