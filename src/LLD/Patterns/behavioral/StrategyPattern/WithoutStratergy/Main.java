package LLD.Patterns.behavioral.StrategyPattern.WithoutStratergy;

public class Main {
    public static void main(String[] args) {
        //? Without Strategy Pattern
        //** This pattern needs when child class not using the base class default implementation
        //** these children wrote their own implementation of method but these implementation is common
        //** between other child class , in future this problem generates scalability issues and code duplication

        Vehicle off= new OffRoadVehicle();
        off.drive();
        Vehicle sporty= new SportyVehicle();
        sporty.drive();
        Vehicle passenger= new PassengerVehicle();
        passenger.drive();


    }
}
