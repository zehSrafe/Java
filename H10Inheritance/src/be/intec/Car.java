package be.intec;

public class Car {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void acelerate(){
        System.out.println("Car going faster");
    }

    public void decelerate(){
        System.out.println("Car going slower");
    }
}
