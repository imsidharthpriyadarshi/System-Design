package LLD.Patterns.creational.abstractFactory;

import LLD.Patterns.creational.abstractFactory.vehicleFactories.VehicleFactoryInt;

public class Main {
    public static void main(String[] args) {

        //** Abstract Factory method
        MainVehicleFactory mainVehicleFactory = new MainVehicleFactory();
        VehicleFactoryInt vehicleFactory=mainVehicleFactory.getVehicleTypeFactory(true);
        Vehicle bmw= vehicleFactory.getVehicle("bmw");
        System.out.println(bmw.getAverage());

    }
}
