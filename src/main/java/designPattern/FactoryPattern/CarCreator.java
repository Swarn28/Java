package designPattern.FactoryPattern;

public class CarCreator extends Creator {
    @Override
    public Product createObject() {
        return new CarProduct();
    }
}
