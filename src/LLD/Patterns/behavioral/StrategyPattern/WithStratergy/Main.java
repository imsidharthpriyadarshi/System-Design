package LLD.Patterns.behavioral.StrategyPattern.WithStratergy;

public class Main {
    public static void main(String[] args) {

        //* With Strategy Pattern
        LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Vehicle off_road= new LLD.Patterns.behavioral.StrategyPattern.WithStratergy.PassengerVehicle();
        off_road.drive();
        LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Vehicle sportyVehicle= new LLD.Patterns.behavioral.StrategyPattern.WithStratergy.SportyVehicle();
        sportyVehicle.drive();
        LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Vehicle xyz= new LLD.Patterns.behavioral.StrategyPattern.WithStratergy.XyzVehicle();
        xyz.drive();

    }
}
