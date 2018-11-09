import java.util.Enumeration;
import java.util.Vector;

public class AbtractSubject implements Subject {
    Vector<Observer> observers = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = observers.elements();
        while (enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }

    @Override
    public void operation() {

    }

}
