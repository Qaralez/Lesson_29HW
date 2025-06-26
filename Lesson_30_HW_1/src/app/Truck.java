package app;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String number, String brand, int year, double loadCapacity) {
        super(number, brand, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity(){
        return loadCapacity;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Перевозим " + loadCapacity + " тонн груза.");

    }
}
