package observer;

public class ObserverClient1 {

    public void demo() {
        Feed f = new Feed();

//        f.registerObserver((String tweet) -> {
//            if(tweet != null && tweet.contains("money")){
//                System.out.println("Breaking news in NY! " + tweet);
//            }
//        });

        f.registerObserver(ObserverUtil::NYTimesImpl);

        f.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("queen")){
                System.out.println("Yet another news in London... " + tweet);
            }
        });

        f.notifyObservers("The queen said - fuck off and didn't give money!");
    }
}
