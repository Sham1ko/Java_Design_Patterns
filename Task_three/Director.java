package Task_three;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTripComputer(true);
        builder.setGPSNavigator(true);
    }
}
