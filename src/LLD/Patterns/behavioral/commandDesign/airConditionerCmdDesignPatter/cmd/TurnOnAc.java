package LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.cmd;

import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.ICommand;
import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.reciever.AirConditioner;

public class TurnOnAc implements ICommand {
    private final AirConditioner ac;

    public TurnOnAc(AirConditioner ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();

    }
    @Override
    public void undo() {
        this.ac.turnOfAc();
    }
}
