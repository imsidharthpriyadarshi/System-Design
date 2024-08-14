package LLD.Patterns.behavioral.nullObject;

import LLD.Patterns.behavioral.nullObject.vehicles.Bike;
import LLD.Patterns.behavioral.nullObject.vehicles.Car;
import LLD.Patterns.behavioral.nullObject.vehicles.NullVehicle;

public class VehicleFactory {
    public static Vehicle getObject(String type){
        switch (type.toLowerCase()){
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                return new NullVehicle();
        }

    }
}
