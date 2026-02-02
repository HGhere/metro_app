import java.util.*;

class Dijkstra {

    static String findShortestPath(Graph graph, String source, String destination) {

        if (source.equals(destination)) {
            return "Source and destination are the same.\nDistance: 0 km\nFare: ₹0";
        }

        HashMap<String, Integer> distance = new HashMap<>();
        HashMap<String, String> parent = new HashMap<>();

        for (String station : graph.adjList.keySet()) {
            distance.put(station, Integer.MAX_VALUE);
        }

        distance.put(source, 0);

        PriorityQueue<String> pq =
                new PriorityQueue<>(Comparator.comparingInt(distance::get));

        pq.add(source);

        while (!pq.isEmpty()) {
            String current = pq.poll();

            for (Edge edge : graph.adjList.get(current)) {
                int newDist = distance.get(current) + edge.distance;

                if (newDist < distance.get(edge.station)) {
                    distance.put(edge.station, newDist);
                    parent.put(edge.station, current);
                    pq.add(edge.station);
                }
            }
        }

        if (distance.get(destination) == Integer.MAX_VALUE) {
            return "No route available between selected stations.";
        }

        List<String> path = new ArrayList<>();
        String curr = destination;

        while (curr != null) {
            path.add(curr);
            curr = parent.get(curr);
        }

        Collections.reverse(path);

        int totalDistance = distance.get(destination);
        int fare = calculateFare(totalDistance);

        return "Route: " + String.join(" → ", path)
                + "\nDistance: " + totalDistance + " km"
                + "\nFare: ₹" + fare;
    }

    static int calculateFare(int distance) {
        if (distance <= 5) return 20;
        else if (distance <= 12) return 30;
        else return 40;
    }
}
