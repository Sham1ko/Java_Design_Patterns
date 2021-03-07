package Task_three;

public class Manual {
    private final int seats;
    private final Engine engine;
    private final boolean tripComputer;
    private final boolean gpsNavigator;

    public Manual(int seats, Engine engine,boolean tripComputer, boolean gpsNavigator) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        String trCo="Not Available",GPS="Not Available";
        if (tripComputer){
            trCo="Available";
        }
        if (gpsNavigator){
            GPS="Available";
        }
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Trip Computer: " + trCo + "\n";
        info += "GPS Navigator: " + GPS + "\n";
        return info;
    }
}