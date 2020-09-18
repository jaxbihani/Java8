package patterns;

public class Client {

    public String expensive()  {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }
}
