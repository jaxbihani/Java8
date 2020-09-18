package strategy;

/*
       Strategy Pattern is letting you choose family of algorithms at runtime.
        -- Input Validations
        -- Parsing
 */
public interface ValidationStrategy {
    boolean execute(String s);
}
