package designPattern.FactoryPattern;

public class TruckProduct implements  Product{

    @Override
    public void drive() {
        System.out.println("Driving Truck....");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Truck...");
    }
}
