package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Lab11_3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Button signInButton = new Button("Sign in");
        Label messageLabel = new Label();

        signInButton.setOnAction(e -> {
            String username = usernameField.getText();
            messageLabel.setText("Welcome " + username);
        });

        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(usernameField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(signInButton, 1, 2);
        gridPane.add(messageLabel, 1, 3);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("Login Window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
