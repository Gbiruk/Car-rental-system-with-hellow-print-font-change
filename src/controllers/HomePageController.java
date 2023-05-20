package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomePageController implements Initializable {

    @FXML
    private AnchorPane Holder;
    @FXML
    private JFXButton Finance;
    @FXML
    private JFXButton checkout;

    @FXML
    private AnchorPane holder;

    @FXML
    private JFXButton item;

    @FXML
    private AnchorPane toplist;

    @FXML
    private Text wellcome;
    @FXML
    void Finances(ActionEvent event) throws IOException {
        Holder.getChildren().clear();
        holder.getChildren().clear();
        try {
            AnchorPane homePane = FXMLLoader.load(getClass().getResource("/FXML/Financing.fxml"));
            setNode1(homePane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void setNode1(AnchorPane node1) {
        Holder.getChildren().clear();
        Holder.getChildren().add(node1);
    }
    @FXML
    void navigate(ActionEvent event) {
        // Clear current content
        Holder.getChildren().clear();
        holder.getChildren().clear();
        // Add Home.fxml
        try {
            AnchorPane homePane = FXMLLoader.load(getClass().getResource("/FXML/Home.fxml"));
            setNode(homePane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void setNode(AnchorPane node) {
        Holder.getChildren().clear();
        Holder.getChildren().add(node);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }

}
