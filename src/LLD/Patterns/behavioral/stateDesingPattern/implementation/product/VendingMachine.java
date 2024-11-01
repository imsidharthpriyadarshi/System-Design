package LLD.Patterns.behavioral.stateDesingPattern.implementation.product;

import LLD.Patterns.behavioral.stateDesingPattern.implementation.IState;
import LLD.Patterns.behavioral.stateDesingPattern.implementation.Item;

import java.util.List;

public class VendingMachine {
    private IState iState;
    private List<Item> products;
    private boolean isWorking;



    public void setNextState(IState nextState){
        this.iState=nextState;
    }
    public boolean setIsWorking(){
        return isWorking;
    }





}
