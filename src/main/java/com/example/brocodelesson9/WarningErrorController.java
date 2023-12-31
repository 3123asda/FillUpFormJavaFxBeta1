package com.example.brocodelesson9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class WarningErrorController {

    private static Stage stage;
    private static Scene scene;
    private static Parent root;

    @FXML
    Label WarningMessage;

    @FXML
    Label WarningMessage1;

    Stage FirstNameInvalidStage;
    Stage MiddleNameInvalidStage;
    Stage LastNameInvalidStage;
    Stage OccupationError;
    Stage SalaryError;
    Stage ContactNumberError;
    Stage GmailAccount;
    Stage FacebookAccount;
    Stage EncounteredErrorOccurred;
    Stage EncounteredErrorOccurred1;
    TextFlow ResizeText;

    public void OK_Button_FirstNameError(ActionEvent event)
    {
        FirstNameInvalidStage.close();
    }

    public void OK_Button_FirstNameErrorMethod(Stage FirstNameError)
    {
        this.FirstNameInvalidStage = FirstNameError;
    }

    public  void OK_Button_MiddleNameError(ActionEvent event) {
        MiddleNameInvalidStage.close();
    }

    public void OK_Button_MiddleNameErrorMethod(Stage MiddleNameError)
    {
        this.MiddleNameInvalidStage = MiddleNameError;
    }
    public void OK_Button_LastNameError(ActionEvent event) {
        LastNameInvalidStage.close();
    }

    public void OK_Button_LastNameErrorMethod(Stage LastNameError)
    {
        this.LastNameInvalidStage = LastNameError;
    }

    public void OK_Button_OccupationError(ActionEvent event) {
        OccupationError.close();
    }


    public void OK_Button_OccupationErrorMethod(Stage OccupationError)
    {
        this.OccupationError = OccupationError;
    }

    public void OK_Button_SalaryError(ActionEvent event) {
        SalaryError.close();
    }

    public void OK_Button_SalaryErrorMethod(Stage SalaryError)
    {
        this.SalaryError = SalaryError;
    }

    public void OK_Button_ContactNumberError(ActionEvent event)
    {
        ContactNumberError.close();
    }

    public void OK_Button_ContactNumberErrorMethod(Stage ContactNumberError)
    {
        this.ContactNumberError = ContactNumberError;
    }

    public void OK_Button_GmailAccountError(ActionEvent event)
    {
        GmailAccount.close();
    }

    public void OK_Button_GmailAccountErrorMethod(Stage GmailAccountError)
    {
        this.GmailAccount = GmailAccountError;
    }

    public void OK_Button_FacebookAccountError(ActionEvent event)
    {
        FacebookAccount.close();
    }

    public void OK_Button_FaceAccountErrorMethod(Stage FacebookAccountError)
    {
        this.FacebookAccount = FacebookAccountError;
    }



    public void OK_Button_EncounteredErrorMethod(Stage EncounteredError)
    {
        WarningMessage.setText(FatherProfileController.ErrorMessage);
        WarningMessage.setAlignment(Pos.CENTER);
        WarningMessage.setFont(new Font(20));
        WarningMessage.setStyle("-fx-text-fill: red");
        EncounteredError.setTitle(FatherProfileController.ErrorMessageTitle);
        EncounteredErrorOccurred = EncounteredError;
    }

    public void OK_Button_EncounteredError1(ActionEvent event)
    {
        this.EncounteredErrorOccurred1.close();
    }

    public void OK_Button_EncounteredErrorMethod1(Stage EncounteredError1){

        WarningMessage1.setText(MotherProfileController.ErrorMessage);
        WarningMessage1.setAlignment(Pos.CENTER);
        WarningMessage1.setFont(new Font(20));
        WarningMessage1.setStyle("-fx-text-fill: red");
        EncounteredError1.setTitle(MotherProfileController.ErrorMessageTitle);
        EncounteredErrorOccurred1 = EncounteredError1;
    }

    public void OK_Button_EncounteredError(ActionEvent event)
    {
        this.EncounteredErrorOccurred.close();
    }

}
