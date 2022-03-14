

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX 
 */
public class App extends Application {
static Pane pane;
    @Override
    public void start(Stage stage) {
        stage.setTitle("Bruh");
        String javaVersion = SystemInfo.javaVersion();
        String javafxVersion = SystemInfo.javafxVersion();

        Label label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Button button = new Button("Bruh");
        button.setOnAction(MediaGame.startMediaGame);

        pane = new Pane();
        pane.getChildren().addAll(label, button);
        
        Scene scene = new Scene(pane, 640, 480);
        stage.setScene(scene);
        stage.show();
        
    }

    public static void main(String[] args) {
        launch();
        //ClipPlay.playSound("PictionaryMusicW.wav");
    }

}