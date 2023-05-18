package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController implements Initializable {

  

    @FXML
    private JFXButton login;
    @FXML
    private JFXButton btn;

    @FXML
    private JFXButton signUp; // Add signUp button
    @FXML
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
     
    }

    @FXML
    private void navigate(ActionEvent event) throws IOException {
        Stage primaryStage = (Stage) signUp.getScene().getWindow();
        Parent root = null;
        if (event.getSource() == signUp) {
            root = FXMLLoader.load(getClass().getResource("/FXML/SignUp.fxml")); // Load SignUp.fxml for sign-up page
        } else {
            root = FXMLLoader.load(getClass().getResource("login.fxml")); // Load Login.fxml for login page
        }
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    public void in(ActionEvent e) {
        System.out.println("Hello");
    }
}
