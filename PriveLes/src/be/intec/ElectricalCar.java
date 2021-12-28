package be.intec;

import java.util.Objects;

public class ElectricalCar extends Car{
    private double batteryPercentage;

    public ElectricalCar() {
        this.batteryPercentage = 50;
    }

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
    public String toString() {
        return "" + batteryPercentage;
    }

    @Override
    public void acelerate() {
        System.out.println("Battery decharging");
    }

    @Override
    public void decelerate() {
        System.out.println("Bettery decharging slower");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricalCar that = (ElectricalCar) o;
        return Double.compare(that.batteryPercentage, batteryPercentage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryPercentage);
    }
}
