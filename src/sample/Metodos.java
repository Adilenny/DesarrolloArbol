package sample;

import java.util.ArrayList;

/**
 * Created by asus1 on 11/29/2017.
 */
public class Metodos {
    private ArrayList<Integer> array = new ArrayList<Integer>();

    public void PreOrden(NodoArbol raiz){
        if(raiz != null){ // creo una condición en a cual se coloca la raiz igual a null
            System.out.println(raiz.getValor() + " ");// mando a imprimier el valor de la raiz
            PreOrden(raiz.getNodoIzquierdo()); // se manda a traer la raiz para que invoque al valor de nodo izquierdo
            PreOrden(raiz.getNodoDerecho()); // se manda a traer la raiz para mandar a traer el valor del nodo derecho
        }
    }

    public void InOrden(NodoArbol raiz){
        if (raiz != null){// se crea una condición en la cual la raiz es igual a null
            InOrden(raiz.getNodoIzquierdo());// se manda a traer el valor de la raiz, para seguir con el valor de lado izquierdo
            System.out.println(raiz.getValor() + " " );// se manda a imprimir la raiz
            InOrden(raiz.getNodoDerecho()); // se manda a traer la raiz para poder mandar a traer el valor del nodo derecho
        }
    }

    public void PostOrden(NodoArbol raiz){
        if (raiz != null){ // Se crea la condición if  se coloca la rama igual a null
            PostOrden(raiz.getNodoIzquierdo());  // se manda a traer la rama para tomar el valor del nodo izquierdo
            PostOrden(raiz.getNodoDerecho()); // se manda a llamar la rama para tomar el valor del nodo derecho
            System.out.println(raiz.getValor() + " "); // se manda a imprimir la raiz
        }
    }


}
