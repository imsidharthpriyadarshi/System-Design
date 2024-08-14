package LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation;

import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.observable.TempObservable;
import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.observer.MobileDisplayObserver;
import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.observer.RoadTempDisplayObserver;
import LLD.Patterns.behavioral.ObserverPattern.realApplication.weatherStation.observer.TelevisionDisplayObserver;

public class Main {
    public static void main(String[] args) {
        //*Weather Station who is responsible to notify all the subscriber on change of temperature
        //*note: who register themselves with temp observable, like televisionScreen, MobileDisplay
        TemperatureObservable temperatureObservable= new TempObservable();

        TemperatureObserver televisionDisplay= new TelevisionDisplayObserver(temperatureObservable);
        TemperatureObserver phoneDisplay=new MobileDisplayObserver(temperatureObservable);
        TemperatureObserver roadDisplay= new RoadTempDisplayObserver(temperatureObservable);

        temperatureObservable.add(televisionDisplay);
        temperatureObservable.add(phoneDisplay);
        temperatureObservable.add(roadDisplay);

        temperatureObservable.setTemp(24);
        temperatureObservable.setTemp(24);
        temperatureObservable.setTemp(25);

    }
}
