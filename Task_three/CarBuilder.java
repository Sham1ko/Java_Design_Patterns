package Task_three;

public class CarBuilder implements Builder {
    private int seats;
    private Engine engine;
    private boolean tripComputer,gpsNavigator;
    private Car car;

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

    public Car getResult() {
        return new Car(seats, engine, tripComputer, gpsNavigator);
    }
}
