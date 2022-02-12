package ru.github.kreker721425;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import ru.github.kreker721425.elements.MyButton;
import ru.github.kreker721425.elements.MyStage;

import javax.swing.text.html.ImageView;
import java.util.ArrayList;
import java.util.List;

public class Menu extends Application {

    public static final List<ActionEnum> actionStep = new ArrayList<>();

    public static void main(String[] args){
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        MyButton btnOk = new MyButton("Да", 16, 80, 30, 110);
        btnOk.btn.setOnAction(event -> {
            actionStep.add(ActionEnum.OK);
            WindowOne windowOne = new WindowOne();
            windowOne.method(stage);
        });

        MyButton btnNot = new MyButton("Нет", 16, 80, 140, 110);
        btnNot.btn.setOnAction(event -> {
            actionStep.add(ActionEnum.NOT);
            WindowOne windowOne = new WindowOne();
            windowOne.method(stage);
        });

        MyButton btnCancel = new MyButton("", 16, 90, 210, 5);
        Image imageOk = new Image(getClass().getResourceAsStream("ok.png"));
//        btnCancel.btn.graphicProperty().setValue(new ImageView(imageOk));
//        btnCancel.setOnActionExit(stage);
//        btnCancel.btn.setOnAction(event -> {
//            actionStep.add(ActionEnum.CANCEL);
//            WindowOne windowOne = new WindowOne();
//            windowOne.method(stage);
//        });

        BorderPane root = new BorderPane();
        Pane pane = new Pane();
        pane.getChildren().addAll(btnOk.getBtn(),btnNot.getBtn(),btnCancel.getBtn());
        root.setTop(pane);

        Scene scene = new Scene(root, 250, 150, Color.TRANSPARENT);
//        scene.getStylesheets().add(Menu.class.getResource("css/Menu.css").toExternalForm());

        MyStage stg = new MyStage(stage,scene);
        stg.show();
    }
}
