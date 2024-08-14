package LLD.Patterns.behavioral.nullObject.vehicles;

import LLD.Patterns.behavioral.nullObject.Vehicle;

public class Car implements Vehicle {
    @Override
    public int getSeatingCapacity() {
        return 5;
    }

    @Override
    public int getTankCapacity() {
        return 25;
    }
}
