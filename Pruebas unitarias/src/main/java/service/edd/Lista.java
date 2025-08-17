package service.edd;

public class Lista {
    private String nombre;
    private Nodo ini;
    private Nodo fin;

    public Lista(String nombre) {
        this.nombre = nombre;
        this.ini = null;
        this.fin = null;
    }

    public boolean estaVacia() {
        return ini == null;
    }

    public void insertarAlFrente(Object dato) {
        Nodo nuevo = new Nodo(dato, ini);
        ini = nuevo;
        if (fin == null) {
            fin = ini;
        }
    }

    @Override
    public String toString() {
        return "Lista{" +
                "nombre='" + nombre + '\'' +
                ", ini=" + ini +
                '}';
    }
}
