package LLD.Patterns.behavioral.ObserverPattern.Implentation;

public interface Observable {
    void register(Observer observer);
    Observer remove(Observer observer);
    void notifies();
    void setData(Integer new_data);
    int getData();

}
