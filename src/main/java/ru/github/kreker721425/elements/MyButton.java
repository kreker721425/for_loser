package ru.github.kreker721425.elements;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;

public class MyButton {
    public Button btn = new Button();

    public MyButton(String str, int sizeFont, int prefWidth, int x, int y){

        btn.setText(str);                                     //Установка текста
        btn.setFont(new Font("Arial", sizeFont));       //Настройка шрифта
        btn.setPrefWidth(prefWidth);                          //Размер кнопки
        btn.setLayoutX(x);                                    //Положение по x
        btn.setLayoutY(y);                                    //Положение по y
    }

    public MyButton(Image image, String str, int sizeFont, int prefWidth, int x, int y){
        btn = new Button("", new ImageView(image));
        btn.setText(str);                                     //Установка текста
        btn.setFont(new Font("Arial", sizeFont));       //Настройка шрифта
        btn.setPrefWidth(prefWidth);                          //Размер кнопки
        btn.setLayoutX(x);                                    //Положение по x
        btn.setLayoutY(y);                                    //Положение по y
    }

    public Button getBtn() {
        return btn;
    }

    public void setOnActionExit(Stage stage) {
        btn.setOnAction(event1 -> stage.close());
    }
}
