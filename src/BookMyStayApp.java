public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("        Book My Stay App v2.0");
        System.out.println("==========================================");

        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("System initialized successfully.");
        System.out.println();

        // Execute Use Case 2
        UseCase2RoomInitialization useCase2 =
                new UseCase2RoomInitialization();

        useCase2.execute();
    }
}