package com.example.brocodelesson9;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class WarningErrorController {

    private static Stage stage;
    private static Scene scene;
    private static Parent root;


    /*

    void ErrorBackToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(WarningErrorController.class.getResource("Scene1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\form.png");
        stage.getIcons().clear();
        stage.getIcons().add(icon);
        stage.setTitle("Fill Up Form");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     */

    Stage FirstNameInvalidStage;
    Stage MiddleNameInvalidStage;
    Stage LastNameInvalidStage;
    Stage OccupationError;
    Stage SalaryError;
    Stage ContactNumberError;
    Stage GmailAccount;
    Stage FacebookAccount;

    public void OK_Button_FirstNameError(ActionEvent event) {
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

}
