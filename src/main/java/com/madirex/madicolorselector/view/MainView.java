package com.madirex.madicolorselector.view;

import com.madirex.madicolorselector.controller.MainController;
import javafx.scene.layout.VBox;

public class MainView extends VBox {
    private static MainView mainViewInstance;
    private ColorPreviewView colorPreview;
    private ColorSelectBoxView red;
    private ColorSelectBoxView green;
    private ColorSelectBoxView blue;

    private MainView() {
        createItems();
        this.getChildren().addAll(colorPreview, red, green, blue);
        this.setPrefSize(400,400);
    }

    public static MainView getInstance() {
        if (mainViewInstance == null) {
            mainViewInstance = new MainView();
        }
        return mainViewInstance;
    }

    private void createItems() {
        this.colorPreview = new ColorPreviewView(500,300);
        this.red = new ColorSelectBoxView(0);
        this.green = new ColorSelectBoxView(1);
        this.blue = new ColorSelectBoxView(2);
        new MainController(this, this.colorPreview, this.red, this.green, this.blue);
    }
}
