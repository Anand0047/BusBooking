public class Booking {
    private String passengerName;
    private int busNo;

    public boolean makeBooking(BusDatabase busDB) {
        passengerName = UserInput.getString("Enter your name: ");
        busNo = UserInput.getInt("Enter bus number: ");
        Bus bus = busDB.getBus(busNo);

        if (bus != null && bus.bookSeat()) {
            return true;
        }
        return false;
    }

    public void displayBooking() {
        System.out.println("Passenger: " + passengerName + " | Bus No: " + busNo);
    }
}
