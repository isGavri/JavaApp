package calculadora.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    public AnchorPane textArea;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void loadCalc(ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(new URL("file:///C:\\Users\\notsy\\Documents\\Projects\\HelloFx\\src\\main\\java\\calculadora\\fxml\\Calculadora.fxml"));
        textArea.getChildren().removeAll();
        textArea.getChildren().setAll(fxml);
    }

    public void loadConvSis(ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(new URL("file:///C:\\Users\\notsy\\Documents\\Projects\\HelloFx\\src\\main\\java\\calculadora\\fxml\\ConversionSistemas.fxml"));
        textArea.getChildren().removeAll();
        textArea.getChildren().setAll(fxml);
    }

    public void loadConvUni(ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(new URL("file:///C:\\Users\\notsy\\Documents\\Projects\\HelloFx\\src\\main\\java\\calculadora\\fxml\\ConversionUnidades.fxml"));
        textArea.getChildren().removeAll();
        textArea.getChildren().setAll(fxml);
    }
}
