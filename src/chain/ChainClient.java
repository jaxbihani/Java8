package chain;

public class ChainClient {

    public void demo() {
        ProcessingObject<String> pObj1 = new HeaderTextProcessing<>();
        ProcessingObject<String> pObj2 = new SpellCheckerProcessing<>();

        pObj1.setSuccessor(pObj2);

        String result = pObj1.handle("Aren't labdas really good");
        System.out.println(result);
    }
}
