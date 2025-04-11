import java.util.ArrayList;

public class BusDatabase {
    private ArrayList<Bus> busList = new ArrayList<>();

    public BusDatabase() {
        busList.add(new Bus(101, true, 40));
        busList.add(new Bus(102, false, 50));
        busList.add(new Bus(103, true, 30));
    }

    public void displayBuses() {
        for (Bus bus : busList) {
            bus.displayInfo();
        }
    }

    public Bus getBus(int busNo) {
        for (Bus bus : busList) {
            if (bus.getBusNo() == busNo) return bus;
        }
        return null;
    }
}
