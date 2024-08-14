package LLD.Patterns.behavioral.nullObject.vehicles;

import LLD.Patterns.behavioral.nullObject.Vehicle;

public class NullVehicle implements Vehicle {

    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
