package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

public class LoginController implements Initializable{

    @FXML 
    private JFXTextField username;
  
    @FXML 
    private JFXButton login;
    @FXML 
    private JFXPasswordField password;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
     username.setStyle("-fx-text-inner-color: #a0a2ab");
     password.setStyle("-fx-text-inner-color: #a0a2ab");   
     login.setOnAction(event -> {
    System.out.print("hellow");
    });
       
    }
    @FXML
    public void in(ActionEvent e){
        System.out.print("hellow");
    }
    
}

