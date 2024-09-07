package designPattern.FactoryPattern;

public abstract class Creator {

    Product product;
    abstract public Product createObject();

    public void performAction(){
        product = createObject();
        product.clean();
        product.drive();
    }
}
