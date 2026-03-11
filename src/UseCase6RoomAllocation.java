public class UseCase6RoomAllocation {

    public void execute() {

        System.out.println("Room Allocation Processing");

        BookingRequestQueue bookingQueue =
                new BookingRequestQueue();

        RoomInventory inventory =
                new RoomInventory();

        RoomAllocationService allocationService =
                new RoomAllocationService();

        bookingQueue.addRequest(new Reservation("Abhi", "Single"));
        bookingQueue.addRequest(new Reservation("Subha", "Double"));
        bookingQueue.addRequest(new Reservation("Vanmathi", "Suite"));

        while (bookingQueue.hasPendingRequests()) {

            Reservation reservation =
                    bookingQueue.getNextRequest();

            allocationService.allocateRoom(
                    reservation,
                    inventory
            );
        }
    }
}