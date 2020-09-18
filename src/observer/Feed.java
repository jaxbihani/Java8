package observer;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    // Business logic
    //

    @Override
    public void registerObserver(final Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObservers(final String tweet) {
        observers.forEach(o -> o.notify(tweet));
    }
}
