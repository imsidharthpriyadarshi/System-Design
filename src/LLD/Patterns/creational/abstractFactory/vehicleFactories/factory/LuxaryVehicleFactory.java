package LLD.Patterns.creational.abstractFactory.vehicleFactories.factory;

import LLD.Patterns.creational.abstractFactory.Vehicle;
import LLD.Patterns.creational.abstractFactory.vehicleFactories.VehicleFactoryInt;
import LLD.Patterns.creational.abstractFactory.vehicles.luxary.Bently;
import LLD.Patterns.creational.abstractFactory.vehicles.luxary.Bmw;
import LLD.Patterns.creational.abstractFactory.vehicles.luxary.Mercidies;


public class LuxaryVehicleFactory implements VehicleFactoryInt {


    @Override
    public Vehicle getVehicle( String vehicle_name) {
        switch (vehicle_name.toLowerCase()){
            case "bmw":
                return new Bmw();
            case "mercedies":
                return new Mercidies();
            case  "bently":
                return  new Bently();
            default:
                return null;
        }
    }
}
