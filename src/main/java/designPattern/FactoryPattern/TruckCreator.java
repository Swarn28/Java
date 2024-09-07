package designPattern.FactoryPattern;

public class TruckCreator extends Creator{

    @Override
    public Product createObject() {
        return new TruckProduct();
    }
}
