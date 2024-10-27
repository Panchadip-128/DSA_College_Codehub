package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Lab11_2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField inputField = new TextField();
        inputField.setPromptText("Enter an integer");

        Label resultLabel = new Label();

        Button calculateButton = new Button("Show Table");
        calculateButton.setOnAction(e -> {
            try {
                int number = Integer.parseInt(inputField.getText());
                StringBuilder table = new StringBuilder("Multiplication Table:\n");
                for (int i = 1; i <= 10; i++) {
                    table.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
                }
                resultLabel.setText(table.toString());
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid integer.");
            }
        });

        FlowPane pane = new FlowPane(10, 10);  // Setting hgap and vgap
        pane.getChildren().addAll(inputField, calculateButton, resultLabel);

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Multiplication Table");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
