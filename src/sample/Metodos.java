package sample;

/**
 * Created by asus1 on 11/29/2017.
 */
public class Metodos {

    public void PreOrden(NodoArbol raiz){
        if(raiz != null){
            System.out.println(raiz.getValor() + " ");
            PreOrden(raiz.getNodoIzquierdo());
            PreOrden(raiz.getNodoDerecho());
        }
    }

    public void InOrden(NodoArbol raiz){
        if (raiz != null){
            InOrden(raiz.getNodoIzquierdo());
            System.out.println(raiz.getValor() + " " );
            InOrden(raiz.getNodoDerecho());
        }
    }

    public void PostOrden(NodoArbol raiz){
        if (raiz != null){
            PostOrden(raiz.getNodoIzquierdo());
            PostOrden(raiz.getNodoDerecho());
            System.out.println(raiz.getValor() + " ");
        }
    }

}
