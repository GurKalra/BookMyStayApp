import java.util.*;

public class CancellationService {
    private Stack<String> releasedRoomIds;
    private Map<String, String> reservationRoomTypeMap;

    public CancellationService() {
        releasedRoomIds = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    public void registerBooking(String reservationId, String roomType) {
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    public void cancelBooking(String reservationId, RoomInventory inventory) {

        if (!reservationRoomTypeMap.containsKey(reservationId)) {
            System.out.println("Cancellation failed. Reservation not found.");
            return;
        }

        String roomType = reservationRoomTypeMap.get(reservationId);

        releasedRoomIds.push(reservationId);

        int currentAvailability =
                inventory.getRoomAvailability().get(roomType);

        inventory.updateAvailability(
                roomType,
                currentAvailability + 1
        );

        reservationRoomTypeMap.remove(reservationId);

        System.out.println(
                "Booking cancelled successfully. Inventory restored for room type: "
                        + roomType
        );
    }

    public void showRollbackHistory() {

        System.out.println();
        System.out.println("Rollback History (Most Recent First):");

        while (!releasedRoomIds.isEmpty()) {

            String id = releasedRoomIds.pop();

            System.out.println(
                    "Released Reservation ID: " + id
            );
        }
    }
}
