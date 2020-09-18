import chain.ChainClient;
import chain.ChainClient1;
import factory.FactoryClient;
import observer.ObserverClient;
import observer.ObserverClient1;
import patterns.Client;
import patterns.ExecuteAround;
import patterns.Logger;
import strategy.IsAllLowerCase;
import strategy.IsNumeric;
import strategy.Validator;
import template.OnlineBankingWithLambda;

public class Main {

    public static void main(String [] args) throws Exception{

        // Conditional Deferred Execution
//        Client client = new Client();
//        Logger logger = new Logger();
//
//        System.out.println("Working log");
//        if(logger.isLoggable(Logger.LEVEL.INFO)) {
//            logger.log(Logger.LEVEL.INFO,"Hey");
//        }
//
//        System.out.println("Log to be skipped without lambda");
//        logger.log(Logger.LEVEL.DEBUG,"Hey"+client.expensive());
//
//        System.out.println("Log to be skipped with lambda");
//        logger.log(Logger.LEVEL.DEBUG, () -> "Hey"+client.expensive());

        //Execute around pattern
 //       ExecuteAround.invoke();

        // Strategy Pattern

        // Use classical way
//        Validator numericV = new Validator(new IsNumeric());
//        System.out.println(numericV.validate("aa"));
//
//        Validator lowerV = new Validator(new IsAllLowerCase());
//        System.out.println(lowerV.validate("DDF"));
//
//        // Use Lambdas
//        Validator numericV1 = new Validator(s -> s.matches("\\d+"));
//        System.out.println(numericV1.validate("aa"));
//
//        Validator lowerV1 = new Validator(s -> s.matches("[a-z]+"));
//        System.out.println(lowerV1.validate("DDF"));

        // Template
//        new OnlineBankingWithLambda().processCustomer(112,
//                i -> System.out.println("Discount :" + i));
//
//        new OnlineBankingWithLambda().processCustomer(113,
//                i -> System.out.println("Offer :" + i));

        // Observer

//        ObserverClient observerClient = new ObserverClient();
//        observerClient.demo();
//
//        ObserverClient1 observerClient1 = new ObserverClient1();
//        observerClient1.demo();

        //Chain
//        ChainClient chainClient = new ChainClient();
//        chainClient.demo();

//        ChainClient1 chainClient1 = new ChainClient1();
//        chainClient1.demo();


        // Factory
        FactoryClient factoryClient = new FactoryClient();
        factoryClient.demo();


    }
}
