public class UseCase11ConcurrentBookingSimulation {
    public void execute() {

        System.out.println("Concurrent Booking Simulation");

        BookingRequestQueue bookingQueue =
                new BookingRequestQueue();

        RoomInventory inventory =
                new RoomInventory();

        RoomAllocationService allocationService =
                new RoomAllocationService();

        bookingQueue.addRequest(new Reservation("Abhi", "Single"));
        bookingQueue.addRequest(new Reservation("Vanmathi", "Double"));
        bookingQueue.addRequest(new Reservation("Kural", "Suite"));
        bookingQueue.addRequest(new Reservation("Subha", "Single"));

        Thread t1 = new Thread(
                new ConcurrentBookingProcessor(
                        bookingQueue,
                        inventory,
                        allocationService
                )
        );

        Thread t2 = new Thread(
                new ConcurrentBookingProcessor(
                        bookingQueue,
                        inventory,
                        allocationService
                )
        );

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread execution interrupted.");
        }

        System.out.println();
        System.out.println("Remaining Inventory:");

        System.out.println(
                "Single: " +
                        inventory.getRoomAvailability().get("Single")
        );

        System.out.println(
                "Double: " +
                        inventory.getRoomAvailability().get("Double")
        );

        System.out.println(
                "Suite: " +
                        inventory.getRoomAvailability().get("Suite")
        );
    }
}
