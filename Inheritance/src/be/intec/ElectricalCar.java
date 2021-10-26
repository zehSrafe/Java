package be.intec;

public class ElectricalCar extends Car{
    private double batteryPercentage;

    public double getBatteryPercentage() {
        return batteryPercentage;
    }

    public void charge(){
        System.out.println("Car charging");
        while (batteryPercentage < 100){
            batteryPercentage++;
            System.out.println("Battery at " + batteryPercentage + "%");
        }
    }

    @Override
    public void acelerate() {
        System.out.println("Battery decharging");
    }

    @Override
    public void decelerate() {
        System.out.println("Bettery decharging slower");
    }
}
