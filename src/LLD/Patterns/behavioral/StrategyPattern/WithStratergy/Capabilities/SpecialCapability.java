package LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Capabilities;

public class SpecialCapability implements Drive{
    @Override
    public void drive() {
        System.out.println("Special Capability");
    }
}
