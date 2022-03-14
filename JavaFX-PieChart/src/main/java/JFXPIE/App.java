package JFXPIE;

import java.awt.Color;
import java.awt.Graphics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import javafx.stage.Stage;
import javax.swing.JApplet;
import javax.swing.text.StyleConstants;
import static javafx.application.Application.launch;
import java.applet.Applet;

/**
 * JavaFX App
 */
public class App extends JApplet {

    public void paint(Graphics page) {
        final int DEGREES_IN_CIRCLE = 360;
        final int APPLET_WIDTH = 600;
        final int APPLET_HEIGHT = 400;

        int x, y; // Corner point for the pie chart
        int diameter; // Diamater of the pie chart
        int startAngle; // Starting angle for the pie slice
        int arcAngle; // arc angle for the pie slice

        diameter = 200;
        x = (APPLET_WIDTH - diameter) / 2;
        y = (APPLET_HEIGHT - diameter) / 2;

        setBackground(Color.WHITE);

        //rent and utilities slice
        page.setColor(Color.BLUE);
        startAngle = 0;
        arcAngle = (int) (0.35 * DEGREES_IN_CIRCLE);
        page.fillArc(x, y, diameter, diameter, startAngle, arcAngle);
        page.drawString("Rent and Utilities(35%)", x + diameter - 15, y + 30);

        //transportation slice
        page.setColor(Color.GREEN);
        startAngle = startAngle + arcAngle;
        arcAngle = (int) (0.15 * DEGREES_IN_CIRCLE);
        page.fillArc(x, y, diameter, diameter, startAngle, arcAngle);
        page.drawString("Transportation(15%)", x - 120, y + 50);

        //food slice
        page.setColor(Color.CYAN);
        startAngle = startAngle + arcAngle;
        arcAngle = (int) (0.15 * DEGREES_IN_CIRCLE);
        page.fillArc(x, y, diameter, diameter, startAngle, arcAngle);
        page.drawString("Food(15%)", x - 70, y + 140);

        //education
         page.setColor(Color.RED);
        startAngle = startAngle + arcAngle;
        arcAngle = (int) (0.25 * DEGREES_IN_CIRCLE);
        page.fillArc(x, y, diameter, diameter, startAngle, arcAngle);
        page.drawString("Education(25%)", x +100, y + 20);
        // misc slice
        page.setColor(Color.ORANGE);
        startAngle = startAngle + arcAngle;
        arcAngle = (int) (0.10 * DEGREES_IN_CIRCLE);
        page.fillArc(x, y, diameter, diameter, startAngle, arcAngle);
        page.drawString("MISC(10%)", x +diameter, y + 150);
      
    }

    public static void main(String[] args) {
        launch(args);
    }

}
