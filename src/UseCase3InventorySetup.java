/**
 * ==============================================================
 * USE CASE 3 - Centralized Room Inventory Management
 * ==============================================================
 *
 * @version 3.1
 */
public class UseCase3InventorySetup {

    public void execute() {

        System.out.println("Hotel Room Inventory Status");
        System.out.println();

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();

        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Single"));
        System.out.println();

        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Double"));
        System.out.println();

        System.out.println("Suite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Suite"));
    }
}