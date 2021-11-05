package be.intec.oef7.livingThings;

public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Fish fish = new Fish();
        Bird bird = new Bird();
        Snake snake = new Snake();

        cat.makeNoise();
        cat.move();
        fish.makeNoise();
        fish.move();
        bird.makeNoise();
        bird.move();
        snake.makeNoise();
        snake.move();
    }
}
