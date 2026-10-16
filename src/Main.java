// Main class runs the complete system
public class Main {
    public static void main(String[] args) {
        try {
            RouteManager routeManager = new RouteManager();
            PassengerQueue passengerQueue = new PassengerQueue();
            UndoStack undoStack = new UndoStack();

            Route route1 = new Route(101, "Colombo", "Kandy", 115);
            Route route2 = new Route(102, "Colombo", "Galle", 120);
            Route route3 = new Route(103, "Kandy", "Jaffna", 315);

            routeManager.addRoute(route1);
            routeManager.addRoute(route2);
            routeManager.addRoute(route3);
            undoStack.pushRoute(route3);

            System.out.println("\nAvailable Routes:");
            routeManager.displayRoutes();

            Passenger passenger1 = new Passenger(1, "Ali", "Kandy");
            Passenger passenger2 = new Passenger(2, "Afry", "Galle");

            passengerQueue.addPassenger(passenger1);
            passengerQueue.addPassenger(passenger2);

            System.out.println("\nPassenger Processing:");
            passengerQueue.processPassenger();
            passengerQueue.processPassenger();
            passengerQueue.processPassenger();

            System.out.println("\nUndo Operation:");
            undoStack.undoRoute();

            int[] distances = {115, 120, 315, 90, 75};
            SortRoutes.mergeSort(distances, 0, distances.length - 1);

            System.out.println("\nSorted Route Distances:");
            for (int distance : distances) {
                System.out.print(distance + " ");
            }

            int result = SearchRoute.search(distances, 120);
            System.out.println("\n\nSearch Result for 120 km: Index " + result);
        }
        catch (Exception e) {
            System.out.println("System error occurred: " + e.getMessage());
        }
    }
}
