package com.example.simpleconvertor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField input;

    @FXML
    private Label output;

    @FXML
    void convertMeter(ActionEvent event) {

        try {
            Double number = Double.parseDouble(input.getText());
            output.setText(String.valueOf(number*1000));
        }

        catch (NumberFormatException e) {
            output.setText("Enter a number!");
        }

    }


    @FXML
    void convertKilometer(ActionEvent event) {

        try {
            Double number = Double.parseDouble(input.getText());
            output.setText(String.valueOf(number/1000));
        }

        catch (NumberFormatException e) {
            output.setText("Enter a number!");
        }

    }


    @FXML
    void convertVolume(ActionEvent event) {

        try {
            Double number = Double.parseDouble(input.getText());
            output.setText(String.valueOf(number*number*number));
        }

        catch (NumberFormatException e) {
            output.setText("Enter a number!");
        }

    }

    @FXML
    void convertCelcius(ActionEvent event) {

        try {
            Double number = Double.parseDouble(input.getText());
            output.setText(String.valueOf(((number-32)*5)/9));
        }

        catch (NumberFormatException e) {
            output.setText("Enter a number!");
        }

    }


    @FXML
    void convertFarenheit(ActionEvent event) {

        try {
            Double number = Double.parseDouble(input.getText());
            output.setText(String.valueOf(((9*number)/5)+32));
        }

        catch (NumberFormatException e) {
            output.setText("Enter a number!");
        }

    }


    @FXML
    void convertInr(ActionEvent event) {

        try {
            Double number = Double.parseDouble(input.getText());
            output.setText(String.valueOf(number*0.37));
        }

        catch (NumberFormatException e) {
            output.setText("Enter a number!");
        }

    }





    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
