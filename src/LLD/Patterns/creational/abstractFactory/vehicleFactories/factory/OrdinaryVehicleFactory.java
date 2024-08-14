package LLD.Patterns.creational.abstractFactory.vehicleFactories.factory;

import LLD.Patterns.creational.abstractFactory.Vehicle;
import LLD.Patterns.creational.abstractFactory.vehicleFactories.VehicleFactoryInt;
import LLD.Patterns.creational.abstractFactory.vehicles.ordinary.Hundia;
import LLD.Patterns.creational.abstractFactory.vehicles.ordinary.Swift;

public class OrdinaryVehicleFactory implements VehicleFactoryInt {
    @Override
    public Vehicle getVehicle(String vehicle_name) {

        switch (vehicle_name.toLowerCase()){
            case "swift":
                return new Swift();
            case "hundia":
                return new Hundia();
            default:
                return null;
        }

    }
}
