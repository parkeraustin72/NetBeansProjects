package ITjavaFX1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Drawing Some Basic Shapes");
        Group root = new Group();
        
       Canvas canvas = new Canvas (300, 250);
       GraphicsContext gc = canvas.getGraphicsContext2D();
       drawShapes(gc);
       root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.show();
    }
    
    private void drawShapes(GraphicsContext gc){
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[] {10,40,10,40},
                new double[] {210,210,240,240}, 4);
        gc.strokePolygon(new double[] {60,90,60,90},
                new double[] {210,210,240,240}, 4);
        gc.strokePolyline(new double[] {60,90,60,90},
                new double[] {210,210,240,240}, 4);
    }

    public static void main(String[] args) {
        launch();
    }

}