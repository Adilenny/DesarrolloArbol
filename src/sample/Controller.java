package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by jarumy on 28/11/2017.
 */
public class Controller implements Initializable {

    @FXML
    Button minimoBtn, maximoBtn, contarBtn, buscarBtn, ordenarBtn;
    @FXML
    ComboBox cbxMetodos;
    @FXML
    TextField buscarTxt;
    @FXML
    Label textoLbl;

    Metodos metodos = new Metodos(); //se crea e objeto

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        cbxMetodos.getItems().addAll("PreOrden", "InOrden", "PostOrden");

        this.minimoBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        this.maximoBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        this.contarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        this.buscarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        this.ordenarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Metodos metodos = new Metodos();
                String met = (String) cbxMetodos.getSelectionModel().getSelectedItem();
                if (cbxMetodos.getSelectionModel().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "¡Selecciona el método porfavor!");
                }else{
                    if (met.equals("PreOrden")){
                        metodos.PreOrden(null);
                        textoLbl.setText(" injks");
                    }
                }

            }

        });
    }
}
