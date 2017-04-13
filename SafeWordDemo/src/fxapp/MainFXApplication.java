package fxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


    public class MainFXApplication extends Application {


        private Stage mainStage;

        @Override
        public void start(Stage primaryStage) throws Exception{
            mainStage = primaryStage;
            showInactiveScreen(mainStage);
        }

        public Stage getMainStage() {
            return mainStage;
        }

        private void showInactiveScreen(Stage mainStage) throws IOException {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/InactiveScreen.fxml"));
            Parent rootLayout = loader.load();


            mainStage.setTitle("SafeWord Mobile App");
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            mainStage.setScene(scene);
            mainStage.show();
        }
        public static void main(String[] args) {
            launch(args);
        }
    }
