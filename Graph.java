import java.util.HashSet;

class Graph {

    private HashSet<Vertex> nodes;

    public Graph() {
        nodes = new HashSet<>();
    }

    public boolean AddEdge(Vertex v1, Vertex v2, int weight) {
        // Добавляем это направленное ребро
        return v1.getEdges().add(new Edge(v2, weight));
    }

    public boolean AddVertex(Vertex v) {
        return nodes.add(v);
    }

    public void printGraph() {
        // Вывод графа, чтобы посмотреть его, как нам удобно
        for (Vertex v : nodes) {
            System.out.print("Vertex " + v.getName() + ": ");

            for (Edge e : v.getEdges()) {
                System.out.print(
                    e.getDestVertex().getName()
                    + " weight: "
                    + e.getWeight()
                    + " "
                );
            }

            System.out.println("\n");
        }
    }
}
