import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearch extends Search {

    public BreadthFirstSearch(WeightedGraph graph, String start) {
        super(graph, start);
        search();
    }

    @Override
    public void search() {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(start);
        marked.put(start, true);

        while (!queue.isEmpty()) {
            Vertex v = queue.poll();
            for (Vertex w : v.getNeighbors().keySet()) {
                if (!marked.containsKey(w)) {
                    marked.put(w, true);
                    edgeTo.put(w, v);
                    queue.add(w);
                }
            }
        }
    }
}
