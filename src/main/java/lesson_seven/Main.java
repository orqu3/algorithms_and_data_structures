package lesson_seven;

/*
1. Реализовать программу, в которой задается граф из 10 вершин.
Задать ребра и найти кратчайший путь с помощью поиска в ширину.
 */

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph(10);

        graph.addEdge(0, 4);
        graph.addEdge(0, 2);
        graph.addEdge(0, 1);
        graph.addEdge(2, 7);
        graph.addEdge(2, 8);
        graph.addEdge(3, 9);
        graph.addEdge(3, 6);
        graph.addEdge(3, 5);
        graph.addEdge(4, 1);
        graph.addEdge(5, 7);
        graph.addEdge(5, 9);
        graph.addEdge(5, 2);

        BreadthFirstPath bfs = new BreadthFirstPath(graph, 0);
        System.out.println("Shortcut: " + bfs.pathTo(9));
    }
}