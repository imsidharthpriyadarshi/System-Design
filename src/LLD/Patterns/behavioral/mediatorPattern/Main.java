package LLD.Patterns.behavioral.mediatorPattern;

import LLD.Patterns.behavioral.mediatorPattern.bidder.Bidder;
import LLD.Patterns.behavioral.mediatorPattern.mediators.AuctionMediator;

public class Main {
    public static void main(String[] args) {
        //?Mediator Pattern
        Mediator auctionMediator= new AuctionMediator();
        Colleague bidder1= new Bidder(auctionMediator,"Sidharth");
        Colleague bidder2= new Bidder(auctionMediator,"Gita");
        Colleague bidder3= new Bidder(auctionMediator,"Ram");
        Bidder bidder4= new Bidder(auctionMediator,"Shayam");
        auctionMediator.addColleague(bidder4);
        auctionMediator.addColleague(bidder3);
        auctionMediator.addColleague(bidder2);
        auctionMediator.addColleague(bidder1);
        bidder1.placeBid(100000);

        bidder4.placeBid(200000);

        bidder3.placeBid(250000);

        bidder2.placeBid(200000);

        bidder1.placeBid(800000);

    }
}
