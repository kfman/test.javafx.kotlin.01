package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    void runAction(ActionEvent e){
        System.out.println("Button is pressed");
    }

}
