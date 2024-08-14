package LLD.Patterns.behavioral.mediatorPattern;

public interface Mediator {
    void addColleague(Colleague colleague);
    void placeBid(Colleague colleague, int amount);
}
