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

public class MotherProfileController {



    @FXML
    private TextField mother_contact_number;

    @FXML
    private TextField mother_facebook_account;

    @FXML
    private TextField mother_first_name;

    @FXML
    private TextField mother_gmail_account;

    @FXML
    private TextField mother_last_name;

    @FXML
    private TextField mother_middle_name;

    @FXML
    private TextField mother_montly_salary;

    @FXML
    private TextField mother_occupation;

    private Stage stage;
    private Parent root;
    private Scene scene;
    static String ErrorMessage;
    static String ErrorMessageTitle;




    @FXML
    void mother_confirming_information(ActionEvent Motherevent) throws IOException {
        String mother_firstName = mother_first_name.getText();
        String mother_middleName = mother_middle_name.getText();
        String mother_lastName = mother_last_name.getText();
        String mother_Occupation = mother_occupation.getText();
        String mother_montlySalary = mother_montly_salary.getText();
        String mother_contactNumber = mother_contact_number.getText();
        String mother_Gmail = mother_gmail_account.getText();
        String mother_Facebook = mother_facebook_account.getText();

        if (mother_firstName.isBlank() || !mother_firstName.matches("[a-zA-Z \\s]+")) {

            ErrorMessageTitle = "First Name Message Error";
            ErrorMessage = "Please Provide Correct First Name";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (!mother_middleName.matches("[a-zA-Z \\s]+") && !mother_middleName.isBlank()) {

            ErrorMessageTitle = "Middle Name Message Error";
            ErrorMessage = "Please Provide Correct Middle Name";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (mother_lastName.isBlank() || !mother_lastName.matches("[a-zA-Z \\s]+")) {

            ErrorMessageTitle = "Last Name Message Error";
            ErrorMessage = "Please Provide Correct Last Name";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (mother_Occupation.isBlank() || !mother_Occupation.isBlank() && !mother_Occupation.matches("[a-zA-Z \\s]+")) {

            ErrorMessageTitle = "Occupation Message Error";
            ErrorMessage = "Please Provide Correct Occupation";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (mother_montlySalary.isBlank()) {

            ErrorMessageTitle = "Monthly Salary Message Error";
            ErrorMessage = "Please Provide Salary";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (!mother_montlySalary.matches("\\d+")) {

            ErrorMessageTitle = "Monthly Salary Message Error";
            ErrorMessage = "Please Provide Correct Salary";
            MethodCollector.OK_Button_EncounteredError1();


        } else if (mother_contactNumber.isBlank()) {

            ErrorMessageTitle = "Contact Number Message Error";
            ErrorMessage = "Please Provide Contact Number";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (mother_contactNumber.matches("(09|\\+63)")) {

            ErrorMessageTitle = "Contact Number Message Error";
            ErrorMessage = "Please Provide Correct Contact Number";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (mother_contactNumber.matches("(09\\d+)") && !mother_contactNumber.matches("(\\d{11})")) {

            ErrorMessageTitle = "Contact Message Error";
            ErrorMessage = "09 Start Number Has Only 11 Digit(s)";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (mother_contactNumber.matches("(\\+63\\d+)") && mother_contactNumber.length() != 13) {

            ErrorMessageTitle = "Contact Number Message Error";
            ErrorMessage = "+63 Start Number Have Musts Only 13 Digit(s)";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (!mother_contactNumber.matches("(09\\d+|\\+63\\d+)")) {

            ErrorMessageTitle = "Contact Number Message Error";
            ErrorMessage = "Contact Number Must Start At [09 or +63]";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (mother_Gmail.isBlank()) {

            ErrorMessageTitle = "Gmail Account Message Error";
            ErrorMessage = "Gmail Account Can't Be Blank";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (!mother_Gmail.endsWith("@gmail.com")) {

            ErrorMessageTitle = "Gmail Account Message Error";
            ErrorMessage = "Email Address End In @gmail.com";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (mother_Facebook.isBlank()) {

            ErrorMessageTitle = "Facebook Account Message Error";
            ErrorMessage = "Facebook Account Can't Be Blank";
            MethodCollector.OK_Button_EncounteredError1();

        } else if (mother_middleName.isBlank()) {
            /*
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TestTExtFeildValue.fxml"));
            root = loader.load();

            TestTestFeildValueController UserFather_CompleteName = loader.getController();
            TestTestFeildValueController UserFather_Occupation = loader.getController();
            TestTestFeildValueController UserFather_MontlySalary = loader.getController();
            TestTestFeildValueController UserFather_ContactNumber = loader.getController();
            TestTestFeildValueController UserFather_Gmail = loader.getController();
            TestTestFeildValueController UserFather_Facebook = loader.getController();

            UserFather_CompleteName.FatherCompleteName(father_lastName + ", " + father_firstName + " " + father_middleName);
            UserFather_Occupation.FatherOccupation(father_Occupation);
            UserFather_MontlySalary.FatherMontlySalary(father_montlySalary);
            UserFather_ContactNumber.FatherContactNumber(father_contactNumber);
            UserFather_Gmail.FatherGmailAccount(father_Gmail);
            UserFather_Facebook.FatherFacebookAccount(father_Facebook);

            stage = (Stage) ((Node) Fatherevent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
             */
            /*
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MotherProfile.fxml"));
            root = loader.load();
            stage = (Stage) ((Node)Motherevent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

             */

        } else {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("TestTExtFeildValue.fxml"));
            root = loader.load();

            TestTestFeildValueController UserFather_CompleteName = loader.getController();
            TestTestFeildValueController UserFather_Occupation = loader.getController();
            TestTestFeildValueController UserFather_MontlySalary = loader.getController();
            TestTestFeildValueController UserFather_ContactNumber = loader.getController();
            TestTestFeildValueController UserFather_Gmail = loader.getController();
            TestTestFeildValueController UserFather_Facebook = loader.getController();

            UserFather_CompleteName.FatherCompleteName(
                    mother_lastName + ", "
                    + mother_firstName + " "
                    + mother_middleName);

            UserFather_Occupation.FatherOccupation(mother_Occupation);
            UserFather_MontlySalary.FatherMontlySalary(mother_montlySalary);
            UserFather_ContactNumber.FatherContactNumber(mother_contactNumber);
            UserFather_Gmail.FatherGmailAccount(mother_Gmail);
            UserFather_Facebook.FatherFacebookAccount(mother_Facebook);

            stage = (Stage) ((Node) Motherevent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();


        }
    }

    @FXML
    void father_back_information(ActionEvent FatherBackInformation)
            throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass()
                .getResource("FatherProfile.fxml"));

        root = loader.load();
        stage = (Stage) ((Node) FatherBackInformation.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
