package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Lab11_1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a Label with the specified message
        Label label = new Label("Welcome to JavaFX programming");
        label.setTextFill(Color.MAGENTA);  // Set the text color to Magenta

        // Create a FlowPane with horizontal and vertical gaps
        FlowPane pane = new FlowPane();
        pane.setHgap(10);  // Horizontal gap between elements
        pane.setVgap(10);  // Vertical gap between elements
        pane.getChildren().add(label);

        // Set the Scene with specified dimensions
        Scene scene = new Scene(pane, 500, 200);
        
        // Set up the Stage
        primaryStage.setTitle("This is the first JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
