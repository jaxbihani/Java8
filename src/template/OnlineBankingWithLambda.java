package template;

import java.util.function.Consumer;

public  class OnlineBankingWithLambda {

    public void aLotOfCode(){}

    public void processCustomer(Integer id, Consumer<Integer> makeCustomerHappy){
        aLotOfCode();
        makeCustomerHappy.accept(id);
    }
}
