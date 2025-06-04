package com.example.novakalkulacka;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class HelloController {
    @FXML
    private GridPane grid;
    @FXML
    private Label expresion;
    @FXML
    protected void initialize() {
        grid.add(new ButtonFactory().setText("1").setOnAction(new Click("1", expresion)).build(),0, 1);
        grid.add(new ButtonFactory().setText("2").setOnAction(new Click("2", expresion)).build(),1, 1);
        grid.add(new ButtonFactory().setText("3").setOnAction(new Click("3", expresion)).build(),2, 1);
        grid.add(new ButtonFactory().setText("4").setOnAction(new Click("4", expresion)).build(),0, 2);
        grid.add(new ButtonFactory().setText("5").setOnAction(new Click("5", expresion)).build(),1, 2);
        grid.add(new ButtonFactory().setText("6").setOnAction(new Click("6", expresion)).build(),2, 2);
        grid.add(new ButtonFactory().setText("7").setOnAction(new Click("7", expresion)).build(),0, 3);
        grid.add(new ButtonFactory().setText("8").setOnAction(new Click("8", expresion)).build(),1, 3);
        grid.add(new ButtonFactory().setText("9").setOnAction(new Click("9", expresion)).build(),2, 3);
        grid.add(new ButtonFactory().setText("0").setOnAction(new Click("0", expresion)).build(),1, 4);
        grid.add(new ButtonFactory().setText("/").setOnAction(new Click("/", expresion)).build(),3, 0);
        grid.add(new ButtonFactory().setText("*").setOnAction(new Click("*", expresion)).build(),3, 1);
        grid.add(new ButtonFactory().setText("-").setOnAction(new Click("-", expresion)).build(),3, 2);
        grid.add(new ButtonFactory().setText("+").setOnAction(new Click("+", expresion)).build(),3, 3);
        grid.add(new ButtonFactory().setText(",").setOnAction(new Click(",", expresion)).build(),2, 4);
        grid.add(new ButtonFactory().setText("=").setOnAction(this::eval).build(),3, 4);
        grid.add(new ButtonFactory().setText("c").setOnAction(this::clear).build(),0, 0);
    }
    private void clear(ActionEvent actionEvent) {
        expresion.setText("");
    }

    private void eval(ActionEvent actionEvent) {
        String result = "error";
        try {
            result = String.valueOf(Kalkulacka.eval(expresion.getText()));
        } catch (IllegalArgumentException e) {
            result = e.getMessage();
        }
        expresion.setText(result);
    }
}