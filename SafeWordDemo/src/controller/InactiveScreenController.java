package controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class InactiveScreenController {

    @FXML
    private Button inactiveButton;


    /**
     * Method to switch to the Listening Screen when "Inactive" button
     * is pressed.
     * @throws IOException
     */
    @FXML
    private void handleInactivePressed() throws IOException {
        Stage stage = (Stage) inactiveButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass()
                .getResource("../view/ListeningScreen.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

}