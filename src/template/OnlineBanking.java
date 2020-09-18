package template;
/*
The template method design pattern is a common solution when you need to represent the outline of an
algorithm and have the additional flexibility to change certain parts of it
 */
public abstract class OnlineBanking {

    public void aLotOfCode(){}

    public void processCustomer(int id){
        //Customer c = Database.getCustomerWithId(id);
        //int id = 1;
        makeCustomerHappy(1);
    }

    // Give either offers or discounts
    abstract void makeCustomerHappy(int cID);
}
