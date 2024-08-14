package LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.cmd;

import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.ICommand;
import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.reciever.AirConditioner;

public class TurnOfAc implements ICommand {
    private final AirConditioner ac;

    public TurnOfAc(AirConditioner ac){
        this.ac=ac;
    }
    @Override
    public void undo() {
        this.ac.turnOnAc();
    }
    @Override
    public void execute() {
        ac.turnOfAc();
    }
}
