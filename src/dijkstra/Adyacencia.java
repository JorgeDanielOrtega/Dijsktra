package dijkstra;

public class Adyacencia {
    private Double peso;
    private Nodo destino;

    public Adyacencia(Double peso, Nodo destino) {
        this.peso = peso;
        this.destino = destino;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Nodo getDestino() {
        return destino;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }
}
