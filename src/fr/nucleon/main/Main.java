package fr.nucleon.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        stage.setTitle("NucleonText Editor Release:0.1.0");
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}