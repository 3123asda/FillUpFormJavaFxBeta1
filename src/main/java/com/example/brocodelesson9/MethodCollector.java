package com.example.brocodelesson9;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class MethodCollector {

     static void FirstNameErrorFunction()
             throws IOException {

          FXMLLoader loader = new FXMLLoader(MethodCollector.class
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
     }

     static void MiddleNameErrorFunction()
             throws IOException {
          FXMLLoader loader = new FXMLLoader(MethodCollector.class
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
     }

     static void LastNameErrorFunction()
             throws IOException {
          FXMLLoader loader = new FXMLLoader(MethodCollector.class
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
     }

     static void OccupationErrorFunction()
             throws IOException {
          FXMLLoader loader = new FXMLLoader(MethodCollector.class
                  .getResource("OccupationError.fxml"));

          Scene scene = new Scene(loader.load());
          Stage FatherOccupationError = new Stage();
          Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\exclamation mark.png");
          FatherOccupationError.getIcons().add(icon);
          FatherOccupationError.setTitle("Invalid Occupation");
          FatherOccupationError.setScene(scene);
          WarningErrorController warningErrorController = loader.getController();
          warningErrorController.OK_Button_OccupationErrorMethod(FatherOccupationError);
          FatherOccupationError.show();
     }


     static void SalaryErrorFunction()
             throws IOException{
          FXMLLoader loader = new FXMLLoader(MethodCollector.class
                  .getResource("SalaryError.fxml"));

          Scene scene = new Scene(loader.load());
          Stage SalaryError = new Stage();
          Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\exclamation mark.png");
          SalaryError.getIcons().add(icon);
          SalaryError.setTitle("Invalid Salary");
          SalaryError.setScene(scene);
          WarningErrorController warningErrorController = loader.getController();
          warningErrorController.OK_Button_SalaryErrorMethod(SalaryError);
          SalaryError.show();

     }

     static void ContactNumberErrorFunction()
             throws IOException{
          FXMLLoader loader = new FXMLLoader(MethodCollector.class
                  .getResource("ContactNumberError.fxml"));

          Scene scene = new Scene(loader.load());
          Stage ContactNumberError = new Stage();
          Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\exclamation mark.png");
          ContactNumberError.getIcons().add(icon);
          ContactNumberError.setTitle("Invalid Contact Number");
          ContactNumberError.setScene(scene);
          WarningErrorController warningErrorController = loader.getController();
          warningErrorController.OK_Button_ContactNumberErrorMethod(ContactNumberError);
          ContactNumberError.show();

     }

     static void GmailAccountErrorFunction()
             throws IOException{
          FXMLLoader loader = new FXMLLoader(MethodCollector.class
                  .getResource("GmailAccountError.fxml"));

          Scene scene = new Scene(loader.load());
          Stage GmailAccountError = new Stage();
          Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\exclamation mark.png");
          GmailAccountError.getIcons().add(icon);
          GmailAccountError.setTitle("Invalid Gmail Account");
          GmailAccountError.setScene(scene);
          WarningErrorController warningErrorController = loader.getController();
          warningErrorController.OK_Button_GmailAccountErrorMethod(GmailAccountError);
          GmailAccountError.show();

     }

     static void FacebookAccountErrorFunction()
             throws IOException {
          FXMLLoader loader = new FXMLLoader(MethodCollector.class
                  .getResource("FacebookAccount.fxml"));

          Scene scene = new Scene(loader.load());
          Stage FacebookAccountError = new Stage();
          Image icon = new Image("C:\\Users\\admin\\IdeaProjects\\BroCodeLesson9\\src\\main\\java\\com\\example\\brocodelesson9\\exclamation mark.png");
          FacebookAccountError.getIcons().add(icon);
          FacebookAccountError.setTitle("Invalid Facebook Account");
          FacebookAccountError.setScene(scene);
          WarningErrorController warningErrorController = loader.getController();
          warningErrorController.OK_Button_FaceAccountErrorMethod(FacebookAccountError);
          FacebookAccountError.show();

     }

     static void TestFieldFather() throws IOException {

          //This Code Is TestField For Father Value

          /*
          FXMLLoader loader = new FXMLLoader(MethodCollector.class.getResource("TestTExtFeildValue.fxml"));
          Parent root = loader.load();

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
     }

     static void TestFieldMother(){

          //This Code Is TestField For Mother Value

          /*
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
           */
     }
}
