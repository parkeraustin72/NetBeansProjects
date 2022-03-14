package com.mycompany.temp;



import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import java.util.Random;

import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws FileNotFoundException {

        int[] unSorted = new int[10];
        final TextField[][] arrayFields = {new TextField[10]};

        QuickSort newQuickSort = new QuickSort();
        MergeSort newMergeSort = new MergeSort();
        SelectionSort newSelectionSort = new SelectionSort();
        InsertionSort newInsertionSort = new InsertionSort();
        BubbleSort newBubbleSort = new BubbleSort();


        TabPane tabPane = new TabPane();

        // add tabs here
        Random rand = new Random();

        Tab introTab = new Tab("Sorting Intro", new Label("Sorting Intro"));
        Tab bubbleTab = new Tab("Bubble Sort", new Label("Bubble Sort Description: " + "\n" + "Bubble Sort is the simplest sorting algorithm that works" +
                "by repeatedly swapping the adjacent elements if they are in wrong order."));
        Tab selectionTab = new Tab("Selection Sort", new Label("Show all boats available"));
        Tab InsertionSort = new Tab("Insertion Sort", new Label("Insertion Sort"));
        Tab mergeSort = new Tab("Merge Sort", new Label("Merge Sort"));
        Tab QuickSort = new Tab("Quick Sort", new Label("Quick Sort"));

        tabPane.getTabs().add(introTab);
        tabPane.getTabs().add(bubbleTab);
        tabPane.getTabs().add(selectionTab);
        tabPane.getTabs().add(InsertionSort);
        tabPane.getTabs().add(mergeSort);
        tabPane.getTabs().add(QuickSort);

        //Intro tab Compnents


        // Bubble textfield
        TextField bubblefield1 = new TextField();
        bubblefield1.setMaxWidth(135);
        TextField bubblefield2 = new TextField();
        bubblefield2.setMaxWidth(135);
        TextField bubblefield3 = new TextField();
        bubblefield3.setMaxWidth(135);
        TextField bubblefield4 = new TextField();
        bubblefield4.setMaxWidth(135);
        TextField bubblefield5 = new TextField();
        bubblefield5.setMaxWidth(135);
        TextField bubblefield6 = new TextField();
        bubblefield6.setMaxWidth(135);
        TextField bubblefield7 = new TextField();
        bubblefield7.setMaxWidth(135);
        TextField bubblefield8 = new TextField();
        bubblefield8.setMaxWidth(135);
        TextField bubblefield9 = new TextField();
        bubblefield9.setMaxWidth(135);
        TextField bubblefield10 = new TextField();
        bubblefield10.setMaxWidth(135);

        Button bubblebtn = new Button("Start Sort");
        Button bubblebtn1 = new Button("Clear Numbers");
        Button bubblebtn2 = new Button("Generate Random Numbers");
        Button bubblebtn3 = new Button("Btn1");

        //Selection Text Field
        TextField selectionfield1 = new TextField();
        selectionfield1.setMaxWidth(135);
        TextField selectionfield2 = new TextField();
        selectionfield2.setMaxWidth(135);
        TextField selectionfield3 = new TextField();
        selectionfield3.setMaxWidth(135);
        TextField selectionfield4 = new TextField();
        selectionfield4.setMaxWidth(135);
        TextField selectionfield5 = new TextField();
        selectionfield5.setMaxWidth(135);
        TextField selectionfield6 = new TextField();
        selectionfield6.setMaxWidth(135);
        TextField selectionfield7 = new TextField();
        selectionfield7.setMaxWidth(135);
        TextField selectionfield8 = new TextField();
        selectionfield8.setMaxWidth(135);
        TextField selectionfield9 = new TextField();
        selectionfield9.setMaxWidth(135);
        TextField selectionfield10 = new TextField();
        selectionfield10.setMaxWidth(135);

        Button selecbtn = new Button("Start Sort");
        Button selecbtn1 = new Button("Clear Numbers");
        Button selecbtn2 = new Button("Generate Random Numbers");
        Button selecbtn3 = new Button("Btn1");


        //Insertion text field
        TextField insf1 = new TextField();
        insf1.setMaxWidth(135);
        TextField insf2 = new TextField();
        insf2.setMaxWidth(135);
        TextField insf3 = new TextField();
        insf3.setMaxWidth(135);
        TextField insf4 = new TextField();
        insf4.setMaxWidth(135);
        TextField insf5 = new TextField();
        insf5.setMaxWidth(135);
        TextField insf6 = new TextField();
        insf6.setMaxWidth(135);
        TextField insf7 = new TextField();
        insf7.setMaxWidth(135);
        TextField insf8 = new TextField();
        insf8.setMaxWidth(135);
        TextField insf9 = new TextField();
        insf9.setMaxWidth(135);
        TextField insf10 = new TextField();
        insf10.setMaxWidth(135);

        Button insbtn = new Button("Start Sort");
        Button insbtn1 = new Button("Clear Numbers");
        Button insbtn2 = new Button("Generate Random Numbers");
        Button insbtn3 = new Button("Btn1");


        // merge Text field
        TextField mgf1 = new TextField();
        mgf1.setMaxWidth(135);
        TextField mgf2 = new TextField();
        mgf2.setMaxWidth(135);
        TextField mgf3 = new TextField();
        mgf3.setMaxWidth(135);
        TextField mgf4 = new TextField();
        mgf4.setMaxWidth(135);
        TextField mgf5 = new TextField();
        mgf5.setMaxWidth(135);
        TextField mgf6 = new TextField();
        mgf6.setMaxWidth(135);
        TextField mgf7 = new TextField();
        mgf7.setMaxWidth(135);
        TextField mgf8 = new TextField();
        mgf8.setMaxWidth(135);
        TextField mgf9 = new TextField();
        mgf9.setMaxWidth(135);
        TextField mgf10 = new TextField();
        mgf10.setMaxWidth(135);

        Button mgfbtn = new Button("Start Sort");
        Button mgfbtn1 = new Button("Clear Numbers");
        Button mgfbtn2 = new Button("Generate Random Numbers");
        Button mgfbtn3 = new Button("Btn1");

        // quicksort Text fields
        TextField quickfield1 = new TextField();
        quickfield1.setMaxWidth(135);
        TextField quickfield2 = new TextField();
        quickfield2.setMaxWidth(135);
        TextField quickfield3 = new TextField();
        quickfield3.setMaxWidth(135);
        TextField quickfield4 = new TextField();
        quickfield4.setMaxWidth(135);
        TextField quickfield5 = new TextField();
        quickfield5.setMaxWidth(135);
        TextField quickfield6 = new TextField();
        quickfield6.setMaxWidth(135);
        TextField quickfield7 = new TextField();
        quickfield7.setMaxWidth(135);
        TextField quickfield8 = new TextField();
        quickfield8.setMaxWidth(135);
        TextField quickfield9 = new TextField();
        quickfield9.setMaxWidth(135);
        TextField quickfield10 = new TextField();
        quickfield10.setMaxWidth(135);

        Button quickbtn = new Button("Start Sort");
        Button quickbtn1 = new Button("Clear Numbers");
        Button quickbtn2 = new Button("Generate Random Numbers");
        Button quickbtn3 = new Button("Btn1");

        // Intro Tab content
        FlowPane intropane = new FlowPane();
        introTab.setContent(intropane);

        //Bubble Tab Content
        Label bubbleLabel = new Label();
        bubbleLabel.setMinSize(150, 400);
        bubbleLabel.setPadding(new Insets(0, 0, 0, 550));
        FlowPane bubblepane = new FlowPane();
        HBox bubblebuttons = new HBox(bubblebtn, bubblebtn1, bubblebtn2);
        HBox Hbubble = new HBox(bubblefield1, bubblefield2, bubblefield3, bubblefield4, bubblefield5, bubblefield6, bubblefield7, bubblefield8, bubblefield9, bubblefield10);
        Hbubble.setPadding(new Insets(100, 0, 0, 0));
        bubblebuttons.setPadding(new Insets(50, 0, 0, 450));
        VBox bubbleVbox = new VBox(Hbubble, bubblebuttons, bubbleLabel);
        bubblepane.getChildren().addAll(bubbleVbox);
        bubbleTab.setContent(bubblepane);

        bubblebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                arrayFields[0] = Hbubble.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    String text = arrayFields[0][i].getText();
                    int myInt = Integer.parseInt(text);
                    unSorted[i] = myInt;
                }
                String bubbleSortVisualization = BubbleSort.bubble_srt(unSorted);
                bubbleLabel.setText(bubbleSortVisualization);
            }
        });

        bubblebtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = Hbubble.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    arrayFields[0][i].clear();
                    bubbleLabel.setText("");
                }
            }
        });

        bubblebtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = Hbubble.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    int tempint = rand.nextInt(10000);
                    arrayFields[0][i].setText(String.valueOf(tempint));
                }
            }
        });

        //Selection Tab Content
        Label selectLabel = new Label();
        selectLabel.setMinSize(150, 400);
        selectLabel.setPadding(new Insets(0, 0, 0, 550));
        FlowPane selectionpane = new FlowPane();
        HBox selec = new HBox(selectionfield1, selectionfield2, selectionfield3, selectionfield4, selectionfield5, selectionfield6, selectionfield7, selectionfield8, selectionfield9, selectionfield10);
        HBox selectionbuttons = new HBox(selecbtn, selecbtn1, selecbtn2);
        selectionpane.getChildren().addAll(selec, selectionbuttons, selectLabel);
        selectionTab.setContent(selectionpane);
        selec.setPadding(new Insets(100, 0, 0, 0));
        selectionbuttons.setPadding(new Insets(50, 0, 0, 450));

        selecbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                arrayFields[0] = selec.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    String text = arrayFields[0][i].getText();
                    int myInt = Integer.parseInt(text);
                    unSorted[i] = myInt;
                    
                }
                
                String selecSortVisualization = SelectionSort.SelectionSrt(unSorted);
                selectLabel.setText(selecSortVisualization);
            }
        });

        selecbtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = selec.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    arrayFields[0][i].clear();
                    selectLabel.setText("");
                }
            }
        });

        selecbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = selec.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    int tempint = rand.nextInt(10000);
                    arrayFields[0][i].setText(String.valueOf(tempint));
                }
            }
        });

        //Insertion Tab Content
        Label insertLabel = new Label();
        insertLabel.setMinSize(150, 400);
        insertLabel.setPadding(new Insets(0, 0, 0, 550));
        FlowPane insertpane = new FlowPane();
        HBox insert = new HBox(insf1, insf2, insf3, insf4, insf5, insf6, insf7, insf8, insf9, insf10);
        HBox insertbuttons = new HBox(insbtn, insbtn1, insbtn2);
        insertpane.getChildren().addAll(insert, insertbuttons, insertLabel);
        insert.setPadding(new Insets(100, 0, 0, 0));
        insertbuttons.setPadding(new Insets(50, 0, 0, 450));
        InsertionSort.setContent(insertpane);

        insbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                arrayFields[0] = insert.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    String text = arrayFields[0][i].getText();
                    int myInt = Integer.parseInt(text);
                    unSorted[i] = myInt;
                }
                String insertVisuals = newInsertionSort.InsertionSrt(unSorted);
                insertLabel.setText(insertVisuals);
            }
        });

        insbtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = insert.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    arrayFields[0][i].clear();
                    insertLabel.setText("");
                }
            }
        });

        insbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = insert.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    int tempint = rand.nextInt(10000);
                    arrayFields[0][i].setText(String.valueOf(tempint));
                }
            }
        });

        //mergesort content 
        Label mergeLabel = new Label();
        Image image = new Image(new FileInputStream("Merge-sort-example-300px.gif"));
        ImageView imageView = new ImageView(image);
        imageView.setX(200);
        imageView.setY(300);
        imageView.setPreserveRatio(true);
        mergeLabel.setMinSize(150, 400);
        mergeLabel.setPadding(new Insets(0, 0, 0, 550));
        FlowPane mergepane = new FlowPane();
        HBox merge = new HBox(mgf1, mgf2, mgf3, mgf4, mgf5, mgf6, mgf7, mgf8, mgf9, mgf10);
        HBox mergebuttons = new HBox(mgfbtn, mgfbtn1, mgfbtn2);
        merge.setPadding(new Insets(100, 0, 0, 0));
        mergebuttons.setPadding(new Insets(50, 0, 0, 450));
        mergepane.getChildren().addAll(merge, mergebuttons, mergeLabel, imageView);
        mergeSort.setContent(mergepane);

         mgfbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                arrayFields[0] = merge.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    String text = arrayFields[0][i].getText();
                    int myInt = Integer.parseInt(text);
                    unSorted[i] = myInt;
                }
                MergeSort.mergeSort(unSorted);
                String mergevisual = MergeSort.mergeSort(unSorted);
                mergeLabel.setText(mergevisual);
               
               
            }
        });

        mgfbtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = merge.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    arrayFields[0][i].clear();
                }
            }
        });

        mgfbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = merge.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    int tempint = rand.nextInt(10000);
                    arrayFields[0][i].setText(String.valueOf(tempint));
                }
            }
        });

        // Quick sort content
        FlowPane quickpane = new FlowPane();
        HBox quick = new HBox(quickfield1, quickfield2, quickfield3, quickfield4, quickfield5, quickfield6, quickfield7, quickfield8, quickfield9, quickfield10);
        HBox quickbtns = new HBox(quickbtn, quickbtn1, quickbtn2);
        quickpane.getChildren().addAll(quick, quickbtns);
        quick.setPadding(new Insets(100, 0, 0, 0));
        quickbtns.setPadding(new Insets(50, 0, 0, 450));
        QuickSort.setContent(quickpane);

        quickbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                arrayFields[0] = quick.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    String text = arrayFields[0][i].getText();
                    int myInt = Integer.parseInt(text);
                    unSorted[i] = myInt;
                }
                newQuickSort.sort(unSorted);
            }
        });

        quickbtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = quick.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    arrayFields[0][i].clear();
                }
            }
        });

        quickbtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrayFields[0] = quick.getChildren().toArray(new TextField[0]);
                for (int i = 0; i < 10; i++) {
                    int tempint = rand.nextInt(10000);
                    arrayFields[0][i].setText(String.valueOf(tempint));
                }
            }
        });

        VBox vBox = new VBox(tabPane);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.setWidth(1350);
        primaryStage.setHeight(800);
        primaryStage.setTitle("Sorting Program");

        primaryStage.show();
    }
}