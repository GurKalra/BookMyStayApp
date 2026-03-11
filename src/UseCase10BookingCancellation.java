public class UseCase10BookingCancellation {

    public void execute() {

        System.out.println("Booking Cancellation");

        RoomInventory inventory = new RoomInventory();

        CancellationService cancellationService =
                new CancellationService();

        String reservationId = "Single-1";
        String roomType = "Single";

        cancellationService.registerBooking(
                reservationId,
                roomType
        );

        cancellationService.cancelBooking(
                reservationId,
                inventory
        );

        cancellationService.showRollbackHistory();

        System.out.println();
        System.out.println(
                "Updated Single Room Availability: "
                        + inventory.getRoomAvailability().get("Single")
        );
    }
}
