/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer4;

import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> observers;
    public Subject() {
        observers = new ArrayList<>();
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    protected abstract void notifyObserver();
}
