package designPattern.BuilderPattern;

public class PhoneBuilder {

    int weight;
    String company;
    int RAM;
    int cameraPixels;
    int totalCameras;
    boolean isTouchScreen;
    boolean isKeypad;
    String color;

    public PhoneBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public PhoneBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public PhoneBuilder setCameraPixels(int cameraPixels) {
        this.cameraPixels = cameraPixels;
        return this;
    }

    public PhoneBuilder setTotalCameras(int totalCameras) {
        this.totalCameras = totalCameras;
        return this;
    }

    public PhoneBuilder setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
        return this;
    }

    public PhoneBuilder setKeypad(boolean keypad) {
        isKeypad = keypad;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Phone phoneBuilder(){
       Phone phone = new Phone(weight,company,RAM,cameraPixels,totalCameras,isTouchScreen,isKeypad,color);
        return phone;
    }
}
