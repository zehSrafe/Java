package be.intec;

import java.util.Objects;

public class GasolineCar extends Car{
    private int tank;

    public GasolineCar() {
        this(89);
    }

    public GasolineCar(int tank) {
        this(tank, "Yellow");
    }

    public GasolineCar(int tank, String color) {
        this.tank = tank;
        super.setColor(color);
    }

    public void doRefill(int amount){
        if (tank + amount > 100){
            tank = 100;
        } else {
            tank += amount;
        }
    }

    @Override
    public void acelerate(){
        tank -= 2;
        super.acelerate();
    }

    @Override
    public String toString() {
        return String.format("tank: %d, Color: %s", tank, super.getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GasolineCar that = (GasolineCar) o;
        return tank == that.tank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tank);
    }
}
