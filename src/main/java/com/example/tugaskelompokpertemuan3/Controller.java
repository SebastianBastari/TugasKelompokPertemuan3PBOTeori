package com.example.tugaskelompokpertemuan3;
/**
 * Sebastian 1972006
 */
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private TableView<Student> table1;
    @FXML
    private TableColumn<Student,String> namaSiswa;
    @FXML
    private TableColumn<Student,String> kat;
    @FXML
    private TableColumn<Student,String> uts;
    @FXML
    private TableColumn<Student,String> uas;
    @FXML
    private TableColumn<Student,String> rataRata;

    private ObservableList<Student> students;
    private ObservableList<Double> nilaiKat;
    private ObservableList<Double> nilaiUts;
    private ObservableList<Double> nilaiUas;
    private ObservableList<Double> nilaiRata;

    public void submit(ActionEvent actionEvent) throws IOException {
        Stage newStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tes2.fxml"));
        Parent root = loader.load();
        Controller2 controller2 = loader.getController();
        controller2.setController(this);


        Scene newScene = new Scene(root);
        newStage.setScene(newScene);
        newStage.setTitle("Page 1");
        newStage.show();


    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        students = FXCollections.observableArrayList();
        nilaiKat = FXCollections.observableArrayList();
        nilaiUts = FXCollections.observableArrayList();
        nilaiUas = FXCollections.observableArrayList();
        nilaiRata = FXCollections.observableArrayList();
        table1.setItems(students);
        namaSiswa.setCellValueFactory(data -> new SimpleStringProperty(String.valueOf(data.getValue().getNama())));
        kat.setCellValueFactory(data -> new SimpleStringProperty(String.valueOf(data.getValue().getKat())));
        uas.setCellValueFactory(data -> new SimpleStringProperty(String.valueOf(data.getValue().getUas())));
        uts.setCellValueFactory(data -> new SimpleStringProperty(String.valueOf(data.getValue().getUts())));
        rataRata.setCellValueFactory(data -> new SimpleStringProperty(String.valueOf(data.getValue().getNilaiRataRata())));
    }
        public ObservableList<Student> getStudents() {
            return students;
        }

    }
