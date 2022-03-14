/* 
* JavaFX Opening Guilford Web browser
 */
package com.mycompany.hyperlinkbrowser;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author bousabacw
 */
public class JavaFXHyperlink extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX HyperLink & Web Browser");

        Hyperlink link = new Hyperlink("Click Me!");
        link.setOnAction(e -> {
            WebView web = new WebView();
            web.getEngine().load("http://www.guilford.edu/");
            Stage stage1 = new Stage();
            Scene scene1 = new Scene(web);
            stage1.setScene(scene1);
            stage1.setTitle("JavaFX Opening Guilford Webpage");
            stage1.show();
            System.out.println("The Hyperlink was clicked!");
        });

        VBox vBox = new VBox(link);
        Scene scene = new Scene(vBox, 960, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}