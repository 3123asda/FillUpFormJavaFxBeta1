package com.example.brocodelesson9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class FatherProfileController {

    @FXML
    TextField father_first_name;

    @FXML
    TextField father_middle_name;

    @FXML
    TextField father_last_name;

    @FXML
    TextField father_occupation;

    @FXML
    TextField father_montly_salary;

    @FXML
    TextField father_contact_number;

    @FXML
    TextField father_gmail_account;

    @FXML
    TextField father_facebook_account;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void father_confirming_information(ActionEvent Fatherevent) throws IOException {
        String father_firstName = father_first_name.getText();
        String father_middleName = father_middle_name.getText();
        String father_lastName = father_last_name.getText();
        String father_Occupation = father_occupation.getText();
        String father_montlySalary = father_montly_salary.getText();
        String father_contactNumber = father_contact_number.getText();
        String father_Gmail = father_gmail_account.getText();
        String father_Facebook = father_facebook_account.getText();

        if (father_firstName.isBlank() || !father_firstName.matches("[a-zA-Z \\s]+")) {

            MethodCollector.FirstNameErrorFunction();

        } else if (!father_middleName.matches("[a-zA-Z \\s]+") && !father_middleName.isBlank()) {

            MethodCollector.MiddleNameErrorFunction();

        } else if (father_lastName.isBlank() || !father_lastName.matches("[a-zA-Z \\s]+")) {

            MethodCollector.LastNameErrorFunction();

        } else if (father_Occupation.isBlank() || !father_Occupation.isBlank() && !father_Occupation.matches("[a-zA-Z \\s]+")) {

            MethodCollector.OccupationErrorFunction();

        } else if (father_montlySalary.isBlank() || !father_montlySalary.matches("\\d+")) {

            MethodCollector.SalaryErrorFunction();

        } else if (father_contactNumber.isBlank() || !father_contactNumber.matches("\\d+")) {

            MethodCollector.ContactNumberErrorFunction();

        } else if (father_Gmail.isBlank()) {

            MethodCollector.GmailAccountErrorFunction();
        } else if (father_Facebook.isBlank()) {

            MethodCollector.FacebookAccountErrorFunction();

        } else if (father_middleName.isBlank()) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("MotherProfile.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) Fatherevent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {

            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("MotherProfile.fxml"));

            root = loader.load();
            stage = (Stage) ((Node) Fatherevent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
    }

    @FXML
    void student_back_information(ActionEvent StudentBackInformation)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass()
                .getResource("Scene1.fxml"));

        root = loader.load();
        stage = (Stage) ((Node) StudentBackInformation.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
