import java.util.*;

// UndoStack uses Stack to undo the last route action
public class UndoStack {
    Stack<Route> stack = new Stack<>();

    void pushRoute(Route route) {
        stack.push(route);
        System.out.println("Route saved for undo operation.");
    }

    void undoRoute() {
        if (stack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }
        Route route = stack.pop();
        System.out.println("Undo route ID: " + route.routeID);
    }
}
