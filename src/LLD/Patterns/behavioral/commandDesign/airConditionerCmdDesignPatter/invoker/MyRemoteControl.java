package LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.invoker;


import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.ICommand;
import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.ICommandWithOneParameter;

import java.util.Stack;

public class MyRemoteControl {
    private ICommand iCommand;
    private Stack<ICommand> iCommandStack= new Stack<>();

    private Stack<ICommandWithOneParameter> iCommandWithOneParameterStack;
    private ICommandWithOneParameter iCommandWithOneParameter;
    public MyRemoteControl(){
        this.iCommandWithOneParameterStack=new Stack<>();

    }
    public void setSimpleCommand(ICommand command){
        this.iCommand=command;
    }

    public void setCommandWithOneParameter(ICommandWithOneParameter iCommandWithOneParameter){
        this.iCommandWithOneParameter=iCommandWithOneParameter;
    }

    public void pressButton(){
        iCommand.execute();
        iCommandStack.push(iCommand);
    }

    public void pressButton(int temp){
        this.iCommandWithOneParameter.execute(temp);
        iCommandWithOneParameterStack.push(this.iCommandWithOneParameter);
    }

    public void simpleUndo(){
        if (!this.iCommandStack.empty()){
            iCommandStack.pop().undo();
        }else {
            System.out.println("No more cmd you given to the ac");
        }
    }

    public void oneParameterUndoCmd(){
        if (!this.iCommandWithOneParameterStack.empty()){
            iCommandWithOneParameterStack.pop().undo();
        }else {
            System.out.println("No more cmd you given to the ac");
        }
    }
}
