import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WeightedGraph {
    private Map<String, Vertex> vertices;

    public WeightedGraph() {
        this.vertices = new HashMap<>();
    }

    public void addVertex(String name) {
        vertices.put(name, new Vertex(name));
    }

    public void addEdge(String from, String to, int weight) {
        Vertex fromVertex = vertices.get(from);
        Vertex toVertex = vertices.get(to);
        if (fromVertex != null && toVertex != null) {
            fromVertex.addNeighbor(toVertex, weight);
        }
    }

    public Vertex getVertex(String name) {
        return vertices.get(name);
    }

    public Collection<Vertex> getVertices() {
        return vertices.values();
    }
}
