package LLD.Patterns.behavioral.mediatorPattern.mediators;

import LLD.Patterns.behavioral.mediatorPattern.Colleague;
import LLD.Patterns.behavioral.mediatorPattern.Mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
    private List<Colleague> bidders;
    private int bidAmount;
    public AuctionMediator(){
        bidders= new ArrayList<>();
        bidAmount=0;
    }
    @Override
    public void addColleague(Colleague colleague) {
        this.bidders.add(colleague);

    }

    @Override
    public void placeBid(Colleague colleague, int amount) {
        if(amount>bidAmount){
            this.bidAmount=amount;
            for (Colleague coll:this.bidders){
                coll.receiveBidNotification(colleague.getName(),this.bidAmount);
            }

        }else {
            System.out.println("Sorry Dear"+colleague.getName()+" , Current bid amount ("+this.bidAmount+") is higher than your amount, I can not place your bid");
        }

    }
}
