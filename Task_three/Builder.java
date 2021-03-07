package Task_three;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTripComputer(boolean tripComputer);
    void setGPSNavigator(boolean gpsNavigator);
}