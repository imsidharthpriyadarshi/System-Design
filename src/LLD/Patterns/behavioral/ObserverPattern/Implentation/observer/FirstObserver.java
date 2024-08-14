package LLD.Patterns.behavioral.ObserverPattern.Implentation.observer;

import LLD.Patterns.behavioral.ObserverPattern.Implentation.Observable;
import LLD.Patterns.behavioral.ObserverPattern.Implentation.Observer;

public class FirstObserver implements Observer {
    private Observable  observable;
    public FirstObserver(Observable observable){
        this.observable= observable;
    }
    @Override
    public void update() {
        System.out.println("Oh! I also received updated data successfully "+observable.getData());
    }
}
