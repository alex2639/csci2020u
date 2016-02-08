package Lab04;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.time.LocalDate;

public class Main extends Application {
    private TextField usernameField, emailField, phoneField, nameField;
    private PasswordField passwordField;

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Lab 04");

        GridPane grid=new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);

        Label usernameLabel=new Label("Username:");
        grid.add(usernameLabel,0,0);
        usernameField=new TextField();
        usernameField.setPromptText("Username");
        grid.add(usernameField,1,0); // column,row

        Label passwordLabel=new Label("Password:");
        grid.add(passwordLabel,0,1);
        passwordField=new PasswordField();
        //usernameField.setPromptText("Username");
        grid.add(passwordField,1,1); // column,row

        Label nameLabel=new Label("Full Name:");
        grid.add(nameLabel,0,2);
        nameField=new TextField();
        nameField.setPromptText("Full Name");
        grid.add(nameField,1,2); // column,row

        Label emailLabel=new Label("Email:");
        grid.add(emailLabel,0,3);
        emailField=new TextField();
        emailField.setPromptText("Email");
        grid.add(emailField,1,3); // column,row

        Label phoneLabel=new Label("Phone #:");
        grid.add(phoneLabel,0,4);
        phoneField=new TextField();
        phoneField.setPromptText("000-000-000");
        grid.add(phoneField,1,4); // column,row

        Label dobLabel=new Label("Date of Birth:");
        grid.add(dobLabel,0,5);

        DatePicker datePicker=new DatePicker();

        datePicker.setOnAction(event -> {
            LocalDate date=datePicker.getValue();

        });
        grid.add(datePicker,1,5);


        //add a button
        Button addButton=new Button("Register");//label
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String username =usernameField.getText();
                String name=nameField.getText();
                String email=emailField.getText();
                String phone=phoneField.getText();

                System.out.println(username);
                System.out.println(name);
                System.out.println(email);
                System.out.println(phone);
            }
        });
        grid.add(addButton,1,6);

        BorderPane layout = new BorderPane();
        layout.setCenter(grid);

        Scene scene = new Scene(layout,600,600);
        primaryStage.setScene(scene);




        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
