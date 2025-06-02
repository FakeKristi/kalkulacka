package com.example.novakalkulacka;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class Click implements EventHandler<ActionEvent> {
    private String button;
    private Label label;
    public Click(String button, Label label) {
        this.button = button;
        this.label = label;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String text = label.getText();
        label.setText(text + button);
    }
}
