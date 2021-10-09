package lk.ijse.ThogaKade;

/**
 * @author Sandaru Kithshan <skithshan93@gmail.com> (github.com/Sandaru293)
 * @since 10/9/2021
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("view/CustomerForm.fxml"))));
        primaryStage.show();

    }
}
