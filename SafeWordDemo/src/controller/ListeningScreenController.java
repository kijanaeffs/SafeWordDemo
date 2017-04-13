package controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ListeningScreenController {

    @FXML
    private Button listeningButton;

    @FXML
    private Button SMSButton;


    /**
     * Method to switch to the Inactive Screen when "Listening" button
     * is pressed.
     * @throws IOException
     */
    @FXML
    private void handleListeningPressed() throws IOException {
        Stage stage = (Stage) listeningButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass()
                .getResource("../view/InactiveScreen.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * Method to send an SMS message when "Send SMS" button is pressed.
     * @throws IOException
     */
    @FXML
    private void handleSMSPressed() throws IOException {
        // For now this button will simply show an error message
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Uh Oh!");
        alert.setHeaderText("Button Under Construction");
        alert.setContentText("This function has not been implemented yet");

        alert.showAndWait();

    }

}