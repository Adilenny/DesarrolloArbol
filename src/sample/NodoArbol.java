package sample;

public class NodoArbol {
    public NodoArbol  nodoIzquierdo  , nodoDerecho;
    private  int valor;
    private int dato;

    public NodoArbol (int valor){
        this.valor = valor;
    }

    public NodoArbol getNodoIzquierdo (){
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(NodoArbol nodoIzquierdo){
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho(){
        return  nodoDerecho;
    }

    public void setNodoDerecho(NodoArbol nodoDerecho){
        this.nodoDerecho = nodoDerecho;
    }

    public int getValor(){
        return valor;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
