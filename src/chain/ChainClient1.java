package chain;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChainClient1 {

    public void demo() {

        UnaryOperator<String> headerProcessing = (String text) -> "From Rhea Chakraborty to "
                + "Kangana Ranaut: " + text;
        UnaryOperator<String> spellCheckProcessing = (String text) -> text.replace("labda",
                "lambda");
        Function<String,String> pipeline = headerProcessing.andThen(spellCheckProcessing);
        String result = pipeline.apply("Aren't labdas really good");
        System.out.println(result);
    }
}
