package dijkstra;

import java.util.List;

public class Nodo {
    private Integer id;
    private Etiqueta<String> etiqueta;
    private List<Adyacencia> adyacenciaList;

    public Nodo(Integer id, Etiqueta<String> etiqueta, List<Adyacencia> adyacenciaList) {
        this.id = id;
        this.etiqueta = etiqueta;
        this.adyacenciaList = adyacenciaList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Etiqueta<String> getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta<String> etiqueta) {
        this.etiqueta = etiqueta;
    }

    public List<Adyacencia> getAdyacenciaList() {
        return adyacenciaList;
    }

    public void setAdyacenciaList(List<Adyacencia> adyacenciaList) {
        this.adyacenciaList = adyacenciaList;
    }
}
