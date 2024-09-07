package designPattern.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setKeypad(false).setCameraPixels(45).setColor("blue")
                .setCompany("IQOO").setTotalCameras(2).setTouchScreen(true).setWeight(25).setRAM(8).phoneBuilder();
        Phone p1 = new PhoneBuilder().setColor("Red").setRAM(12).setKeypad(true).setCompany("Apple").phoneBuilder();

        System.out.println(p.toString());
        System.out.println(p1.toString());
    }
}
