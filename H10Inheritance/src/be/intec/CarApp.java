package be.intec;

public class CarApp {
    public static void main(String[] args) {
        ElectricalCar electricalCar = new ElectricalCar();

        System.out.println(electricalCar.getBatteryPercentage());
        electricalCar.charge();

        electricalCar.setColor("Magenta");
        System.out.println(electricalCar.getColor());

        electricalCar.acelerate();
        electricalCar.decelerate();
    }
}
