package LLD.Patterns.creational.abstractFactory.vehicleFactories;

import LLD.Patterns.creational.abstractFactory.Vehicle;

public interface VehicleFactoryInt {
    Vehicle getVehicle(String vehicle_name);
}
