package ITJFXMenu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX Menus Example");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 350, 250, Color.WHITE);

        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(stage.widthProperty());
        root.setTop(menuBar);

        //File menu: new, open, save, exit
        Menu fileMenu = new Menu("_File");
        fileMenu.setMnemonicParsing(true);
        fileMenu.setAccelerator(new KeyCodeCombination(KeyCode.F, KeyCombination.SHORTCUT_DOWN));
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem openMenuItem = new MenuItem("Open");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem exitMenuItem = new MenuItem("exit");
        exitMenuItem.setOnAction(actionEvent->Platform.exit());
                
        fileMenu.getItems().addAll(newMenuItem, openMenuItem,saveMenuItem, 
                new SeparatorMenuItem(), exitMenuItem);
        
        Menu webMenu = new Menu("WebMenu");
        CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
        htmlMenuItem.setSelected(true);
        webMenu.getItems().add(htmlMenuItem);
        
        CheckMenuItem cssMenuItem = new CheckMenuItem("CSS");
        htmlMenuItem.setSelected(true);
        webMenu.getItems().add(cssMenuItem);
        
        Menu sqlMenu = new Menu("SQL");
        ToggleGroup tGroup = new ToggleGroup();
        RadioMenuItem mysqlItem = new RadioMenuItem("MySQL");
        mysqlItem.setToggleGroup(tGroup);
        
        RadioMenuItem oracleItem = new RadioMenuItem("MySQL");
        oracleItem.setToggleGroup(tGroup);
        oracleItem.setSelected(true);
        
        sqlMenu.getItems().addAll(mysqlItem, oracleItem, new SeparatorMenuItem());
        
        Menu TutorialMenu = new Menu ("Tutorial");
        TutorialMenu.getItems().addAll(
        new CheckMenuItem("Java"),
        new CheckMenuItem("JavaFX"),
        new CheckMenuItem("Swing"));
        
        sqlMenu.getItems().add(TutorialMenu);
        menuBar.getMenus().addAll(fileMenu, webMenu, sqlMenu);
        
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
