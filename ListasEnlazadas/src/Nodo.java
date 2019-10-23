public class Nodo {

    Object dato;
    Nodo nodoDere;
    Nodo nodoIzq;

    public Nodo(Object dato, Nodo nodoDere, Nodo nodoIzq) {
        this.dato = dato;
        this.nodoDere = nodoDere;
        this.nodoIzq = nodoIzq;
    }

    public Nodo(Object dato) {
        this.dato = dato;
    }
}
