package laberintografo;

import java.util.LinkedList;

public class GraphAL<T> implements GraphADT<T> {
    protected final int DEFAULT_CAPACITY = 5;
    protected int numVertices; // number of vertices in the graph
    protected LinkedList<String>[] adjList; // adjacency list
    protected T[] vertices; // values of vertices
}
