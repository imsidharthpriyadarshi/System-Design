package LLD.Patterns.behavioral.StrategyPattern.WithStratergy;

import LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Capabilities.SpecialCapability;

public class SportyVehicle extends Vehicle{
    public SportyVehicle(){
        super(new SpecialCapability());
    }
}
