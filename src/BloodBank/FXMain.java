package BloodBank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("UQU");

        stage.show();
    }
    
     public static void main(String[] args) {
      launch(args);
    }
}
