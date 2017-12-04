package sample;

/**
 * Created by jarumy on 29/11/2017.
 */
public class Metodos {

    public void PreOrden(NodoArbol raiz){
        if(raiz != null){
            System.out.println(raiz.getValor() + " ");
            PreOrden(raiz.getNodoIzquierdo());
            PreOrden(raiz.getNodoDerecho());
        }
    }

}
