package LLD.Patterns.behavioral.StrategyPattern.WithStratergy;

import LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Capabilities.XyzCapability;

public class XyzVehicle extends Vehicle{
    public XyzVehicle(){
        super(new XyzCapability());
    }
}
