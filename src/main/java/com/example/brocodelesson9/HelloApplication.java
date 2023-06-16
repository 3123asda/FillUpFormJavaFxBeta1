package com.example.brocodelesson9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stages) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scene1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stages.setTitle("Fill Up Form");
        Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\form.png");
        stages.getIcons().add(icon);
        stages.setScene(scene);
        stages.show();

    }

    public static void main(String[] args) {
        launch();

    }
}