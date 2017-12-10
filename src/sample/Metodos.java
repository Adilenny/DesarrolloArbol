package sample;

import java.awt.*;

/**
<<<<<<< HEAD
 * Created by jarumy on 29/11/2017.
=======
 * Created by asus1 on 11/29/2017.
>>>>>>> origin/Jazmin
 */
public class Metodos {


    int cantidad;
    private int tamaño=0;
    int max=0;
    int min=10000;

    public void PreOrden(NodoArbol raiz, Label label) {
        if (raiz != null) {
            System.out.println(raiz.getValor() + " ");
            PreOrden(raiz.getNodoIzquierdo(),label);
            PreOrden(raiz.getNodoDerecho(),label);
        }
    }

    public void InOrden(NodoArbol raiz) {
        if (raiz != null) {
            InOrden(raiz.getNodoIzquierdo());
            System.out.println(raiz.getValor() + " ");
            InOrden(raiz.getNodoDerecho());
        }
    }

    public void PostOrden(NodoArbol raiz) {
        if (raiz != null) {
            PostOrden(raiz.getNodoIzquierdo());
            PostOrden(raiz.getNodoDerecho());
            System.out.println(raiz.getValor() + " ");
        }
    }

    public String tamaño(NodoArbol raiz){//recibe un paranetro en este caso es raiz
        if(raiz != null){//condicion para saber si la raiz esta vacia
            cantidad++;//incrementa la varibale cantidad de uno en uno
            tamaño(raiz.getNodoIzquierdo());
            tamaño(raiz.getNodoDerecho());
        }
        return "El tamaño del arbol es "+ cantidad + " nodos";
    }
    public String maximo(NodoArbol raiz){
        if(raiz!=null){
            if(max<raiz.getValor()){
                max=raiz.getValor();
            }
            maximo(raiz.getNodoIzquierdo());
            maximo(raiz.getNodoDerecho());

        }
        return "El valor máximo es: "+max;
    }



    public String minimo(NodoArbol raiz){
        if(raiz!=null){
            if(min<raiz.getValor()){
                min=raiz.getValor();
            }
            minimo(raiz.getNodoIzquierdo());
            minimo(raiz.getNodoDerecho());

        }
        return "El valor minimo es: "+min;
    }




}
