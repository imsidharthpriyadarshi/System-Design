package LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.observer;

import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.TemperatureObservable;
import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.TemperatureObserver;

public class RoadTempDisplayObserver implements TemperatureObserver {
    private TemperatureObservable observable;
    public RoadTempDisplayObserver(TemperatureObservable temperatureObservable){
        this.observable= temperatureObservable;
    }
    @Override
    public void update() {
        System.out.println("Oh! Road Display received updated temp successfully "+ observable.getTemp());

    }
}
