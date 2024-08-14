package LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.observer;

import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.TemperatureObservable;
import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.TemperatureObserver;

public class MobileDisplayObserver implements TemperatureObserver {
    private TemperatureObservable observable;
    public MobileDisplayObserver(TemperatureObservable temperatureObservable){
        this.observable= temperatureObservable;
    }
    @Override
    public void update() {
        System.out.println("Oh! Mobile received updated temp successfully "+ observable.getTemp());

    }
}
 