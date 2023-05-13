package dijkstra;

public class Etiqueta<T> {
    private T nombre;

    public Etiqueta(T nombre) {
        this.nombre = nombre;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }
}
