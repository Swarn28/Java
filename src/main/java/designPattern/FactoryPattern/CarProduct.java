package designPattern.FactoryPattern;

public class CarProduct implements Product{

    @Override
    public void drive() {
        System.out.println("Driving Car....");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Car...");
    }
}
