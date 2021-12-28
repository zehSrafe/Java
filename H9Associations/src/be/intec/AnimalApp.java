package be.intec;

public class AnimalApp {
    public static void main(String[] args) {
        Pet hond = new Pet("hond");
        Owner bob = new Owner("Bob");

        bob.setPet(hond);

        System.out.println(bob);
    }
}
