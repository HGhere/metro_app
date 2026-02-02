import java.util.*;

class Graph {
    HashMap<String, List<Edge>> adjList = new HashMap<>();

    void addStation(String station) {
        adjList.putIfAbsent(station, new ArrayList<>());
    }

    void addConnection(String s1, String s2, int distance) {
        adjList.get(s1).add(new Edge(s2, distance));
        adjList.get(s2).add(new Edge(s1, distance));
    }
}

class Edge {
    String station;
    int distance;

    Edge(String station, int distance) {
        this.station = station;
        this.distance = distance;
    }
}
