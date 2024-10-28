package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ScrollingTextApp extends Application {
    @Override
    public void start(Stage stage) {
        Text message = new Text("Scrolling Message!");
        RadioButton leftToRight = new RadioButton("Left to Right");
        RadioButton rightToLeft = new RadioButton("Right to Left");

        ToggleGroup directionGroup = new ToggleGroup();
        leftToRight.setToggleGroup(directionGroup);
        rightToLeft.setToggleGroup(directionGroup);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(20), event -> {
            if (leftToRight.isSelected()) {
                message.setTranslateX(message.getTranslateX() + 1);
            } else if (rightToLeft.isSelected()) {
                message.setTranslateX(message.getTranslateX() - 1);
            }
            if (message.getTranslateX() > 300 || message.getTranslateX() < -300) {
                message.setTranslateX(-300);
            }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        VBox root = new VBox(10, leftToRight, rightToLeft, message);
        Scene scene = new Scene(root, 400, 200);
        stage.setScene(scene);
        stage.setTitle("Scrolling Text");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

