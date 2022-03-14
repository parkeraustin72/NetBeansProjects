

import java.io.File;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class MediaGame {

    private static ImageView upDark, downDark, leftDark, rightDark;
    private ImageView up, down, left, right;
    private VBox upVbox = new VBox(), downVbox = new VBox(), leftVbox = new VBox(), rightVbox = new VBox();
    private HBox Hbox = new HBox();
    private Button start;
    AnchorPane pane = new AnchorPane();
    final int NOTE_SPEED = 1;

    public Pane launchGame() {

        upDark = new ImageView(new Image("file:images/arrowUpDark.png"));
        upDark.setFitWidth(50);
        upDark.setFitHeight(50);
        
        downDark = new ImageView(new Image("file:images/arrowDownDark.png"));
        downDark.setFitWidth(50);
        downDark.setFitHeight(50);
        
        leftDark = new ImageView(new Image("file:images/arrowLeftDark.png"));
        leftDark.setFitWidth(50);
        leftDark.setFitHeight(50);
        
        rightDark = new ImageView(new Image("file:images/arrowRightDark.png"));
        rightDark.setFitWidth(50);
        rightDark.setFitHeight(50);
        
        
        up = new ImageView(new Image("file:images/arrowUp.png"));
        up.setFitWidth(50);
        up.setFitHeight(50);
        down = new ImageView(new Image("file:images/arrowDown.png"));
        down.setFitWidth(50);
        down.setFitHeight(50);
        right = new ImageView(new Image("file:images/arrowRight.png"));
        right.setFitWidth(50);
        right.setFitHeight(50);

        TilePane columns = new TilePane();
        columns.getChildren().addAll(leftDark, upDark, downDark, rightDark);
        columns.setOrientation(Orientation.HORIZONTAL);
        columns.setHgap(30);

        start = new Button("Start");
        start.setOnAction(this::rhythmGameStart);

        pane.getChildren().addAll(columns, start);
        //pane.setBottomAnchor(columns, 5.0);
        
        start.setTranslateX(175);
        start.setTranslateY(200);

        Scene scene = new Scene(pane);

        return pane;
    }

    private void rhythmGameStart(ActionEvent eh) {
        pane.getChildren().remove(start);
        ClipPlay.playSound("Pictionary.wav");
        rhythmGamePlay();
        
    }

    private void createLeftNote() {
        left = new ImageView(new Image("file:images/arrowLeft.png"));
        left.setFitWidth(50);
        left.setFitHeight(50);
        
        left.setTranslateX(leftDark.getLayoutX()); left.setTranslateY(leftDark.getLayoutY());
        pane.getChildren().add(left);
        
        TranslateTransition leftMove = new TranslateTransition();
        leftMove.setDuration(Duration.millis(NOTE_SPEED * 1000));
        leftMove.setToY(leftDark.getLayoutY());
        leftMove.setNode(left);
        leftMove.play();
    }
    
    private void rhythmGamePlay () {
        
        System.out.println("Game starts now");
        createLeftNote();
       
        //MediaPlayer music = new MediaPlayer(new Media("file:music/PictionaryMusicW.mp3"));
        //music.play();
         
    }

    public static EventHandler<ActionEvent> startMediaGame = (ActionEvent eh) -> {
        Pane MediaMiniGame = new MediaGame().launchGame();
        App.pane.getChildren().clear();
        App.pane.getChildren().add(MediaMiniGame);
        
    };

}
