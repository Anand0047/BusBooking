import java.util.ArrayList;

public class BookingDatabase {
    private ArrayList<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            for (Booking booking : bookings) {
                booking.displayBooking();
            }
        }
    }
}
