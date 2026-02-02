class MetroMap {

    static Graph createMetroMap() {

        Graph graph = new Graph();

        // Major Stations / Interchanges
        graph.addStation("Rajiv Chowk");          
        graph.addStation("Central Secretariat");  
        graph.addStation("Mandi House");          
        graph.addStation("Kashmere Gate");        
        graph.addStation("New Delhi");             

        // Yellow Line (sample)
        graph.addStation("Chandni Chowk");
        graph.addStation("INA");
        graph.addStation("AIIMS");
        graph.addStation("Green Park");
        graph.addStation("Hauz Khas");

        // Blue Line 
        graph.addStation("Barakhamba Road");
        graph.addStation("Pragati Maidan");
        graph.addStation("Yamuna Bank");

        // Violet Line 
        graph.addStation("Khan Market");
        graph.addStation("Lajpat Nagar");
        graph.addStation("Kalkaji Mandir");

        // CONNECTIONS 

        // Yellow Line
        
        graph.addConnection("Chandni Chowk", "Kashmere Gate", 1);
        graph.addConnection("Kashmere Gate", "New Delhi", 2);
        graph.addConnection("New Delhi", "Rajiv Chowk", 1);
        graph.addConnection("Rajiv Chowk", "INA", 4);
        graph.addConnection("INA", "AIIMS", 2);
        graph.addConnection("AIIMS", "Green Park", 1);
        graph.addConnection("Green Park", "Hauz Khas", 2);

        // Blue Line
        graph.addConnection("Rajiv Chowk", "Barakhamba Road", 1);
        graph.addConnection("Barakhamba Road", "Mandi House", 1);
        graph.addConnection("Mandi House", "Pragati Maidan", 1);
        graph.addConnection("Pragati Maidan", "Yamuna Bank", 3);

        // Violet Line
        graph.addConnection("Kashmere Gate", "Mandi House", 4);
        graph.addConnection("Mandi House", "Central Secretariat", 2);
        graph.addConnection("Central Secretariat", "Khan Market", 1);
        graph.addConnection("Khan Market", "Lajpat Nagar", 4);
        graph.addConnection("Lajpat Nagar", "Kalkaji Mandir", 3);

        // for Dijkstra
        graph.addConnection("Rajiv Chowk", "Kashmere Gate", 6);

        return graph;
    }
}
