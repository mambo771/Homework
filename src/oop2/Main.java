package oop2;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car("BMW M5");
        Car audi = new Car("Q5");
        Bicycle forward = new Bicycle("Forward");
        Bicycle aist = new Bicycle("Aist");
        Truck kamaz = new Truck("Камаз", 6);
        TransportService[] transports = {
                bmw,
                audi,
                forward,
                aist,
                kamaz
        };
        ServiceStation serviceStation = new ServiceStation();
        for (TransportService transport: transports){
            serviceStation.check(transport);
        }
    }
}

