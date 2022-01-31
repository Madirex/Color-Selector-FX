package com.madirex.madicolorselector.controller;

import com.madirex.madicolorselector.view.ColorPreviewView;
import com.madirex.madicolorselector.view.ColorSelectBoxView;
import com.madirex.madicolorselector.view.MainView;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.control.Slider;

public class MainController {
    private MainView mainView;
    private ColorPreviewView colorView;
    private Slider redSlider;
    private Slider greenSlider;
    private Slider blueSlider;
    private DoubleProperty width;
    private DoubleProperty height;

    public MainController(MainView mainView, ColorPreviewView colorPreview, ColorSelectBoxView red, ColorSelectBoxView green, ColorSelectBoxView blue) {
        this.mainView = mainView;
        this.colorView = colorPreview;
        this.redSlider = red.getSlider();
        this.greenSlider = green.getSlider();
        this.blueSlider = blue.getSlider();
        this.width = new SimpleDoubleProperty();
        this.height = new SimpleDoubleProperty();
        addListeners();
        addBinds();
    }

    private void addBinds() {
        this.width.bind(mainView.widthProperty());
        this.height.bind(mainView.heightProperty());
        this.colorView.prefWidthProperty().bind(width);
        this.colorView.prefHeightProperty().bind(height);
    }

    private void addListeners() {
        this.redSlider.valueProperty().addListener((observableValue, number, t1) -> updateColor());
        this.greenSlider.valueProperty().addListener((observableValue, number, t1) -> updateColor());
        this.blueSlider.valueProperty().addListener((observableValue, number, t1) -> updateColor());
    }

    private void updateColor(){
        colorView.updateView((int) Math.round(redSlider.getValue()),
                (int) Math.round(greenSlider.getValue()),(int) Math.round(blueSlider.getValue()));
    }

}
