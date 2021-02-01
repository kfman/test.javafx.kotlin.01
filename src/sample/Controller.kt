package sample

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label

class Controller {

    var counter = 0

    @FXML
    var buttonCounterLabel = Label()

    @FXML
    fun runAction(e: ActionEvent?) {
        println("Button is pressed")
        buttonCounterLabel.text = "Clicked ${counter++}"
    }
}
