package com.example.brocodelesson9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TestTestFeildValueController {

    @FXML // fx:id="FatherCompleteName"
    private Label FatherCompleteName; // Value injected by FXMLLoader

    @FXML // fx:id="FatherContactNumber"
    private Label FatherContactNumber; // Value injected by FXMLLoader

    @FXML // fx:id="FatherFacebookAccount"
    private Label FatherFacebookAccount; // Value injected by FXMLLoader

    @FXML // fx:id="FatherGmailAccount"
    private Label FatherGmailAccount; // Value injected by FXMLLoader

    @FXML // fx:id="FatherMontlySalary"
    private Label FatherMontlySalary; // Value injected by FXMLLoader

    @FXML // fx:id="FatherOccupation"
    private Label FatherOccupation; // Value injected by FXMLLoader

    private Stage stage;


    private Scene scene;


    private Parent root;


    public void FatherCompleteName(String FatherCompleteNameDisplay){
        FatherCompleteName.setText(FatherCompleteNameDisplay);
    }

    public void  FatherContactNumber(String FatherContactNumberDisplay){
        FatherContactNumber.setText(FatherContactNumberDisplay);
    }

    public void FatherFacebookAccount(String FatherFacebookAccountDisplay){
        FatherFacebookAccount.setText(FatherFacebookAccountDisplay);
    }

    public void FatherGmailAccount(String FatherGmailAccountDisplay){
        FatherGmailAccount.setText(FatherGmailAccountDisplay);
    }

    public void FatherMontlySalary(String FatherMontlySalaryDisplay){
        FatherMontlySalary.setText(FatherMontlySalaryDisplay);
    }

    public void FatherOccupation(String FatherOccupationDisplay){
        FatherOccupation.setText(FatherOccupationDisplay);
    }


    @FXML
    void FatherConfirmPersonalInformation(ActionEvent event) {

    }

}
