package TemplatePattern;

public abstract class Bevarages {

    public void preparingSteps(){
        brew();
        addTeaCoffee();
        pour();
        addOtherMaterial();
    }

    public void brew(){
        System.out.println("Brewing...");
    }

    public abstract void addTeaCoffee();

    public void pour(){
        System.out.println("pouring...");
    }

    public abstract void addOtherMaterial();

}
