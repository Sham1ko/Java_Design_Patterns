package Task_three;

public class CarManualBuilder implements Builder{
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gpsNavigator;

    @Override
    public void reset() {
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(boolean gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(seats, engine, tripComputer, gpsNavigator);
    }
}