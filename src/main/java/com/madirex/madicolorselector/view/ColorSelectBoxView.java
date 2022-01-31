package com.madirex.madicolorselector.view;

import com.madirex.madicolorselector.controller.ColorSelectBoxController;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class ColorSelectBoxView extends HBox {
    private int type;
    private Slider slider;
    private Label nameLabel;
    private Label valueLabel;

    public Slider getSlider(){
        return slider;
    }

    public ColorSelectBoxView(int type){
        this.type = type;
        createItems();
        addItems();
        new ColorSelectBoxController(slider, valueLabel);

        this.slider.setMinHeight(20);
        this.valueLabel.setFont(new Font("Arial Black", 20));
        this.nameLabel.setFont(new Font("Arial Black", 20));
        this.setAlignment(Pos.CENTER);
    }

    private void addItems() {
        this.getChildren().addAll(nameLabel, slider, valueLabel);
    }

    private void createItems() {
        //Asignar tipo
        String stringName;

        if (this.type == 0){
            stringName = "Rojo";
        }else if (this.type == 1){
            stringName = "Verde";
        }else{
            stringName = "Azul";
        }

        this.nameLabel = new Label(stringName);
        this.slider = new Slider();
        this.slider.setMax(255);
        this.valueLabel = new Label();
    }

}
