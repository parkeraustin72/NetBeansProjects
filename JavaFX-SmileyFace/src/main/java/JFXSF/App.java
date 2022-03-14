package JFXSF;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import static javafx.scene.paint.Color.*;
import javafx.scene.shape.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        //draw the circle that serves as the face
        Circle c1 = new Circle();
        c1.setCenterX(10);
        c1.setCenterY(20);
        c1.setRadius(85);
        c1.setFill(YELLOW);

        //draw 4 lines that serves as eyes
        Line L1 = new Line(36, 5, 61, 5);
        L1.setRotate(145);
        L1.setFill(GRAY);
        Line L2 = new Line(35, 20, 60, 20);
        L2.setRotate(45);
        L2.setFill(GRAY);

        Line L3 = new Line(-40, 5, -15, 5);
        L3.setRotate(145);
        L3.setFill(GRAY);
        Line L4 = new Line(-40, 20, -16, 20);
        L4.setRotate(145);
        L4.setFill(GRAY);

        //Draw 2 arcs that serve as mouth
        Arc arc1 = new Arc(12, 20, 100, 60, 233, 90);
        arc1.setType(ArcType.CHORD);
        arc1.setFill(GRAY);
        Arc arc2 = new Arc(10, 15, 80, 60, 244, 50);
        arc2.setType(ArcType.CHORD);
        arc2.setFill(PINK);
        
        //Creating a group and adding the shapes to it
        Group grp1 = new Group();
        grp1.getChildren().addAll(c1, L1, L2, L3, L4, arc1, arc2);
        
        Scene scene = new Scene(new BorderPane(grp1), 300, 300);
        stage.setTitle("Smiley Face");
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
