public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A", "B", 1);
        graph.addEdge("A", "C", 4);
        graph.addEdge("B", "C", 2);
        graph.addEdge("B", "D", 5);
        graph.addEdge("C", "D", 1);
        graph.addEdge("D", "E", 3);

        System.out.println("BFS:");
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph, "A");
        for (Vertex v : bfs.edgeTo.keySet()) {
            System.out.println(bfs.edgeTo.get(v).getName() + " -> " + v.getName());
        }

        System.out.println("\nDijkstra:");
        DijkstraSearch dijkstra = new DijkstraSearch(graph, "A");
        for (Vertex v : dijkstra.edgeTo.keySet()) {
            System.out.println(dijkstra.edgeTo.get(v).getName() + " -> " + v.getName() + " with distance " + dijkstra.getDistTo().get(v));
        }
    }
}
