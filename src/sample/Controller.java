package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private ChoiceBox choisebox;
    @FXML private ChoiceBox odsjek;
    @FXML private ChoiceBox godina;
    @FXML private ComboBox  mjesto;
    @FXML private TextField imeField;
    @Override
    public void initialize(URL url, ResourceBundle rb){

        //(bachelor, master, doktorski studij, stručni studij)
        choisebox.setValue("bachelor");
        choisebox.getItems().add("bachelor");
        choisebox.getItems().add("master");
        choisebox.getItems().add("doktorski studij");
        choisebox.getItems().add("stručni studij");
        odsjek.setValue("RI");
        odsjek.getItems().addAll("AiE","RI","TK","EE");
        godina.setValue("prva");
        godina.getItems().addAll("prva","druga","treća");

        mjesto.getItems().addAll("Sarajevo","Zenica","Visoko","Tuzla","Mostar");
        imeField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                if (validnoIme(n)) {
                    imeField.getStyleClass().removeAll("poljeNijeIspravno");
                    imeField.getStyleClass().add("poljeIspravno");
                } else {
                    imeField.getStyleClass().removeAll("poljeIspravno");
                    imeField.getStyleClass().add("poljeNijeIspravno");
                }
            }
        });


    }
    boolean validnoIme(String n){
        return true;
    }

}
