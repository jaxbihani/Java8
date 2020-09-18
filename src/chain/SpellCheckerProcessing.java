package chain;

public class SpellCheckerProcessing<T> extends ProcessingObject<String> {
    @Override
    protected String handleWork(final String input) {
        return input.replace("labda","lambda");
    }
}
