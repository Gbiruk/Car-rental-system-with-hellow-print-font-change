package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SignUpController implements Initializable {

    @FXML
    private ToggleGroup Gender;

    @FXML
    private JFXButton Signupto;

    @FXML
    private JFXRadioButton female;

    @FXML
    private JFXTextField location;

    @FXML
    private JFXRadioButton male;

    @FXML
    private JFXTextField name;

    @FXML
    private AnchorPane parentPane;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton signup;

    @FXML
    void Database(ActionEvent event) {

    }

    @FXML
    void signup(ActionEvent event) throws IOException {
      signup.getScene().getWindow().hide(); 
      Stage login = new Stage();
   Parent root=FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
  Scene scene= new Scene(root);
  login.setScene(scene);
  login.show();
  login.setResizable(false);
  }

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    name.setStyle("-fx-text-inner-color:#a0a2ab");
    location.setStyle("-fx-text-inner-color:#a0a2ab");
    password.setStyle("-fx-text-inner-color:#a0a2ab");
  }
    }


