package patterns;

import java.util.function.Supplier;

public class Logger {

    public enum LEVEL {FINER, DEBUG, INFO, ERROR};

    public boolean isLoggable(LEVEL l) {
           return l == LEVEL.INFO;
    }

    public void log(LEVEL l, String msg) {
        if(isLoggable(l)) {
            System.out.println(msg);
        }
    }

    public void log(LEVEL l, Supplier<String> msgSupplier) {
        if(isLoggable(l)) {
            System.out.println(msgSupplier.get());
        }
    }


}
