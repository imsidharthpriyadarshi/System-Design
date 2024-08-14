package LLD.Patterns.behavioral.nullObject;

public class Main {
    public static void main(String[] args) {
        //? Null object pattern
        Vehicle car= VehicleFactory.getObject("car");
        Vehicle null_obj =VehicleFactory.getObject("null");
        printVehicle(car);
        printVehicle(null_obj);

    }
        public static void printVehicle(Vehicle veh){
        System.out.println("Tank capacity "+veh.getTankCapacity());
        System.out.println("Seating capacity "+veh.getSeatingCapacity());
    }
}
