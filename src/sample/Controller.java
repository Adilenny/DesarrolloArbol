package sample;

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
    ComboBox metodosCbx;
    @FXML
    TextField buscarTxt;
    @FXML
    GridPane arbolGpn;
    @FXML
    Label textoLbl;

    public void mostrar (){
        metodosCbx.getItems().addAll("PreOrden", "InOrden", "PostOrden");
    }

    public static void main (String[] args){
        Controller arbol = new Controller();
        NodoArbol raiz = new NodoArbol(1);
        NodoArbol nodo2 = new NodoArbol(2);
        NodoArbol  nodo3 = new NodoArbol(3);

        nodo3.setNodoDerecho(new NodoArbol(6));
        nodo3.setNodoIzquierdo(new NodoArbol(5));
        nodo2.setNodoIzquierdo(new NodoArbol(4));
        raiz.setNodoIzquierdo(nodo2);
        raiz.setNodoDerecho(nodo3);

        arbol.PreOrden(raiz);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
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
    }

    private static void PreOrden(NodoArbol raiz){
        if(raiz != null){
            System.out.println(raiz.getValor() + " ");
            PreOrden(raiz.getNodoIzquierdo());
            PreOrden(raiz.getNodoDerecho());
        }
    }



}
