package designPattern.observateur;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(Object data){
        for (Observer observer : observers){
            observer.update(data);
        }
    }
}
