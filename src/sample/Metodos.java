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

    public String buscarNodo(int d){
        NodoArbol raiz = null;
        NodoArbol aux=raiz;
        while(aux.getDato() !=d){
            if(d< aux.getDato()){
                aux=aux.nodoIzquierdo;
            }else{
                aux=aux.nodoDerecho;

            }
            if(aux==null){
                return d + "No fue encontrado";
            }
        }
        return d + "fue encontrado";
    }

}
