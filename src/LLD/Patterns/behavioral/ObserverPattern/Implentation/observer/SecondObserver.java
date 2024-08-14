package LLD.Patterns.behavioral.ObserverPattern.Implentation.observer;

import LLD.Patterns.behavioral.ObserverPattern.Implentation.Observable;
import LLD.Patterns.behavioral.ObserverPattern.Implentation.Observer;

public class SecondObserver implements Observer {
    private Observable observable;
    public SecondObserver(Observable observable){
        this.observable= observable;
    }

    @Override
    public void update() {
        System.out.println("Oh! I received updated data successfully "+observable.getData());

    }
}
