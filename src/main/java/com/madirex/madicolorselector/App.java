package com.madirex.madicolorselector;

import com.madirex.madicolorselector.view.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(MainView.getInstance());
        stage.setTitle("MadiColorSelector");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}