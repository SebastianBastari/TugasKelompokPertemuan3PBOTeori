package com.example.tugaskelompokpertemuan3;
/**
 * Sebastian 1972006
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tes2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Nilai Student");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}