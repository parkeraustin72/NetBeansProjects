package JFXTFE;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        InitUI(stage); // Init = initialize user interface

    }

    private void InitUI(Stage stage) {
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(5);
        root.setPadding(new Insets(10));

        Label lbl1 = new Label("_Name:");
        Label lbl2 = new Label("_Address:");
        Label lbl3 = new Label("_Occupation:");

        TextField field1 = new TextField();
        TextField field2 = new TextField();
        TextField field3 = new TextField();

        lbl1.setLabelFor(field1);
        lbl1.setMnemonicParsing(true);

        lbl2.setLabelFor(field2);
        lbl2.setMnemonicParsing(true);

        lbl3.setLabelFor(field3);
        lbl3.setMnemonicParsing(true);

        root.add(lbl1, 0, 0);
        root.add(field1, 2, 0);

        root.add(lbl2, 0, 1);
        root.add(field2, 2, 1);

        root.add(lbl3, 0, 2);
        root.add(field3, 2, 2);

        GridPane.setHalignment(lbl1, HPos.RIGHT);
        GridPane.setHalignment(lbl2, HPos.RIGHT);
        GridPane.setHalignment(lbl3, HPos.RIGHT);

        Scene scene = new Scene(root);
        
        stage.setTitle("Text Field Example");
        stage.setScene(scene);
        stage.show();
        
        TextField textField = new TextField();
        textField.textProperty().addListener(
                (observable, oldValue, newValue)->
                {System.out.println("textField changed from "
                        +oldValue + " to " + newValue);
                        });
        
        field1.textProperty().addListener(
                (observable, oldValue, newValue)->
                {System.out.println("Field1 changed from "
                        +oldValue + " to " + newValue);
                        });
        
        field2.textProperty().addListener(
                (observable, oldValue, newValue)->
                {System.out.println("Field2 changed from "
                        +oldValue + " to " + newValue);
                        });
        
        field3.textProperty().addListener(
                (observable, oldValue, newValue)->
                {System.out.println("Field3 changed from "
                        +oldValue + " to " + newValue);
                        });
                        

    }

    public static void main(String[] args) {
        launch();
    }

}
