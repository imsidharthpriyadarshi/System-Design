package LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter;

import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.cmd.SetTempAc;
import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.cmd.TurnOfAc;
import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.cmd.TurnOnAc;
import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.invoker.MyRemoteControl;
import LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.reciever.AirConditioner;

public class Main {
    public static void main(String[] args) {
        //!this implementation is not implemented in good manner i'll create an interface compermising iterface segmentation principle also
        //!i don't need to keep stack in setTempCmd because i can handel this creating every time new object of cmd instead of reusing it

        //?Command Design Pattern
        //receiver
        AirConditioner receiver= new AirConditioner();
        //invoker
        MyRemoteControl invoker=new MyRemoteControl();
        //cmds init all type of cmd don't create new Object of cmd every time
        ICommand turn_on= new TurnOnAc(receiver);
        ICommand turn_off= new TurnOfAc(receiver);
        ICommandWithOneParameter setTem= new SetTempAc(receiver);



        invoker.setSimpleCommand(turn_on);
        invoker.pressButton();

        invoker.setSimpleCommand(turn_off);
        invoker.pressButton();

        invoker.setCommandWithOneParameter(setTem);
        invoker.pressButton(23);

        invoker.setCommandWithOneParameter(setTem);
        invoker.pressButton(20);

        invoker.setCommandWithOneParameter(setTem);
        invoker.pressButton(18);

        invoker.setCommandWithOneParameter(setTem);
        invoker.pressButton(29);

        invoker.simpleUndo();

        System.out.println(receiver.getTemp());
        invoker.oneParameterUndoCmd();

        System.out.println(receiver.getTemp());

        invoker.oneParameterUndoCmd();

        System.out.println(receiver.getTemp());

        invoker.oneParameterUndoCmd();

        System.out.println(receiver.getTemp());

        invoker.oneParameterUndoCmd();

        System.out.println(receiver.getTemp());


    }
}
