package LLD.Patterns.behavioral.ObserverPattern.Implentation.observable;

import LLD.Patterns.behavioral.ObserverPattern.Implentation.Observable;
import LLD.Patterns.behavioral.ObserverPattern.Implentation.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IntegerObservable implements Observable {
    private List<Observer> observerList= new ArrayList<>();
    private Integer data;
    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public Observer remove(Observer observer) {
        observerList.remove(observer);
        return observer;
    }

    @Override
    public void notifies() {
        for (Observer observer:observerList){
            observer.update();
        }

    }

    @Override
    public void setData(Integer new_data) {
        if(!Objects.equals(data, new_data)) {
            this.data= new_data;
            notifies();
        }

    }

    @Override
    public int getData() {
        return data;

    }
}
