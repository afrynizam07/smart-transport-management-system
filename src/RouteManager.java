import java.util.*;

// RouteManager uses LinkedList to store routes
public class RouteManager {
    LinkedList<Route> routes = new LinkedList<>();

    void addRoute(Route route) {
        routes.add(route);
        System.out.println("Route added successfully.");
    }

    void displayRoutes() {
        if (routes.isEmpty()) {
            System.out.println("No routes available.");
            return;
        }
        for (Route route : routes) {
            route.displayRoute();
        }
    }
}
