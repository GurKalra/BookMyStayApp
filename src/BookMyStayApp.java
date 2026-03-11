public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("        Book My Stay App v3.0");
        System.out.println("==========================================");

        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("System initialized successfully.");
        System.out.println();

        // Execute Use Case 2
        System.out.println("---------- Use Case 2 ----------");
        UseCase2RoomInitialization useCase2 =
                new UseCase2RoomInitialization();
        useCase2.execute();

        System.out.println();
        System.out.println("---------- Use Case 3 ----------");

        // Execute Use Case 3
        UseCase3InventorySetup useCase3 =
                new UseCase3InventorySetup();
        useCase3.execute();

        System.out.println();
        System.out.println("---------- Use Case 4 ----------");

        UseCase4RoomSearch useCase4 =
                new UseCase4RoomSearch();
        useCase4.execute();

        System.out.println();
        System.out.println("---------- Use Case 5 ----------");

        UseCase5BookingRequestQueue useCase5 =
                new UseCase5BookingRequestQueue();
        useCase5.execute();

        System.out.println();
        System.out.println("---------- Use Case 6 ----------");
        UseCase6RoomAllocation useCase6 =
                new UseCase6RoomAllocation();
        useCase6.execute();

        System.out.println();
        System.out.println("---------- Use Case 7 ----------");

        UseCase7AddOnServiceSelection useCase7 =
                new UseCase7AddOnServiceSelection();
        useCase7.execute();

        System.out.println();
        System.out.println("---------- Use Case 8 ----------");

        UseCase8BookingHistoryReport useCase8 =
                new UseCase8BookingHistoryReport();
        useCase8.execute();

        System.out.println();
        System.out.println("---------- Use Case 9 ----------");

        UseCase9ErrorHandlingValidation useCase9 =
                new UseCase9ErrorHandlingValidation();
        useCase9.execute();

        System.out.println();
        System.out.println("---------- Use Case 10 ----------");

        UseCase10BookingCancellation useCase10 =
                new UseCase10BookingCancellation();
        useCase10.execute();

    }
}