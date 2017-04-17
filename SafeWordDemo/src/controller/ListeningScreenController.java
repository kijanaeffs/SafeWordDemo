package controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ListeningScreenController {
    //Note, need credentials in order to send SMS
    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "";

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
     * This method needs credentials in order to work correctly.
     * @throws IOException
     */
    @FXML
    private void handleSMSPressed() throws IOException {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+17706588307"),
                new PhoneNumber("+16783744106"),
                "- -\nHello World!\nFrom SafeWord Mobile").create();

        System.out.println(message.getSid());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("SafeWord Message Sent");
        alert.setHeaderText("Congratulations!");
        alert.setContentText("Your message has been sent.");
        alert.showAndWait();

    }

}