package calculadora.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import calculadora.controller.ConversionUnidades.*;

public class ConversionUnidades {

    @FXML
    public TextField inputText;
    @FXML
    public TextField outputText;

    private Integer inputType;
    private Integer outputType;

    public void setMIn(ActionEvent actionEvent) {
        this.inputType = 1;
    }

    public void setCMIn(ActionEvent actionEvent) {
        this.inputType = 2;
    }

    public void setKMIn(ActionEvent actionEvent) {
        this.inputType = 3;
    }

    public void setYIn(ActionEvent actionEvent) {
        this.inputType = 4;
    }

    public void setPIn(ActionEvent actionEvent) {
        this.inputType = 5;
    }

    public void setInIn(ActionEvent actionEvent) {
        this.inputType = 6;
    }

    public void setMOut(ActionEvent actionEvent) {
        this.outputType = 1;
    }

    public void setCMOut(ActionEvent actionEvent) {
        this.outputType = 2;
    }

    public void setKMOut(ActionEvent actionEvent) {
        this.outputType = 3;
    }

    public void setYOut(ActionEvent actionEvent) {
        this.outputType = 4;
    }

    public void setPOut(ActionEvent actionEvent) {
        this.outputType = 5;
    }

    public void setInOut(ActionEvent actionEvent) {
        this.outputType = 6;
    }

    public void convertir(ActionEvent actionEvent) {
        if (inputType == 0 || outputType == 0) {
            outputText.setText("Seleccionada unidades de entrada y salida");
        }
        String output = String.valueOf(
                calculadora.controller.ConversionUnidades.convertir(
                        inputType,
                        outputType,
                        Double.parseDouble(inputText.getText())));
        outputText.setText(output);
    }
}
