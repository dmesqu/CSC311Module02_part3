package org.example.csc311module02_part3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class HomeController {
    @FXML
    Button btnSignup;

    @FXML
    protected void logout() throws IOException {
        Scene scene = this.btnSignup.getScene();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login-view.fxml"));
        scene.setRoot(fxmlLoader.load());
    }
}
