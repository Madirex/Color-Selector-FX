package com.madirex.madicolorselector.controller;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class ColorSelectBoxController {
    private Slider slider;
    private Label valueLabel;
    private IntegerProperty value;

    public ColorSelectBoxController(Slider slider, Label valueLabel) {
        this.slider = slider;
        this.valueLabel = valueLabel;
        this.value = new SimpleIntegerProperty();

        createBinds();
    }

    private void createBinds(){
        this.value.bind(slider.valueProperty());
        valueLabel.textProperty().bind(this.value.asString());
    }
}
