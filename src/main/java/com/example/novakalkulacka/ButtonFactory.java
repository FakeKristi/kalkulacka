package com.example.novakalkulacka;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonFactory {
    private Button button = new Button();

    public ButtonFactory setText(String text) {
        this.button.setText(text);
        return this;
    }
    public ButtonFactory setOnAction(EventHandler<ActionEvent> event) {
        this.button.setOnAction(event);
        return this;
    }

    public Button build() {
        return this.button;
    }
}
