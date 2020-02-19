import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Soha extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        String version = System.getProperty("javafx.version");
        Label label = new Label("Hello from Soha:" + version);
        StackPane Sh = new StackPane();
        Sh.getChildren().addAll(label);
        Scene scene = new Scene(Sh, 480, 640);
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}