package observer;

public class ObserverClient {

    public void demo() {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.notifyObservers("The queen said - fuck off!");
    }
}
