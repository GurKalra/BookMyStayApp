public class UseCase7AddOnServiceSelection {

    public void execute() {

        System.out.println("Add-On Service Selection");

        String reservationId = "Single-1";

        AddOnServiceManager manager =
                new AddOnServiceManager();

        AddOnService breakfast =
                new AddOnService("Breakfast", 500);

        AddOnService spa =
                new AddOnService("Spa", 1000);

        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);

        double total =
                manager.calculateTotalServiceCost(reservationId);

        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + total);
    }
}