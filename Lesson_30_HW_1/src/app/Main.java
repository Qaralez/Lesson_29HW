package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new Car("BOT283", "Opel", 2003));
        vehicles.add(new Bus("BOT282", "Man", 2019, 52));
        vehicles.add(new Truck("BOT281", "Volvo", 2017, 13.6));

        for (Vehicle v: vehicles){
            v.drive();
            System.out.println();
        }

    }
}
