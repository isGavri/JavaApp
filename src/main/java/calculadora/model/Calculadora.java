package calculadora.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;




public class Calculadora {
    @FXML
    public TextField textField;

    @FXML
    public Text savedNumbers;

    private String firstNumber = "";

    private String currentNumber = "";

    private String calculationType;

    @FXML
    public void addAction(ActionEvent event) {
        calculationSetup("+");
    }

    @FXML
    public void minusAction(ActionEvent event) {
        calculationSetup("-");
    }

    @FXML
    public void divideAction(ActionEvent event) {
        calculationSetup("/");
    }

    @FXML
    public void multiplicationAction(ActionEvent event) {
        calculationSetup("*");
    }

    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
        savedNumbers.setText(firstNumber + " " + calculationType);
    }

    @FXML
    public void calculate(ActionEvent event) {
        double firstNumberInt = Double.parseDouble(firstNumber);
        double secondNumberInt = Double.parseDouble(currentNumber);

        switch (calculationType) {
            case "+": {
                double calculatedNumber = firstNumberInt + secondNumberInt;
                savedNumbers.setText(firstNumber + " + " + currentNumber + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
                currentNumber = String.valueOf(calculatedNumber);
                break;
            }
            case "-": {
                double calculatedNumber = firstNumberInt - secondNumberInt;
                savedNumbers.setText(firstNumber + " - " + currentNumber + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
                currentNumber = String.valueOf(calculatedNumber);
                break;
            }
            case "/": {
                double calculatedNumber = firstNumberInt / (double)secondNumberInt;
                savedNumbers.setText(firstNumber + " / " + currentNumber + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
                currentNumber = String.valueOf(calculatedNumber);
                break;
            }
            case "*": {
                double calculatedNumber = firstNumberInt * secondNumberInt;
                savedNumbers.setText(firstNumber + " * " + currentNumber + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
                currentNumber = String.valueOf(calculatedNumber);
                break;
            }
        }
    }

    @FXML
    public void clearTextField(ActionEvent event) {
        currentNumber = "";
        textField.setText("");
        savedNumbers.setText("");
    }

    @FXML
    public void button0Clicked(ActionEvent event) {
        if(!currentNumber.equals("")){
            addNumber("0");
        }
    }

    @FXML
    public void button1Clicked(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    public void button2Clicked(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    public void button3Clicked(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    public void button4Clicked(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    public void button5Clicked(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    public void button6Clicked(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    public void button7Clicked(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    public void button8Clicked(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    public void button9Clicked(ActionEvent event) {
        addNumber("9");
    }

    public void updateTextField(){
        textField.setText(currentNumber);
    }

    public void addNumber(String number){
        currentNumber += number;
        updateTextField();
    }
}
