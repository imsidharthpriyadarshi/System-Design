package LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.cmd;


import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.ICommandWithOneParameter;
import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.reciever.AirConditioner;

import java.util.Stack;

public class SetTempAc  implements ICommandWithOneParameter {
    private final AirConditioner ac;
    private Stack<Integer> temp_his;

    public SetTempAc(AirConditioner ac){
        this.ac=ac;
        this.temp_his= new Stack<>();
    }

    @Override
    public void execute(int temp) {
        this.ac.setTemp(temp);
        this.temp_his.push(temp);

    }
    @Override
    public void undo() {
        if(this.temp_his.size()>1){
            //first popping current temp
            this.temp_his.pop();
            this.ac.setTemp(this.temp_his.peek());
        }else {
            System.out.println("No more temp You had set to the ac");
        }
    }
}
