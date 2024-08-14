package LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter;

public interface ICommandWithOneParameter {
    void execute(int temp);
    void undo();

}
