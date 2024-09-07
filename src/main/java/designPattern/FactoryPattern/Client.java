package designPattern.FactoryPattern;

public class Client {
    String clientInput="";
    public static void main(String[] args) {
        Client client = new Client();
        client.bookVehicle("Car");
    }

    public void bookVehicle(String clientInput){
        Creator creator= null;
        if(clientInput.equalsIgnoreCase("Truck")){
             creator = new TruckCreator();
        }
        else if(clientInput.equalsIgnoreCase("Car")){
             creator = new CarCreator();
        }

        creator.createObject();
        creator.performAction();
    }
}
