package LLD.Patterns.behavioral.ObserverPattern.Implentation;

import LLD.Patterns.behavioral.ObserverPattern.Implentation.observable.IntegerObservable;
import LLD.Patterns.behavioral.ObserverPattern.Implentation.observer.FirstObserver;
import LLD.Patterns.behavioral.ObserverPattern.Implentation.observer.SecondObserver;

public class Main {
    public static void main(String[] args) {
        //? Observer Pattern
        IntegerObservable integerObservable= new IntegerObservable();

        FirstObserver firstObserver= new FirstObserver(integerObservable);
        FirstObserver firstObserver1= new FirstObserver(integerObservable);
        FirstObserver firstObserver2= new FirstObserver(integerObservable);

        SecondObserver secondObserver= new SecondObserver(integerObservable);

        integerObservable.register(firstObserver);
        integerObservable.register(firstObserver1);
        integerObservable.register(firstObserver2);
        integerObservable.register(secondObserver);


        integerObservable.setData(23);
        integerObservable.setData(21);
    }
}
