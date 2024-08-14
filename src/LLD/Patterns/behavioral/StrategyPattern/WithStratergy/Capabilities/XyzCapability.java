package LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Capabilities;

public class XyzCapability implements Drive{
    @Override
    public void drive(){
        System.out.println("Xyz Capability");
    }
}
