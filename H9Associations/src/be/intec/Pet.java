package be.intec;

public class Pet{
    private String animal;

    public Pet(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return animal;
    }
}
