package be.intec;

public class GasolineCar extends Car{
    private int tank;

    public GasolineCar() {
        this(89);
    }

    public GasolineCar(int tank) {
        this.tank = tank;
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
    }
}
