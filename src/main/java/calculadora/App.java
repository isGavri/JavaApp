package calculadora;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.URL;


/**
 * JavaFX App
 */
public class App extends Application {

    double x,y = 0;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(new URL("file:///C:\\Users\\notsy\\Documents\\Projects\\HelloFx\\src\\main\\java\\calculadora\\fxml\\main.fxml"));
        // To move the windows when mouse drag
        root.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getX();
            y = mouseEvent.getY();
        });
        root.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX() - x);
            stage.setY(mouseEvent.getScreenY() - y);
        });
        stage.setScene(new Scene(root, 1200, 600));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}