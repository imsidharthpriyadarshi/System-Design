package LLD.Patterns.behavioral.mediatorPattern.bidder;

import LLD.Patterns.behavioral.mediatorPattern.Colleague;
import LLD.Patterns.behavioral.mediatorPattern.Mediator;

public class Bidder implements Colleague {
    private Mediator mediator;
    private String name;
    public Bidder(Mediator mediator, String name){
        this.mediator=mediator;
        this.name= name;
    }
    @Override
    public void placeBid(int amount) {
        mediator.placeBid(this,amount);

    }

    @Override
    public void receiveBidNotification(String name,int bidAmount) {
        System.out.println("Ok! "+ name +" placed another bid of amount "+bidAmount);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
