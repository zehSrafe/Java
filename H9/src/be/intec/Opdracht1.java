package be.intec;

import java.awt.*;

public class Opdracht1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle();

        Rectangle[] rectArray = new Rectangle[]{rectangle, rectangle, rectangle};
        Circle[] circleArray = new Circle[]{circle, circle};

        Logo logo = new Logo(rectArray, circleArray, "Testicles.co");


        System.out.println(logo.toString());
    }
}
