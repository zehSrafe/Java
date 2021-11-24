package be.intec.oef7.livingThings;

public class Fish extends Animal{
    public Fish(){
        this("Fishstick");
    }

    public Fish(String name){
        super(name);
    }

    public void move(){
        System.out.println("Fish '" + super.getName() + "' moved");
    }

    public void makeNoise(){
        System.out.println("Blub");
    }
}
