package LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.observer;

import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.TemperatureObservable;
import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.TemperatureObserver;

public class TelevisionDisplayObserver implements TemperatureObserver {
    private TemperatureObservable observable;
    public TelevisionDisplayObserver(TemperatureObservable temperatureObservable){
        this.observable= temperatureObservable;
    }
    @Override
    public void update() {
        System.out.println("Oh! Television received updated temp successfully "+ observable.getTemp());

    }
}
