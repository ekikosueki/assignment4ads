import java.util.HashMap;
import java.util.Map;

public abstract class Search {
    protected WeightedGraph graph;
    protected Vertex start;
    protected Map<Vertex, Boolean> marked;
    protected Map<Vertex, Vertex> edgeTo;

    public Search(WeightedGraph graph, String start) {
        this.graph = graph;
        this.start = graph.getVertex(start);
        this.marked = new HashMap<>();
        this.edgeTo = new HashMap<>();
    }

    public abstract void search();
}
