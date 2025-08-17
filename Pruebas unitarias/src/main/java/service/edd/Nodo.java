package service.edd;

public class Nodo {
    public Object dato;
    public Nodo sig;


    public Nodo(Object dato, Nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }



    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", sig=" + (sig != null ? "Nodo" : "null") +
                '}';
    }
}
