import java.util.LinkedList;

public class Graph {
    int vertices;
    LinkedList<Integer> adjacentList[];

    Graph(int v){
        vertices=v;
        adjacentList = new LinkedList[v];
        for (int i=0; i<vertices;i++){
        adjacentList[i] = new LinkedList<>();
        }
    }
    void addEdge(int vertices, int weight){
        adjacentList[vertices].add(weight);
    }
}