package app;

public class Bus extends Vehicle{
    private int numberOfPassengers;

    public Bus(String number, String brand, int year, int numberOfPassengers) {
        super(number, brand, year);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers(){
        return numberOfPassengers;

    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Везем " + numberOfPassengers + " пассажиров.");
    }
}
