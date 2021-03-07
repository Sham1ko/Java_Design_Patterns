package Task_three;

public class Car {
    private final int seats;
    private final Engine engine;
    private final boolean tripComputer;
    private final boolean GPSNavigator;

    public Car(int seats, Engine engine, boolean tripComputer, boolean gpsNavigator) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPSNavigator = gpsNavigator;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }


    public boolean getTripComputer() {
        return tripComputer;
    }

    public boolean getGpsNavigator() {
        return GPSNavigator;
    }
}
