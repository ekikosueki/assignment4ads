import java.util.HashMap;
import java.util.Map;

public class Vertex {
    private String name;
    private Map<Vertex, Integer> neighbors;

    public Vertex(String name) {
        this.name = name;
        this.neighbors = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addNeighbor(Vertex vertex, int weight) {
        neighbors.put(vertex, weight);
    }

    public Map<Vertex, Integer> getNeighbors() {
        return neighbors;
    }
}
