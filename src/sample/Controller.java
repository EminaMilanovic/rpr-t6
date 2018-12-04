package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private ChoiceBox choisebox;


    @Override
    public void initialize(URL url, ResourceBundle rb){

        //(bachelor, master, doktorski studij, stručni studij)
        choisebox.setValue("bachelor");
        choisebox.getItems().add("bachelor");
        choisebox.getItems().add("master");
        choisebox.getItems().add("doktorski studij");
        choisebox.getItems().add("stručni studij");



    }

}
