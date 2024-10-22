package calculadora.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import static calculadora.controller.Conversiones.*;

public class ConversionSistemas {
    @FXML
    public TextField inputText;
    @FXML
    public TextField outputText;

    private Integer inputType;
    private Integer outputType;

    public void setBinIn(ActionEvent actionEvent) {
        this.inputType = 1;
    }

    public void setHexIn(ActionEvent actionEvent) {
        this.inputType = 2;
    }

    public void setDecIn(ActionEvent actionEvent) {
        this.inputType = 3;
    }

    public void setOctIn(ActionEvent actionEvent) {
        this.inputType = 4;
    }
    public void setBinOut(ActionEvent actionEvent) {
        this.outputType = 1;
    }

    public void setHexOut(ActionEvent actionEvent) {
        this.outputType = 2;
    }

    public void setDecOut(ActionEvent actionEvent) {
        this.outputType = 3;
    }

    public void setOctOut(ActionEvent actionEvent) {
        this.outputType = 4;
    }

    public void convertir(ActionEvent actionEvent) {
        if(inputType == 0 || outputType == 0){
            outputText.setText("Ingresa los sistemas de entrada y salida");
        }
        String output = "";
        Integer num = 0;

        switch (inputType){
            case 1:{
                num = binarioADecimal(inputText.getText());
                break;
            }
            case 2:{
                num = hexadecimalADecimal(inputText.getText());
                break;
            }
            case 3:{
                num = Integer.parseInt(inputText.getText());
                break;
            }
            case 4:{
                num = octalADecimal(inputText.getText());
                break;
            }
        }
        switch (outputType){
            case 1:{
                output = decimalABinario(num);
             break;
            }
            case 2:{
                output = decimalAHexadecimal(num);
                break;
            }
            case 3:{
                output = String.valueOf(num);
                break;
            }
            case 4:{
                output = decimalAOctal(num);
                break;
            }
        }

        outputText.setText(output);

    }
}

