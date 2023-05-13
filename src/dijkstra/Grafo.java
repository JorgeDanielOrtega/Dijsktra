package dijkstra;

import java.util.List;

public class Grafo {
    private List<Nodo> grafo;

    public void insertarNodo(Nodo nodo){
        grafo.add(nodo);
    }

    public void insertarAdyacencia(Nodo nodoOrigen, Nodo nodoDestino, Double peso) {
        nodoOrigen.getAdyacenciaList().add(new Adyacencia(peso, nodoDestino));
    }
    public void insertarAdyacencia(Integer nodoOrigen, Integer nodoDestino, Double peso){
        Nodo nodoO = grafo.get(nodoOrigen);
        Nodo nodoD = grafo.get(nodoDestino);
        insertarAdyacencia(nodoO, nodoD, peso);
    }

    public Object obtenerEtiqueta(Integer nodoId){
        return grafo.get(nodoId).getEtiqueta().getNombre();
    }

    //Probar
    public Integer obtenderId(Etiqueta<String> etiqueta){
        // -1 -> no se encontro el nodo
//        Nodo n = (Nodo)  grafo.stream().filter(nodo -> nodo.getEtiqueta().getNombre().equals(etiqueta.getNombre()));
        Nodo n = (Nodo)  grafo.stream().matc filter(nodo -> nodo.getEtiqueta() == etiqueta);
        return n != null ? n.getId() : -1;
    }

    public List<Nodo> getGrafo() {
        return grafo;
    }
}
