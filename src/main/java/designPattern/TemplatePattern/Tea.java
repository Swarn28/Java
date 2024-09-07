package designPattern.TemplatePattern;

public class Tea extends Bevarages {
    @Override
    public void addTeaCoffee() {
        System.out.println("Added Tea....");
    }

    @Override
    public void addOtherMaterial() {
        System.out.println("Added Lemon..");
    }
}
