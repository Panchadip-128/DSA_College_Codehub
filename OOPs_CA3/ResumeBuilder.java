package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ResumeBuilder extends Application {
    @Override
    public void start(Stage stage) {
        TextField nameField = new TextField();
        TextField emailField = new TextField();
        TextField contactField = new TextField();

        CheckBox englishCheckBox = new CheckBox("English");
        CheckBox frenchCheckBox = new CheckBox("French");
        CheckBox spanishCheckBox = new CheckBox("Spanish");

        Button submitButton = new Button("Submit");
        Canvas canvas = new Canvas(300, 200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        submitButton.setOnAction(e -> {
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            gc.fillText("Name: " + nameField.getText(), 10, 20);
            gc.fillText("Email: " + emailField.getText(), 10, 40);
            gc.fillText("Contact: " + contactField.getText(), 10, 60);
            gc.fillText("Languages: ", 10, 80);

            if (englishCheckBox.isSelected()) gc.fillText("English", 20, 100);
            if (frenchCheckBox.isSelected()) gc.fillText("French", 20, 120);
            if (spanishCheckBox.isSelected()) gc.fillText("Spanish", 20, 140);
        });

        VBox root = new VBox(10, nameField, emailField, contactField, englishCheckBox, frenchCheckBox, spanishCheckBox, submitButton, canvas);
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Resume Builder");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
