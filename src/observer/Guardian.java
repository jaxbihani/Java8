package observer;

public class Guardian implements Observer {
    @Override
    public void notify(final String tweet) {
        if(tweet != null && tweet.contains("queen")){
            System.out.println("Yet another news in London... " + tweet);
        }
    }
}
