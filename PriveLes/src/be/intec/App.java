package be.intec;

public class App {
    public static void main(String[] args) {
//        GasolineCar mustang = new GasolineCar();
//        GasolineCar carr = new GasolineCar(20);
//        GasolineCar carrtrrrr = new GasolineCar(25, "rouge");
//        System.out.println(mustang);
//        mustang.acelerate();
//        System.out.println(mustang);
//        System.out.println(carr);
//        System.out.println(carrtrrrr);

//        GasolineCar carrtrrrr = new GasolineCar(25, "rouge");
//        ElectricalCar el = new ElectricalCar();

//        Car[] cars = {mustang, carr, carrtrrrr, el};
//        for (Car c : cars){
//            System.out.println(c);
//        }

//        mustang.decelerate();

//        Car car = new GasolineCar();
//        System.out.println(car);

        GasolineCar carr = new GasolineCar(20);
        ElectricalCar el = new ElectricalCar();

        carr.doRefill(50);


        GasolineCar mustang = new GasolineCar();
        GasolineCar mustang1 = new GasolineCar();

        System.out.println(mustang.equals(mustang1));
    }
}
