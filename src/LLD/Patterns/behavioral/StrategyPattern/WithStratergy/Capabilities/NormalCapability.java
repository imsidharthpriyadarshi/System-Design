package LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Capabilities;

public class NormalCapability implements Drive{
    @Override
    public void drive() {
        System.out.println("Normal Capability");
    }
}
