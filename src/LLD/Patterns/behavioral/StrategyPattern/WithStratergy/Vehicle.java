package LLD.Patterns.behavioral.StrategyPattern.WithStratergy;

import LLD.Patterns.behavioral.StrategyPattern.WithStratergy.Capabilities.Drive;

public class Vehicle {
    private Drive drive;
    public Vehicle(Drive drive){
        this.drive= drive;
    }
    public void drive(){
        drive.drive();
    }
}
