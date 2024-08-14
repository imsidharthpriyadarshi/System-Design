package LLD.Patterns.behavioral.mediatorPattern;

public interface Colleague {
    void placeBid(int amount);
    void receiveBidNotification(String colleague_name,int bidAmount);
    String getName();
}
