package ITJFXButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
      Button btn = new Button("---Button---");
      Label lbl = new Label("button not selected");
      
      btn.setOnAction(new EventHandler<ActionEvent>(){
          int i = 0;
          public void handle (ActionEvent event){
              System.out.println("Hello JavaFX");
              i+=1;
              lbl.setText("Button selected: (" + i + ").");
          }
      });
      
      TilePane root = new TilePane();
      root.getChildren().add(btn);
     
      root.getChildren().add(lbl);
        
      Scene scene = new Scene (root, 300, 250);
        stage.setTitle("JavaFX Button Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}