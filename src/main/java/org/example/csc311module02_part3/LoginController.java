package org.example.csc311module02_part3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button btnLogin;

    @FXML
    protected void login() throws IOException {
        Scene scene = this.btnLogin.getScene();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home-view.fxml"));
        scene.setRoot(fxmlLoader.load());
    }

    @FXML
    protected void signup() throws IOException {
        Scene scene = this.btnLogin.getScene();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup-view.fxml"));
        scene.setRoot(fxmlLoader.load());
    }
}