package observer;

public class ObserverUtil {

    public static void NYTimesImpl(String tweet) {
        if(tweet != null && tweet.contains("money")){
            System.out.println("Breaking news in NY! " + tweet);
        }
    }
}
