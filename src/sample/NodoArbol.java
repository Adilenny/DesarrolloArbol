package sample;

public class NodoArbol {
    private NodoArbol  nodoIzquierdo = null , nodoDerecho = null;
    private  int valor;
    public int dato;

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
}
