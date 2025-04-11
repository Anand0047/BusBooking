public class Main {
    public static void main(String[] args) {
        BusDatabase busDB = new BusDatabase();
        BookingDatabase bookingDB = new BookingDatabase();

        while (true) {
            System.out.println("\n=== Bus Booking System ===");
            System.out.println("1. View Buses");
            System.out.println("2. Book Ticket");
            System.out.println("3. View All Bookings");
            System.out.println("4. Exit");

            int choice = UserInput.getInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    busDB.displayBuses();
                    break;
                case 2:
                    Booking booking = new Booking();
                    if (booking.makeBooking(busDB)) {
                        bookingDB.addBooking(booking);
                        System.out.println("✅ Booking successful!");
                    } else {
                        System.out.println("❌ Booking failed. No available seats or bus not found.");
                    }
                    break;
                case 3:
                    bookingDB.showBookings();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
