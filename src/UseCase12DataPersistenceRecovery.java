public class UseCase12DataPersistenceRecovery {
    public void execute() {

        System.out.println("System Recovery");

        String filePath = "inventory.txt";

        RoomInventory inventory = new RoomInventory();

        FilePersistenceService persistenceService =
                new FilePersistenceService();

        persistenceService.loadInventory(inventory, filePath);

        System.out.println();
        System.out.println("Current Inventory:");

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

        persistenceService.saveInventory(inventory, filePath);
    }
}
