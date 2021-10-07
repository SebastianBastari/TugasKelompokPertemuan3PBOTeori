package com.example.tugaskelompokpertemuan3;
/**
 * Sebastian 1972006
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2  {
    @FXML
    private TextField txtNama;
    @FXML
    private TextField txtUAS;
    @FXML
    private TextField txtUTS;
    @FXML
    private TextField txtKAT;
    @FXML
    private Button submit;
    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;

    }
    public void submit(ActionEvent actionEvent) throws IOException {
        Stage new_stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tes.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);

        new_stage.setScene(new_scene);
        new_stage.setTitle("Page 2 ");
        new_stage.show();

    }

    public void addData(ActionEvent actionEvent) {
        Student student = new Student();
        student.setNama(txtNama.getText());
        student.setKat(Double.parseDouble(txtKAT.getText()));
        student.setUas(Double.parseDouble(txtUAS.getText()));
        student.setUts(Double.parseDouble(txtUTS.getText()));
        controller.getStudents().add(student);
        txtNama.setText("");
        txtKAT.setText("");
        txtUAS.setText("");
        txtUTS.setText("");
    }
}