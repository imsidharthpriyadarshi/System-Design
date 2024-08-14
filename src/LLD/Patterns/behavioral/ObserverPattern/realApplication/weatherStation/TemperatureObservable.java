package LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation;

public interface TemperatureObservable {

    void add(TemperatureObserver observer);
    TemperatureObserver remove(TemperatureObserver observer);
    void notifying();
    void setTemp(int temp);
    int getTemp();


}
