package LLD.Patterns.creational.abstractFactory;

import LLD.Patterns.creational.abstractFactory.vehicleFactories.VehicleFactoryInt;
import LLD.Patterns.creational.abstractFactory.vehicleFactories.factory.LuxaryVehicleFactory;
import LLD.Patterns.creational.abstractFactory.vehicleFactories.factory.OrdinaryVehicleFactory;

public class MainVehicleFactory {
    public VehicleFactoryInt getVehicleTypeFactory(boolean is_lux){
        if (is_lux)return new LuxaryVehicleFactory();
        else return  new OrdinaryVehicleFactory();
    }
}
