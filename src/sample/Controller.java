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


        Controller arbol = new Controller();
        NodoArbol nodo1 = new NodoArbol(1);
        nodo1.setNodoIzquierdo(new NodoArbol(10));
        nodo1.setNodoDerecho(new NodoArbol(11));
        NodoArbol nodo2 = new NodoArbol(6);
        NodoArbol nodo3 = new NodoArbol(5);
        nodo3.setNodoIzquierdo(nodo2);
        nodo3.setNodoDerecho(nodo1);
        NodoArbol nodo4 = new NodoArbol(3);
        NodoArbol nodo5 = new NodoArbol(7);
        nodo5.setNodoIzquierdo(nodo4);
        nodo5.setNodoDerecho(nodo3);
        NodoArbol raiz = new NodoArbol(8);
        raiz.setNodoIzquierdo(nodo5);
        NodoArbol nodo6 = new NodoArbol(2);
        nodo6.setNodoIzquierdo(new NodoArbol(12));
        nodo6.setNodoDerecho(new NodoArbol(22));
        NodoArbol nodo7 = new NodoArbol(4);
        NodoArbol nodo8 = new NodoArbol(9);
        nodo8.setNodoIzquierdo(nodo7);
        nodo8.setNodoDerecho(nodo6);
        raiz.setNodoDerecho(nodo8);


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
                        textoLbl.setText(" injks");
                    }
                }

            }

        });
    }


}
