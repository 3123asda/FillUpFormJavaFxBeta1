package com.example.brocodelesson9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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



    static String ErrorMessage;
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

            //MethodCollector.FirstNameErrorFunction();
            ErrorMessage = "Please Provide Correct First Name";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (!father_middleName.matches("[a-zA-Z \\s]+") && !father_middleName.isBlank()) {

            //MethodCollector.MiddleNameErrorFunction();
            ErrorMessage = "Please Provide Correct Middle Name";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (father_lastName.isBlank() || !father_lastName.matches("[a-zA-Z \\s]+")) {

            //MethodCollector.LastNameErrorFunction();
            ErrorMessage = "Please Provide Correct Last Name";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (father_Occupation.isBlank() || !father_Occupation.isBlank() && !father_Occupation.matches("[a-zA-Z \\s]+")) {

            //MethodCollector.OccupationErrorFunction();
            ErrorMessage = "Please Provide Correct Occupation";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (father_montlySalary.isBlank() ) {

            //MethodCollector.SalaryErrorFunction();
            ErrorMessage = "Please Provide Salary";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (!father_montlySalary.matches("\\d+")) {

            ErrorMessage = "Please Provide Correct Salary";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (father_contactNumber.isBlank()) {

            //MethodCollector.ContactNumberErrorFunction();
            ErrorMessage = "Please Provide Contact Number";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (father_contactNumber.matches("(09|\\+63)")) {

            ErrorMessage = "Please Provide Correct Contact Number";
            MethodCollector.OK_Button_EncounterErrorOccured();
            
        }  else if (father_contactNumber.matches("(09\\d+)") && !father_contactNumber.matches("(\\d{11})"))
        {
            ErrorMessage = "09 Start Number Has Only 11 Digit(s)";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (father_contactNumber.matches("(\\+63\\d+)") && father_contactNumber.length() != 13)
        {
            ErrorMessage = "+63 Start Number Have Musts Only 13 Digit(s)";
            MethodCollector.OK_Button_EncounterErrorOccured();

        }else if (!father_contactNumber.matches("(09\\d+|\\+63\\d+)")) {

            //The condition of regex is "(09 | \\+63)" has space it SO it has 09(space) or +63(space)
            //The condition of regex is "(09|\\+63)" has no space SO it has 09 or +63 only
            ErrorMessage = "Contact Number Must Start At [09 or +63]";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (father_Gmail.isBlank()) {

            //MethodCollector.GmailAccountErrorFunction();
            ErrorMessage = "Gmail Account Can't Be Blank";
            MethodCollector.OK_Button_EncounterErrorOccured();

        }else if(!father_Gmail.endsWith("@gmail.com")){

            //This is Error ThaT Executed That if User Inputted Not has @gmail.com
            //Example:
            //If user Inputted UserName, it will execute this condition
            //If user Inputted UserName@gmail.com, It will not Execute this code, and it will jump for another else if
            ErrorMessage = "Email Address End In @gmail.com";
            MethodCollector.OK_Button_EncounterErrorOccured();

        } else if (father_Facebook.isBlank()) {

            //MethodCollector.FacebookAccountErrorFunction();
            ErrorMessage = "Facebook Account Can't Be Blank";
            MethodCollector.OK_Button_EncounterErrorOccured();

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
