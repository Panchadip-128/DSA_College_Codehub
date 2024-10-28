package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class StudentDetailsViewer extends Application {
    @Override
    public void start(Stage stage) {
        Map<String, String> studentDetails = new HashMap<>();
        studentDetails.put("12345", "Student: Alice\nAge: 20\nMajor: CS");
        studentDetails.put("23456", "Student: Bob\nAge: 21\nMajor: Math");
        studentDetails.put("34567", "Student: Carol\nAge: 22\nMajor: Physics");

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll(studentDetails.keySet());

        Canvas canvas = new Canvas(300, 150);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
            if (newValue != null) {
                gc.fillText(studentDetails.get(newValue), 10, 20);
            }
        });

        VBox root = new VBox(10, listView, canvas);
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Student Details Viewer");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
