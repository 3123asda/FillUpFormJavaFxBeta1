package com.example.brocodelesson9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Optional;

public class Scene1Controller {

    @FXML
    TextField user_first_name;
    @FXML
    TextField user_middle_name;
    @FXML
    TextField user_last_name;


    private Stage stage;
    private Scene scene;
    private Parent root;




    public void user_confirming_information(ActionEvent Userevents) throws IOException {

        String user_FirstName = user_first_name.getText();
        String user_MiddleName = user_middle_name.getText();
        String user_LastName = user_last_name.getText();
        String CompleteName = (user_LastName + ", " + user_FirstName + " " + user_MiddleName);

        if(!user_FirstName.matches("[a-zA-Z \\s]+")){

            //This Code Is Create A 2 Stage Same Time
            // Create A New Stage Local Variable
            // Create A New Scene Local Variable
            // Create A New Parent Local Variable

            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("WarningError.fxml"));

            Scene scene = new Scene(loader.load());
            Stage FirstNameError = new Stage();
            Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\exclamation mark.png");
            FirstNameError.getIcons().add(icon);
            FirstNameError.setTitle("Invalid First Name");
            FirstNameError.setScene(scene);
            WarningErrorController warningErrorController = loader.getController();
            warningErrorController.OK_Button_FirstNameErrorMethod(FirstNameError);
            FirstNameError.show();


        } else if (user_MiddleName.isBlank()) {

            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("Scene2.fxml"));
            root = loader.load();
            Scene2Controller  scene2Controller = loader.getController();
            scene2Controller.CompleteName(CompleteName);
            stage = (Stage)((Node)Userevents.getSource()).getScene().getWindow();
            System.out.println("User Don't Have Any Middle Name");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();



        } else if (!user_MiddleName.matches("[a-zA-Z]+")){

            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("MiddleNameError.fxml"));

            Scene scene = new Scene(loader.load());
            Stage MiddleNameError = new Stage();
            Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\exclamation mark.png");
            MiddleNameError.getIcons().add(icon);
            MiddleNameError.setTitle("Invalid Middle Name");
            MiddleNameError.setScene(scene);
            WarningErrorController warningErrorController = loader.getController();
            warningErrorController.OK_Button_MiddleNameErrorMethod(MiddleNameError);
            MiddleNameError.show();

        } else if (!user_LastName.matches("[a-zA-Z\\s]+")) {

            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("LastNameError.fxml"));

            Scene scene = new Scene(loader.load());
            Stage LastNameError = new Stage();
            Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\exclamation mark.png");
            LastNameError.getIcons().add(icon);
            LastNameError.setTitle("Invalid Last Name");
            LastNameError.setScene(scene);
            WarningErrorController warningErrorController = loader.getController();
            warningErrorController.OK_Button_LastNameErrorMethod(LastNameError);
            LastNameError.show();

        } else{
            /*
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
            root = loader.load();
            Scene2Controller  scene2Controller = loader.getController();
            scene2Controller.CompleteName(CompleteName);
            stage = (Stage)((Node)events.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
             */

            root = FXMLLoader.load(getClass().getResource("FatherProfile.fxml"));
            stage = (Stage)((Node)Userevents.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }


}
