package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private JFXButton forgotPassword;

    @FXML
    private JFXButton login;

    @FXML
    private JFXPasswordField password;

    @FXML
    private ImageView progress;

    @FXML
    private JFXCheckBox remember;

    @FXML
    private JFXButton signUp;

    @FXML
    private JFXTextField username;

    @FXML
    public void loginAction(ActionEvent event) throws IOException {
      login.getScene().getWindow().hide();
      Stage signUp= new Stage();
      Parent root= FXMLLoader.load(getClass().getResource("/FXML/signupSuccess.fxml"));
       Scene scene= new Scene(root);
       signUp.setScene(scene);
       signUp.show();
       signUp.setResizable(false);
     }
 
     @FXML
    public void signUp(ActionEvent event) throws IOException {
         login.getScene().getWindow().hide();
         Stage signUp= new Stage();
         Parent root= FXMLLoader.load(getClass().getResource("/FXML/SignUp.fxml"));
          Scene scene= new Scene(root);
          signUp.setScene(scene);
          signUp.show();
          signUp.setResizable(false);
     }
 
     @Override
     public void initialize(URL arg0, ResourceBundle arg1) {
           // TODO Auto-generated method stub
         username.setStyle("-fx-text-inner-color:#a0a2ab");
          password.setStyle("-fx-text-inner-color:#a0a2ab");
     }

}
