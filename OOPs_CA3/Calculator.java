package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    @Override
    public void start(Stage stage) {
        TextField number1Field = new TextField();
        TextField number2Field = new TextField();
        Button computeButton = new Button("Compute");

        // Set calculator image on the button
       // ImageView calculatorImage = new ImageView(new Image("path/to/calculator.png"));
       // calculatorImage.setFitWidth(20);
        //calculatorImage.setFitHeight(20);
      //  computeButton.setGraphic(calculatorImage);

        Canvas canvas = new Canvas(200, 150);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        computeButton.setOnAction(e -> {
            double num1 = Double.parseDouble(number1Field.getText());
            double num2 = Double.parseDouble(number2Field.getText());

            double sum = num1 + num2;
            double product = num1 * num2;
            double difference = num1 - num2;
            double quotient = num2 != 0 ? num1 / num2 : Double.POSITIVE_INFINITY;

            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            gc.fillText("Sum: " + sum, 10, 20);
            gc.fillText("Product: " + product, 10, 40);
            gc.fillText("Difference: " + difference, 10, 60);
            gc.fillText("Quotient: " + quotient, 10, 80);
        });

        VBox root = new VBox(10, number1Field, number2Field, computeButton, canvas);
        Scene scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
