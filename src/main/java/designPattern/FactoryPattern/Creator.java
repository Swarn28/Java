package designPattern.FactoryPattern;

public abstract class Creator {

    Product product;
    abstract public Product createObject();

    // This is the abstract method.
    public void performAction(){
        product = createObject();
        product.clean();
        product.drive();
    }
}
