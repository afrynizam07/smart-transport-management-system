import java.util.*;

// PassengerQueue uses Queue to process passengers in FIFO order
public class PassengerQueue {
    Queue<Passenger> queue = new LinkedList<>();

    void addPassenger(Passenger passenger) {
        queue.add(passenger);
        System.out.println("Passenger added to queue.");
    }

    void processPassenger() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. No passenger to process.");
            return;
        }
        Passenger passenger = queue.poll();
        System.out.println("Processing passenger: " + passenger.name +
                " | Destination: " + passenger.destination);
    }
}
