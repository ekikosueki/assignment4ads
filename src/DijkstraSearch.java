import java.util.*;

public class DijkstraSearch extends Search {
    private Map<Vertex, Integer> distTo;

    public DijkstraSearch(WeightedGraph graph, String start) {
        super(graph, start);
        this.distTo = new HashMap<>();
        for (Vertex v : graph.getVertices()) {
            distTo.put(v, Integer.MAX_VALUE);
        }
        distTo.put(this.start, 0);
        search();
    }

    @Override
    public void search() {
        PriorityQueue<Vertex> pq = new PriorityQueue<>(Comparator.comparingInt(distTo::get));
        pq.add(start);

        while (!pq.isEmpty()) {
            Vertex v = pq.poll();

            for (Map.Entry<Vertex, Integer> entry : v.getNeighbors().entrySet()) {
                Vertex w = entry.getKey();
                int weight = entry.getValue();
                int newDist = distTo.get(v) + weight;

                if (newDist < distTo.get(w)) {
                    distTo.put(w, newDist);
                    edgeTo.put(w, v);
                    pq.add(w);
                }
            }
        }
    }

    public Map<Vertex, Integer> getDistTo() {
        return distTo;
    }
}
