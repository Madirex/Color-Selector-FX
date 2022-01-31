package com.madirex.madicolorselector.view;

import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class ColorPreviewView extends Label {
    private int width;
    private int height;

    public ColorPreviewView(int width, int height){
        this.width = width;
        this.height = height;
        updateViewSize();
    }

    private void updateViewSize() {
        this.setPrefWidth(width);
        this.setPrefHeight(height);
    }

    public void updateView(int r, int g, int b){
        this.setBackground(new Background(
                new BackgroundFill(Color.rgb(r,g,b),null,null)));
    }
}
