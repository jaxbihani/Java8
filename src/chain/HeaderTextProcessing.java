package chain;

public class HeaderTextProcessing<T> extends ProcessingObject<String> {
    @Override
    protected String handleWork(final String input) {
        return "From Rhea Chakraborty to Kangana Ranaut: " + input;
    }
}
