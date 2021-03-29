package cn.edu.ncu.std;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane root= FXMLLoader.load(getClass().getResource("view/main.fxml"));
        primaryStage.setTitle("猜单词");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}