import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AQ_JavaFX extends Application {

    @Override
    public void start(Stage test) {
        Button button = new Button("Click");

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 200);

        test.setScene(scene);
        test.setTitle("Clicking program");
        test.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}