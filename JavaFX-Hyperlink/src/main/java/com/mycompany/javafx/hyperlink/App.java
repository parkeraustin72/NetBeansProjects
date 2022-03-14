package com.mycompany.javafx.hyperlink;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX HyperLink Example");

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        Hyperlink link = new Hyperlink("Click Me!");
        link.setText("http://www.guilford.edu");

        link.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                webEngine.load("http://www.guilford.edu");
            }
        });
        link.setOnAction(e -> {
            System.out.println("The Hyperlink was Clicked!!!");
        });

        VBox vbox = new VBox();
        vbox.getChildren().add(browser);
        Scene scene = new Scene(vbox, 960, 600);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
