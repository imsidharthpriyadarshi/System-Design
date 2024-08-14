package LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.observable;

import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.TemperatureObservable;
import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.TemperatureObserver;

import java.util.ArrayList;
import java.util.List;

public class TempObservable implements TemperatureObservable {
    private final List<TemperatureObserver> observerList;
    private int current_temp;
    public TempObservable(){
        this.observerList= new ArrayList<>();
        current_temp=23;
    }
    @Override
    public void add(TemperatureObserver observer) {
        observerList.add(observer);

    }

    @Override
    public TemperatureObserver remove(TemperatureObserver observer) {
        if (observerList.contains(observer)){
            observerList.remove(observer);
        }else{
            System.out.println("Sorry Requested observer is not registered with Temperature observable");
            return null;
        }
        return observer;
    }

    @Override
    public void notifying() {
        for (TemperatureObserver observer:observerList)
            observer.update();

    }

    @Override
    public void setTemp(int temp) {
        if (temp!=current_temp){
            this.current_temp= temp;
            notifying();

        }

    }

    @Override
    public int getTemp() {
        return current_temp;

    }
}
