package com.mycompany.javafx.tabexample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 250, Color.WHITE);
        TabPane tabPane = new TabPane();
        BorderPane borderPane = new BorderPane();
        for (int i = 1; i < 6; i++) {
            Tab tab = new Tab();
            tab.setGraphic(new Circle(0, 0, 10));
            tab.setText("Tab " + i);

            tabPane.getTabs().add(tab);

        }

        borderPane.prefHeightProperty().bind(scene.heightProperty());
        borderPane.prefWidthProperty().bind(scene.widthProperty());
        borderPane.setCenter(tabPane);

        root.getChildren().add(borderPane);
        stage.setScene(scene);
        stage.show();
    }
    //bind to take available space

    public static void main(String[] args) {
        launch();
    }

}
