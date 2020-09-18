package factory;

public class FactoryClient {

    public void demo() {
        Product p = ProductFactory.createProduct("loan");
        System.out.println(p.getClass().getCanonicalName());

        Product p1 = ProductFactory1.createProduct("bond");
        System.out.println(p1.getClass().getCanonicalName());

    }
}
