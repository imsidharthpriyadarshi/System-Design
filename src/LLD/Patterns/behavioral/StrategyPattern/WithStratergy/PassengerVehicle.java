package LLD.Patterns.behavioral.StrategyPattern.WithStratergy;

import LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Capabilities.NormalCapability;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalCapability());
    }
}
