public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    private int bookedSeats = 0;

    public Bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAC() {
        return ac;
    }

    public int getAvailableSeats() {
        return capacity - bookedSeats;
    }

    public boolean bookSeat() {
        if (bookedSeats < capacity) {
            bookedSeats++;
            return true;
        }
        return false;
    }

    public void displayInfo() {
        System.out.println("Bus No: " + busNo + " | AC: " + (ac ? "Yes" : "No") + " | Seats Left: " + getAvailableSeats());
    }
}
