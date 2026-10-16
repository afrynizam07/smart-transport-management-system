// Route class stores route details
public class Route {
    int routeID;
    String source;
    String destination;
    int distance;

    Route(int routeID, String source, String destination, int distance) {
        this.routeID = routeID;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    void displayRoute() {
        System.out.println("Route ID: " + routeID + " | " + source +
                " -> " + destination + " | Distance: " + distance + " km");
    }
}
