package LLD.Patterns.behavioral.StrategyPattern.WithStratergy;

import LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Capabilities.SpecialCapability;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SpecialCapability());
    }

}
