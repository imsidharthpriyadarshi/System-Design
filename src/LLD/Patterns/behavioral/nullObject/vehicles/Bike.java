package LLD.Patterns.behavioral.nullObject.vehicles;

import LLD.Patterns.behavioral.nullObject.Vehicle;

public class Bike implements Vehicle {
    @Override
    public int getSeatingCapacity() {
        return 2;
    }

    @Override
    public int getTankCapacity() {
        return 10;
    }
}
